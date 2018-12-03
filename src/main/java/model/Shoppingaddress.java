package model;

/**
 * 收货地址实体
 * 收货地址：收货地址id，收货人姓名，收货人电话，收货人QQ，收货地址；
 * */
public class Shoppingaddress {
    /**收货地址id*/
    private int idshippingaddress;
    /**联系人姓名*/
    private String contactname;
    /**联系人qq*/
    private String contactqq;
    /**联系人电话*/
    private String contacttel;
    /**收货地址*/
    private String address;

    public int getIdshippingaddress() {
        return idshippingaddress;
    }

    public String getAddress() {
        return address;
    }

    public String getContactname() {
        return contactname;
    }

    public String getContactqq() {
        return contactqq;
    }

    public String getContacttel() {
        return contacttel;
    }

    public void setIdshippingaddress(int idshippingaddress) {
        this.idshippingaddress = idshippingaddress;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public void setContactqq(String contactqq) {
        this.contactqq = contactqq;
    }

    public void setContacttel(String contacttel) {
        this.contacttel = contacttel;
    }
}
