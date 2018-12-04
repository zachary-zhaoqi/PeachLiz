package model;

import dao.CommodityDAO;
import dao.impl.CommodityDAOImpl;

//库存id，产品id，尺寸，数量。
public class InventorySpecification {

    /**
     * 库存id
     */
    private int idinventory;
    /**
     * 产品id
     */
    private int idcommodity;
    /**
     * 尺寸
     */
    private String size;
    /**
     * 数量
     */
    private int number;

    //以下属性为了方便操作。
    private Commodity commodity;//库存

    public int getNumber() {
        return number;
    }

    public int getIdinventory() {
        return idinventory;
    }

    public int getIdcommodity() {
        return idcommodity;
    }

    public String getSize() {
        return size;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setIdinventory(int idinventory) {
        this.idinventory = idinventory;
    }

    public void setIdcommodity(int idcommodity) {
        this.idcommodity = idcommodity;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity() {
        CommodityDAO commodityDAO=new CommodityDAOImpl();
        this.commodity = commodityDAO.getcommodity(this.);
    }
}
