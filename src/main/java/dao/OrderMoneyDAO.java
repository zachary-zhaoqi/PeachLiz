package dao;

import model.OrderMoney;

import java.sql.SQLException;

public interface OrderMoneyDAO {
    void setOrderMoney(OrderMoney orderMoney) throws SQLException;

    OrderMoney getSqlOrderMoney(int idorderamount) throws Exception;
}
