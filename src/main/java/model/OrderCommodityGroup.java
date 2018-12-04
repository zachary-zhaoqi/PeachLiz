package model;

/**
 *订单商品组：订单商品组id,订单编号（外键约束），产品组编号，产品组名称，备注，合计。
 * */
public class OrderCommodityGroup {

    /**
     * 订单商品组id
     */
    private int idgrop;
    /**订单编号*/
    private int idorder;
    /**产品组名称*/
    private String productname;
    /**备注*/
    private String remark;
    /**合计*/
    private double total;

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
}
