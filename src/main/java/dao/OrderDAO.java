package dao;

import model.Order;
import model.OrderDate;

import java.sql.SQLException;
import java.util.List;

public interface OrderDAO {
    void setOrder(OrderDate orderDate, int idorderdate);

    List getOrderList(String status );

    void addOrder(Order order) throws SQLException;
}
