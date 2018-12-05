package dao.impl;

import dao.OrderDAO;
import dao.PageModelDAO;
import model.Commodity;
import model.OrderDate;

import java.sql.SQLException;
import java.util.List;

public class OrderDAOImpl implements OrderDAO, PageModelDAO {
    @Override
    public void setOrder(OrderDate orderDate, int idorderdate) {

    }

    @Override
    public int getTotalRecord(String whereName, String whereValue) throws SQLException {
        return 0;
    }

    @Override
    public List getPageList(String whereName, String whereValue, int index, int pageSize) throws Exception {
        return null;
    }
}
