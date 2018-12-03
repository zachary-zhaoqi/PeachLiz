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
}
