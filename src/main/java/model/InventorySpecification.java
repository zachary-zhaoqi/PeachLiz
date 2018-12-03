package model;
//库存id，产品id，尺寸，数量。
public class InventorySpecification {

    /**
     * 库存id
     */
    private int idinventory;
    /**
     * 产品id
     */
    private int idproduct;
    /**
     * 尺寸
     */
    private String size;
    /**
     * 数量
     */
    private int number;

    public int getNumber() {
        return number;
    }

    public int getIdinventory() {
        return idinventory;
    }

    public int getIdproduct() {
        return idproduct;
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

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
