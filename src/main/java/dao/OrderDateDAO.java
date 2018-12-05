package dao;

import model.OrderDate;

import java.sql.SQLException;

public interface OrderDateDAO {
    void setOrderDate(OrderDate orderDate, int idorderdate) throws SQLException;

    OrderDate getSqlOrderDate(int idorderdate) throws Exception;
}
