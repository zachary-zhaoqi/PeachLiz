package model;
/**
 * 订单金额相关实体
 * 订单金额：订单金额id，面单总额，税金，定金，实收额度；
 * */
public class OrderMoney {

    /**订单金额id*/
    private int idorderamount;
    /**面单总额*/
    private double totalamount;
    /**税金*/
    private double taxes;
    /**定金*/
    private double downpayment;
    /**实收额度*/
    private double officialreceipts ;

    public double getDownpayment() {
        return downpayment;
    }

    public void setDownpayment(double downpayment) {
        this.downpayment = downpayment;
    }

    public int getIdorderamount() {
        return idorderamount;
    }

    public void setIdorderamount(int idorderamount) {
        this.idorderamount = idorderamount;
    }

    public void setOfficialreceipts(double officialreceipts) {
        this.officialreceipts = officialreceipts;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public void setTotalamount(double totalamount) {
        this.totalamount = totalamount;
    }

    public double getOfficialreceipts() {
        return officialreceipts;
    }

    public double getTaxes() {
        return taxes;
    }

    public double getTotalamount() {
        return totalamount;
    }

}
