package model;

import dao.*;
import dao.impl.*;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;

/**
 * 订单实体
 * */
public class Order {
    /**订单编号*/
    private int idorder;
    /**项目名称*/
    private String projectname;
    /**购买单位*/
    private String customer;
    /**订单备注*/
    private String notes;
    /**订单状态*/
    private String orderstatus;
    /**快递单号*/
    private String expressnumber;
    /**收货地址id*/
    private int idshippingaddress;
    /**订单时间id*/
    private int idorderdate;
    /**订单金额id*/
    private int idorderamount;
    /**
     * 订单类型
     * */
    private String ordertype;

    //以下属性方便操作
    private Shoppingaddress shoppingaddress;
    private OrderDate orderDate;
    private OrderMoney orderMoney;
    private List<OrderCommodityGroup> orderCommodityGroupList;

    public int getIdorder() {
        return idorder;
    }

    public void setIdorder(int idorder) {
        this.idorder = idorder;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getExpressnumber() {
        return expressnumber;
    }

    public void setExpressnumber(String expressnumber) {
        this.expressnumber = expressnumber;
    }

    public int getIdshippingaddress() {
        return idshippingaddress;
    }

    public void setIdshippingaddress(int idshippingaddress) {
        this.idshippingaddress = idshippingaddress;
    }

    public int getIdorderdate() {
        return idorderdate;
    }

    public void setIdorderdate(int idorderdate) {
        this.idorderdate = idorderdate;
    }

    public int getIdorderamount() {
        return idorderamount;
    }

    public void setIdorderamount(int idorderamount) {
        this.idorderamount = idorderamount;
    }

    public Shoppingaddress getShoppingaddress() {
        return shoppingaddress;
    }

    public void setShoppingaddress() throws Exception {

        ShoppingAddressDAO shoppingAddressDAO = new ShoppingAddressDAOImpl();
       this.shoppingaddress = shoppingAddressDAO.getSqlShoppingAddress(this.idshippingaddress);

    }

    public OrderDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate() throws Exception {
        OrderDateDAO orderDateDAO = new OrderDateDAOImpl();
       this.orderDate = orderDateDAO.getSqlOrderDate(this.idorderdate);
    }

    public OrderMoney getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney() throws Exception {
        OrderMoneyDAO orderMoneyDAO = new OrderMoneyDAOImpl();
        this.orderMoney=orderMoneyDAO.getSqlOrderMoney(this.idorderamount);

    }

    public List<OrderCommodityGroup> getOrderCommodityGroupList() {
        return orderCommodityGroupList;
    }

    public void setOrderCommodityGroupList() throws Exception {
        OrderCommodityGroupDAO orderCommodityGroupDAO = new OrderCommodityGroupDAOImpl();
        this.orderCommodityGroupList = orderCommodityGroupDAO.getSqlidorderCommodityGroup(this.idorder);
        for (OrderCommodityGroup orderCommodityGroup: this.getOrderCommodityGroupList()) {
            orderCommodityGroup.setOrderCommodityGroupEntryList();
        }
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }
}
