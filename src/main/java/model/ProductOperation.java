package model;
//产品操作细则：产品id，操作员id，改变时间，改变产品状态。
public class ProductOperation {
    /**操作id*/
    private int idoperation;
    /**库存id*/
    private int idproduct;
    /**操作员id*/
    private int idoperator;
    /**操作时间*/
    private int operationdate;
    /**改变产品状态*/
    private int change;

    public int getIdoperator() {
        return idoperator;
    }

    public int getIdproduct() {
        return idproduct;
    }

    public int getChange() {
        return change;
    }

    public int getIdoperation() {
        return idoperation;
    }

    public int getOperationdate() {
        return operationdate;
    }

    public void setIdoperator(int idoperator) {
        this.idoperator = idoperator;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public void setIdoperation(int idoperation) {
        this.idoperation = idoperation;
    }

    public void setOperationdate(int operationdate) {
        this.operationdate = operationdate;
    }
}
