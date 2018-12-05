package dao;

import model.OrderDate;

import java.sql.Connection;
import java.sql.SQLException;

public interface OrderDateDAO {

    /**
     *  todo 陈亮 写写文档注释，改个名字
     */
    void setOrderDate(OrderDate orderDate) throws SQLException;

    /**
     * todo 陈亮 写写文档注释，改个名字
     * */
    int setOrderDateBackId(OrderDate orderDate , Connection connection) throws SQLException;

    OrderDate getSqlOrderDate(int idorderdate) throws Exception;
}
