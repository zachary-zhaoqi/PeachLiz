package dao.impl;
import model.Order;
import model.OrderDate;

import java.sql.SQLException;
import java.util.List;
import dao.*;
import jdbc.DataSourceConfig;
import jdbc.JdbcOperator;
import javax.sql.DataSource;
import java.sql.Connection;

public class OrderDAOImpl implements OrderDAO, PageModelDAO {
    JdbcOperator jdbcOperator = new JdbcOperator();
    @Override
    public void setOrder(OrderDate orderDate, int idorderdate) {

    }

    @Override
    public int getTotalRecord(String whereName, Object whereValue) throws SQLException {
        return 0;
    }

    @Override
    public List getPageList(String whereName, Object whereValue, int index, int pageSize) throws Exception {
        return null;
    }

    @Override
    public void addOrder(Order order) throws SQLException {
        DataSource dataSource;
        Connection connection = null;
        OrderDateDAO orderDateDAO = new OrderDateDAOImpl();
        OrderMoneyDAO  orderMoneyDAO = new OrderMoneyDAOImpl();
        ShoppingAddressDAO shoppingAddressDAO = new ShoppingAddressDAOImpl();
        OrderCommodityGroupDAO orderCommodityGroupDAO = new OrderCommodityGroupDAOImpl();
        try {
            dataSource = DataSourceConfig.getDataSource();
            connection =dataSource.getConnection();
            connection.setAutoCommit(false);

            order.setIdorderdate(orderDateDAO.setOrderDateBackId(order.getOrderDate(),connection)+1);
            order.setIdorderamount(orderMoneyDAO.setOrderMoneyBackId(order.getOrderMoney(),connection)+1);
            order.setIdshippingaddress(shoppingAddressDAO.setShoppingAddressBackId(order.getShoppingaddress(),connection)+1);

            orderCommodityGroupDAO.setidorderCommodityGroupListBack(order.getOrderCommodityGroupList(),connection);

            String sql = "insert into `order` (" +
                    "projectname,customer,notes,orderstatus,expressnumber,idshippingaddress,idorderdate,idorderamount)" +
                    "values (?,?,?,?,?,?,?,?);";
            jdbcOperator.executeUpdateBack(sql,connection,order.getProjectname(),order.getCustomer(),order.getNotes(),
                    order.getOrderstatus(),order.getExpressnumber(),order.getIdshippingaddress(),order.getIdorderdate(),order.getIdorderamount());

            connection.commit();
            connection.setAutoCommit(true);
            connection.close();
        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            connection.close();
        }
    }
}
