package dao;

import model.OrderDate;

import java.sql.Connection;
import java.sql.SQLException;

public interface OrderDateDAO {
    void setOrderDate(OrderDate orderDate) throws SQLException;

    int setOrderDateBackId(OrderDate orderDate , Connection connection) throws SQLException;

    OrderDate getSqlOrderDate(int idorderdate) throws Exception;
}
