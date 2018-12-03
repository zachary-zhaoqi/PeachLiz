package model;
//id,账户，姓名，密码,状态
public class Operator {

    /**操作员ID*/
    private int idoperator;
    /**账户*/
    private String account;
    /**密码*/
    private String pwd;
    /**姓名*/
    private String name;
    /**状态*/
    private String status;

    public String getStatus() {
        return status;
    }

    public int getIdoperator() {
        return idoperator;
    }

    public String getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setIdoperator(int idoperator) {
        this.idoperator = idoperator;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
