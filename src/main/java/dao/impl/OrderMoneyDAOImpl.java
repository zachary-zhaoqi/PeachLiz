package dao.impl;

import dao.OrderMoneyDAO;
import jdbc.JdbcOperator;
import model.OrderMoney;

import java.sql.Connection;
import java.sql.SQLException;

public class OrderMoneyDAOImpl implements OrderMoneyDAO {
    JdbcOperator jdbcOperator = new JdbcOperator();

//    /**订单金额id*/
//    private int idorderamount;
//    /**面单总额*/
//    private double totalamount;
//    /**税金*/
//    private double taxes;
//    /**定金*/
//    private double downpayment;
//    /**实收额度*/
//    private double officialreceipts ;
    @Override
    public void setOrderMoney(OrderMoney orderMoney) throws SQLException {
        String sql = "insert into `ordermoney` (" +
                "orderMoney,taxes,downpayment,officialreceipts)" +
                "values (?,?,?,?);";
        jdbcOperator.executeUpdate(sql,orderMoney.getTotalamount(),orderMoney.getTaxes(),orderMoney.getDownpayment(),
                orderMoney.getOfficialreceipts());
    }

    @Override
    public int setOrderMoneyBackId(OrderMoney orderMoney, Connection connection) throws SQLException {
        String sql = "insert into `ordermoney` (" +
                "orderMoney,taxes,downpayment,officialreceipts)" +
                "values (?,?,?,?);";
        return jdbcOperator.executeUpdateBack(sql,connection,orderMoney.getTotalamount(),orderMoney.getTaxes(),orderMoney.getDownpayment(),
                orderMoney.getOfficialreceipts());
    }

    @Override
    public OrderMoney getSqlOrderMoney(int idorderamount) throws Exception {
        String sql = "select * from ordermoney where idorderamount=?;";
        return (OrderMoney) jdbcOperator.queryForJavaBean(sql,OrderMoney.class,idorderamount);
    }
}
