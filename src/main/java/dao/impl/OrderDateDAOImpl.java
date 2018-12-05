package dao.impl;

import dao.OrderDateDAO;
import dao.Tool;
import jdbc.JdbcOperator;
import model.OrderDate;
import model.OrderMoney;

import java.sql.Connection;
import java.sql.SQLException;

public class OrderDateDAOImpl implements OrderDateDAO {

//    /**订单时间id*/
//    private int idorderdate;
//    /**下单日期*/
//    private String orderdate;
//    /**付定价时间*/
//    private String dowmpaymentdate;
//    /**付尾款日期*/
//    private String finalpaymentdate;
//    /**发货日期*/
//    private String shipmentdate;
//    /**交易完成时间*/
//    private String accomplishdate;

    Tool tool = new Tool();
    JdbcOperator jdbcOperator = new JdbcOperator();
    @Override
    public void setOrderDate(OrderDate orderDate) throws SQLException {
        String sql = "insert into `orderdate` (" +
                "orderdate,dowmpaymentdate,finalpaymentdate,shipmentdate,accomplishdate,plandate)" +
                "values (?,?,?,?,?,?);";
        jdbcOperator.executeUpdate(sql,orderDate.getOrderdate(),orderDate.getDowmpaymentdate(),orderDate.getFinalpaymentdate(),
                orderDate.getShipmentdate(),orderDate.getAccomplishdate(),orderDate.getPlandate());
    }

    @Override
    public int setOrderDateBackId(OrderDate orderDate, Connection connection) throws SQLException {
        String sql = "insert into `orderdate` (" +
                "orderdate,dowmpaymentdate,finalpaymentdate,shipmentdate,accomplishdate,plandate)" +
                "values (?,?,?,?,?,?);";
       return jdbcOperator.executeUpdateBackId(sql,connection,orderDate.getOrderdate(),orderDate.getDowmpaymentdate(),orderDate.getFinalpaymentdate(),
                orderDate.getShipmentdate(),orderDate.getAccomplishdate(),orderDate.getPlandate());

    }

    @Override
    public OrderDate getSqlOrderDate(int idorderdate) throws Exception {
        String sql = "select * from orderdate where idorderdate=?;";
        return (OrderDate) jdbcOperator.queryForJavaBean(sql,OrderDate.class,idorderdate);
    }
}
