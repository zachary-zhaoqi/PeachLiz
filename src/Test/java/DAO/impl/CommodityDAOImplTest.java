package DAO.impl;

import dao.CommodityDAO;
import dao.impl.CommodityDAOImpl;
import model.Commodity;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class CommodityDAOImplTest {
    CommodityDAO commodityDAO =new CommodityDAOImpl();
    Commodity commodity = new Commodity();

    public void resetcommodity(){
        commodity.setContainer("T1");
        commodity.setCategory("头枕");
        commodity.setModel("X1");
        commodity.setPicture("./picture");
        commodity.setFactoryprice(121);
        commodity.setRetailprice(313);
        commodity.setStatus("正常");
    }
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
    public void addCommodity() throws UnsupportedEncodingException, SQLException {

        resetcommodity();
        commodityDAO.addCommodity(commodity);
    }

    @Test
    public void editCommodity() throws UnsupportedEncodingException, SQLException {
        resetcommodity();
        commodity.setIdcommodity(11);
        commodity.setColor("黄色");
        commodityDAO.editCommodity(commodity);
    }

    @Test
    public void turnString() {
    }


}