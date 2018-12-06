package dao;

import model.Order;

import java.sql.SQLException;

public interface OrderDAO {
    void addOrder(Order order) throws SQLException;


    /**
     * @param whereName 条件名
     * @param whereValue 条件值
     *                   通过条件查询得到订单实体，记得装配完整。
     * */
    Order getOrder(String whereName, String whereValue) throws Exception;

    /**
     * 下一个状态，不能前进，返回错误
     * @param idorder 订单ID
     * @throws Exception
     */
    void nextStatus(int idorder) throws Exception;

    /**
     * 前一个状态，不能后退，返回错误
     * @param idorder 订单ID
     */
    void frontStatus(int idorder) throws Exception;

}
