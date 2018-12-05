package model;

import dao.OrderCommodityGroupEntryDAO;
import dao.impl.OrderCommodityGroupEntryDAOImpl;

import java.util.List;

/**
 *订单商品组
 * */
public class OrderCommodityGroup {

    /**
     * 订单商品组id
     */
    private int idgrop;
    /**订单编号*/
    private int idorder;
    /**商品组名称*/
    private String productname;
    /**备注*/
    private String remark;
    /**合计*/
    private double total;
    /**商品组图片*/
    private String picture;


    //以下属性方便操作
    List<OrderCommodityGroupEntry> orderCommodityGroupEntryList;

    public int getIdgrop() {
        return idgrop;
    }

    public void setIdgrop(int idgrop) {
        this.idgrop = idgrop;
    }

    public int getIdorder() {
        return idorder;
    }

    public void setIdorder(int idorder) {
        this.idorder = idorder;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<OrderCommodityGroupEntry> getOrderCommodityGroupEntryList() {
        return orderCommodityGroupEntryList;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    public void setOrderCommodityGroupEntryList() throws Exception {
        OrderCommodityGroupEntryDAO orderCommodityGroupEntryDAO = new OrderCommodityGroupEntryDAOImpl();
        this.orderCommodityGroupEntryList =  orderCommodityGroupEntryDAO.getSqlorderCommodityGroupEntryList(this.idgrop);
    }

}
