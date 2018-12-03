package model;
//操作id,库存id，操作员id，操作时间，改动数量。
public class InventoryOperation {
    /**操作id*/
    private int idoperation;
    /**库存id*/
    private int idinventory;
    /**操作员id*/
    private int idoperator;
    /**操作时间*/
    private String operationdate;
    /**改动数量*/
    private int change;

    public int getIdoperator() {
        return idoperator;
    }

    public int getIdinventory() {
        return idinventory;
    }

    public int getChange() {
        return change;
    }

    public int getIdoperation() {
        return idoperation;
    }

    public String getOperationdate() {
        return operationdate;
    }

    public void setIdoperator(int idoperator) {
        this.idoperator = idoperator;
    }

    public void setIdinventory(int idinventory) {
        this.idinventory = idinventory;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public void setIdoperation(int idoperation) {
        this.idoperation = idoperation;
    }

    public void setOperationdate(String operationdate) {
        this.operationdate = operationdate;
    }
}
