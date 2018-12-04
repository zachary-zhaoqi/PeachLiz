package model;
//产品操作细则：产品id，操作员id，改变时间，改变产品状态。
public class CommodityOperation {
    /**操作id*/
    private int idoperation;
    /**产品id*/
    private int idcommodity;
    /**操作员id*/
    private int idoperator;
    /**操作时间*/
    private String operationdate;
    /**改变产品状态*/
    private String change;

    public int getIdoperator() {
        return idoperator;
    }

    public int getIdcommodity() {
        return idcommodity;
    }

    public String getChange() {
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

    public void setIdcommodity(int idcommodity) {
        this.idcommodity = idcommodity;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public void setIdoperation(int idoperation) {
        this.idoperation = idoperation;
    }

    public void setOperationdate(String operationdate) {
        this.operationdate = operationdate;
    }
}
