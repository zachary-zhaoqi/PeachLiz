package model;
//产品组条目：产品组编号（外键约束），库存id，零售价，数量，工艺细节，备注。

public class OrderCommodityGroupEntry {
    /**
     * 产品组编号
     */
    private int idproductteam;
    /**
     * 库存id
     */
    private int idinventory;
    /**
     * 零售价
     */
    private double retailprice;
    /**
     * 数量
     */
    private int number;
    /**
     * 工艺细节
     */
    private String detail;
    /**
     * 备注
     */
    private String remark;

    public int getIdproductteam() {
        return idproductteam;
    }

    public void setRetailprice(double retailprice) {
        this.retailprice = retailprice;
    }

    public String getDetail() {
        return detail;
    }

    public int getIdinventory() {
        return idinventory;
    }

    public int getNumber() {
        return number;
    }

    public String getRemark() {
        return remark;
    }

    public double getRetailprice() {
        return retailprice;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setIdproductteam(int idproductteam) {
        this.idproductteam = idproductteam;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setIdinventory(int idinventory) {
        this.idinventory = idinventory;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
