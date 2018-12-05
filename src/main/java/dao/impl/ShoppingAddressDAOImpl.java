package dao.impl;

import dao.ShoppingAddressDAO;
import dao.Tool;
import jdbc.JdbcOperator;
import model.Shoppingaddress;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

public class ShoppingAddressDAOImpl implements ShoppingAddressDAO {
    JdbcOperator jdbcOperator = new JdbcOperator();
    Tool tool = new Tool();
    @Override
    public Shoppingaddress setShoppingAddress(Shoppingaddress shoppingaddress) {

        String sql = "select * from shoppingaddress where idshoppingaddress";
        return null;
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
    @Override
    public void setShoppingAddress(Shoppingaddress shoppingaddress, int idshoppingaddress) throws UnsupportedEncodingException, SQLException {
        String sql = "update shoppingaddress set "+
                "contactname = ? ,contactqq = ? ,contacttel = ? ,address = ? "+
                "where idshoppingaddress = ?";
        jdbcOperator.executeUpdate(sql,shoppingaddress.getContactname(),shoppingaddress.getContactqq(),shoppingaddress.getContacttel(),
               shoppingaddress.getAddress(),idshoppingaddress);
    }
}