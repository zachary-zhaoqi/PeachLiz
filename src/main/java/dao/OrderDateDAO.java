package dao;

import model.OrderDate;

import java.sql.Connection;
import java.sql.SQLException;

public interface OrderDateDAO {

    /**
     *  添加订单日期表
     */
    void addOrderDate(OrderDate orderDate) throws SQLException;

    /**
     * 事务，添加订单日期表，并返回ID
     * */
    int addOrderDateBackId(OrderDate orderDate , Connection connection) throws SQLException;

    OrderDate getSqlOrderDate(int idorderdate) throws Exception;
}
