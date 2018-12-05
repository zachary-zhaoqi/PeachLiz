package dao.impl;

import dao.OrderMoneyDAO;
import jdbc.JdbcOperator;
import model.OrderMoney;

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
    public void setOrderMoney(OrderMoney orderMoney, int idorderamount) throws SQLException {
        String sql = "update ordermoney set "+
                "totalamount = ? ,taxes = ? ,downpayment = ? ,officialreceipts = ? "+
                "where idorderamount = ?";
        jdbcOperator.executeUpdate(sql,orderMoney.getTotalamount(),orderMoney.getTaxes(),orderMoney.getDownpayment(),
                orderMoney.getOfficialreceipts(),idorderamount);
    }

    @Override
    public OrderMoney getSqlOrderMoney(int idorderamount) throws Exception {
        String sql = "select * from ordermoney where idorderamount=?;";
        return (OrderMoney) jdbcOperator.queryForJavaBean(sql,OrderMoney.class,idorderamount);
    }
}
