package model;

/**
 * 订单时间实体
 * 订单时间相关的统一存放
 * 订单时间：订单时间id，下单日期，付定价时间、付尾款日期，发货日期，交易完成时间。
 * */
public class OrderDate {

    /**订单时间id*/
    private int idorderdate;
    /**下单日期*/
    private String orderdate;
    /**付定价时间*/
    private String dowmpaymentdate;
    /**付尾款日期*/
    private String finalpaymentdate;
    /**发货日期*/
    private String shipmentdate;
    /**交易完成时间*/
    private String accomplishdate;
    /**预计提货时间*/
    private  String plandate;

    public int getIdorderdate() {
        return idorderdate;
    }

    public void setIdorderdate(int idorderdate) {
        this.idorderdate = idorderdate;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getDowmpaymentdate() {
        return dowmpaymentdate;
    }

    public void setDowmpaymentdate(String dowmpaymentdate) {
        this.dowmpaymentdate = dowmpaymentdate;
    }

    public String getFinalpaymentdate() {
        return finalpaymentdate;
    }

    public void setFinalpaymentdate(String finalpaymentdate) {
        this.finalpaymentdate = finalpaymentdate;
    }

    public String getShipmentdate() {
        return shipmentdate;
    }

    public void setShipmentdate(String shipmentdate) {
        this.shipmentdate = shipmentdate;
    }

    public String getAccomplishdate() {
        return accomplishdate;
    }

    public void setAccomplishdate(String accomplishdate) {
        this.accomplishdate = accomplishdate;
    }
}
