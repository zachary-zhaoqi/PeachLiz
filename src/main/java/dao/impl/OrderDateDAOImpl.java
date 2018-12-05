package dao.impl;

import dao.OrderDateDAO;
import dao.Tool;
import jdbc.JdbcOperator;
import model.OrderDate;

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
    public void setOrderDate(OrderDate orderDate, int idorderdate) throws SQLException {
        String sql = "update orderdate set "+
                "orderdate = ? ,dowmpaymentdate = ? ,finalpaymentdate = ? ,shipmentdate = ? ,accomplishdate = ?"+
                "where idorderdate = ?";
        jdbcOperator.executeUpdate(sql,orderDate.getOrderdate(),orderDate.getDowmpaymentdate(),orderDate.getFinalpaymentdate(),
                orderDate.getShipmentdate(),orderDate.getAccomplishdate(),idorderdate);
    }
}
