package model;

/**
 * 折扣实体
 * */
public class Discount {

    private int iddiscount;
    /**产品ID*/
    private int idcommodity;
    /**折扣率*/
    private float discount;
    /**状态(生效/失效)*/
    private boolean status;

    public int getIddiscount() {
        return iddiscount;
    }

    public void setIddiscount(int iddiscount) {
        this.iddiscount = iddiscount;
    }

    public int getIdcommodity() {
        return idcommodity;
    }

    public void setIdcommodity(int idcommodity) {
        this.idcommodity = idcommodity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
