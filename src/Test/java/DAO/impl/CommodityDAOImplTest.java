package DAO.impl;

import dao.CommodityDAO;
import dao.impl.CommodityDAOImpl;
import model.Commodity;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class CommodityDAOImplTest {
    CommodityDAO commodityDAO =new CommodityDAOImpl();
    @Test
    public void removeCommodity() throws SQLException {
        commodityDAO.removeCommodity(2);

    }

    @Test
    public void getTotalRecord() {
    }

    @Test
    public void getCommityPageList() {
    }

    @Test
    public void addCommodity() {
        Commodity commodity = new Commodity();
    }

    @Test
    public void editCommodity() {
    }

    @Test
    public void turnString() {
    }


}