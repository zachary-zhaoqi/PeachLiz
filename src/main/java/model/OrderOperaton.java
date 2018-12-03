package model;
//订单操作细则：订单id，操作员id，改变时间，改变订单状态。
public class OrderOperaton {
    /**操作id*/
    private int idoperation;
    /**订单id*/
    private int idorder;
    /**操作员id*/
    private int idoperator;
    /**操作时间*/
    private String operationdate;
    /**改变订单状态*/
    private String change;

    public int getIdoperator() {
        return idoperator;
    }

    public int getIdorder() {
        return idorder;
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

    public void setIdorder(int idorder) {
        this.idorder = idorder;
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
