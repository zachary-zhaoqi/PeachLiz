package dao;

import model.Order;
import model.OrderDate;

import java.util.List;

public interface OrderDAO {
    void setOrder(OrderDate orderDate, int idorderdate);

    List getOrderList(String status );

    void addOrder(Order order);
}
