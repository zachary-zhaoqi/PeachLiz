package dao.impl;
import dao.*;
import jdbc.DataSourceConfig;
import jdbc.JdbcOperator;
import model.Order;
import model.OrderCommodityGroup;
import model.OrderCommodityGroupEntry;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OrderDAOImpl implements OrderDAO, PageModelDAO {
    JdbcOperator jdbcOperator = new JdbcOperator();

    @Override
    public int getTotalRecord(String whereName, Object whereValue) throws SQLException {
        String sql="select count(*) from peachliz.`order` where "+ whereName+" like ?;";
        return jdbcOperator.queryForIntOnly(sql, whereValue);
    }

    @Override
    public List getPageList(String whereName, Object whereValue, int index, int pageSize) throws Exception {
        String sql="select * from peachliz.`order` where "+ whereName +" like ? limit ?,? ";
        List<Order> orderList = jdbcOperator.queryForJavaBeanList(sql,Order.class, whereValue,index,pageSize);
        if(null!=orderList) {
            for (Order od : orderList) {
                od.setOrderCommodityGroupList();
                od.setOrderMoney();
                od.setOrderDate();
                od.setShoppingaddress();
            }
        }
        return orderList;
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

            order.setIdorderdate(orderDateDAO.addOrderDateBackId(order.getOrderDate(),connection)+1);
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

    @Override
    public Order getOrder(String whereName, String whereValue) throws Exception {
        String sql = "select * from order where "+whereName+" = ?";
        Order order = (Order) jdbcOperator.queryForJavaBean(sql,Order.class,whereValue);
        order.setShoppingaddress();
        order.setOrderDate();
        order.setOrderMoney();
        order.setOrderCommodityGroupList();
        return order;

    }

}
