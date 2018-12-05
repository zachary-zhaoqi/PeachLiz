package dao;

import model.OrderMoney;

import java.sql.SQLException;

public interface OrderMoneyDAO {
    void setOrderMoney(OrderMoney orderMoney, int idorderamount) throws SQLException;

    OrderMoney getSqlOrderMoney(int idorderamount) throws Exception;
}
