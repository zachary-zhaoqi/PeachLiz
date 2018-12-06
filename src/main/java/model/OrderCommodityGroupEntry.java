package model;

import dao.InventorySpecificationDAO;
import dao.impl.InventorySpecificationDaOImpl;

public class OrderCommodityGroupEntry {


    /**
     * 产品条目编号
     */
    private int idproductteam;
    /**
     * 订单商品组id
     */
    private int idgrop;
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

    //以下属性方便操作
    InventorySpecification inventorySpecification;

    public int getIdgrop() {
        return idgrop;
    }

    public void setIdgrop(int idgrop) {
        this.idgrop = idgrop;
    }

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

    public InventorySpecification getInventorySpecification() {
        return inventorySpecification;
    }

    public void setInventorySpecification() throws Exception {
        InventorySpecificationDAO inventorySpecificationDAO = new InventorySpecificationDaOImpl();
        this.inventorySpecification = inventorySpecificationDAO.getSqlinventorySpecification(this.idinventory);
        if (null!=inventorySpecification){
            this.inventorySpecification.setCommodity();
        }

    }
}
