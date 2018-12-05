package dao;

import model.Shoppingaddress;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;

public interface ShoppingAddressDAO {
    void setShoppingAddress(Shoppingaddress shoppingaddress) throws SQLException;

    void updateShoppingAddress(Shoppingaddress shoppingaddress, int idshoppingaddress) throws UnsupportedEncodingException, SQLException;

    Shoppingaddress getSqlShoppingAddress(int idshippingaddress) throws Exception;

    int setShoppingAddressBackId(Shoppingaddress shoppingaddress, Connection connection) throws SQLException;
}
