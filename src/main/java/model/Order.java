package model;

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
    private String idshippingaddress;
    /**订单时间id*/
    private int idorderdate;
    /**订单金额id*/
    private int idordermoney;

    //以下属性方便操作
    Shoppingaddress shoppingaddress;
    OrderDate orderDate;
    OrderMoney orderMoney;
    private OrderCommodityGroupEntry[] orderentries;

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

    public String getIdshippingaddress() {
        return idshippingaddress;
    }

    public void setIdshippingaddress(String idshippingaddress) {
        this.idshippingaddress = idshippingaddress;
    }

    public int getIdorderdate() {
        return idorderdate;
    }

    public void setIdorderdate(int idorderdate) {
        this.idorderdate = idorderdate;
    }

    public int getIdordermoney() {
        return idordermoney;
    }

    public void setIdordermoney(int idordermoney) {
        this.idordermoney = idordermoney;
    }
}
