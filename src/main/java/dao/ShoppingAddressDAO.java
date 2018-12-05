package dao;

import model.Shoppingaddress;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

public interface ShoppingAddressDAO {
    Shoppingaddress setShoppingAddress(Shoppingaddress shoppingaddress);

    void setShoppingAddress(Shoppingaddress shoppingaddress, int idshoppingaddress) throws UnsupportedEncodingException, SQLException;

    Shoppingaddress getSqlShoppingAddress(int idshippingaddress) throws Exception;
}
