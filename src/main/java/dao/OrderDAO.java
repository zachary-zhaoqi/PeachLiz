package dao;

import model.Order;
import model.OrderDate;

import java.sql.SQLException;
import java.util.List;

public interface OrderDAO {
    void setOrder(OrderDate orderDate, int idorderdate);

    void addOrder(Order order) throws SQLException;
}
