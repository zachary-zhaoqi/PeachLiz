package dao.impl;

import dao.ShoppingAddressDAO;
import dao.Tool;
import jdbc.JdbcOperator;
import model.OrderDate;
import model.Shoppingaddress;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

public class ShoppingAddressDAOImpl implements ShoppingAddressDAO {
    JdbcOperator jdbcOperator = new JdbcOperator();
    Tool tool = new Tool();
    @Override
    public void setShoppingAddress(Shoppingaddress shoppingaddress) throws SQLException {

        String sql = "insert into `shoppingaddress` (" +
                "contactname,contactqq,contacttel,address,wechat)" +
                "values (?,?,?,?,?);";
        jdbcOperator.executeUpdate(sql,shoppingaddress.getContactname(),shoppingaddress.getContactqq(),shoppingaddress.getContacttel(),
                shoppingaddress.getAddress(),shoppingaddress.getWechat());

    }
//    private int idshippingaddress;
//    /**联系人姓名*/
//    private String contactname;
//    /**联系人qq*/
//    private String contactqq;
//    /**联系人电话*/
//    private String contacttel;
//    /**收货地址*/
//    private String address;
//    /**微信*/
//    private String wechat;
    @Override
    public void updateShoppingAddress(Shoppingaddress shoppingaddress, int idshoppingaddress) throws UnsupportedEncodingException, SQLException {
        String sql = "update shoppingaddress set "+
                "contactname = ? ,contactqq = ? ,contacttel = ? ,address = ? "+
                "where idshoppingaddress = ?";
        jdbcOperator.executeUpdate(sql,shoppingaddress.getContactname(),shoppingaddress.getContactqq(),shoppingaddress.getContacttel(),
               shoppingaddress.getAddress(),idshoppingaddress);
    }

    @Override
    public Shoppingaddress getSqlShoppingAddress(int idshippingaddress) throws Exception {
        String sql = "select * from shippingaddress where idshippingaddress=?;";
        return (Shoppingaddress) jdbcOperator.queryForJavaBean(sql,Shoppingaddress.class,idshippingaddress);
    }
}
