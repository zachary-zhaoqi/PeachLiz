package dao;

import model.OrderMoney;

import java.sql.Connection;
import java.sql.SQLException;

public interface OrderMoneyDAO {
    void setOrderMoney(OrderMoney orderMoney) throws SQLException;
    int setOrderMoneyBackId(OrderMoney orderMoney, Connection connection) throws SQLException;

    OrderMoney getSqlOrderMoney(int idorderamount) throws Exception;
}
