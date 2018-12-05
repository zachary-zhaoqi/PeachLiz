package model;
//产品：产品id，品类，型号，图片，颜色，规格，面-面料型号，底-面料型号，出厂价，零售价，备注，产品状态。

public class Commodity {
    /**产品ID,自增长*/
    private int idcommodity;
    /**箱号*/
    private String container;
    /**品类*/
    private String category;
    /**型号*/
    private String model;// TODO: 2018/12/5 数据库设为唯一值
    /**图片*/
    private String picture;
    /**颜色，可以为null*/
    private String color;
    /**顶面面料型号，可以为null*/
    private String topfabric;
    /**底面面料型号，可以为null*/
    private String underfabric;
    /**附件面料型号，可以为null*/
    private String accessoriesfabric;
    /**出厂价*/
    private double factoryprice ;
    /**零售价*/
    private double retailprice;
    /**备注，可以为null*/
    private String remark;
    /**产品状态*/
    private String status;
    /**添加时间，可以为null*/
    private String creterdate;

    //以下属性为了方便操作。


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRemark() {
        return remark;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getColor() {
        return color;
    }

    public double getFactoryprice() {
        return factoryprice;
    }

    public String getPicture() {
        return picture;
    }
    public double getRetailprice() {
        return retailprice;
    }

    public String getStatus() {
        return status;
    }

    public String getTopfabric() {
        return topfabric;
    }

    public String getUnderfabric() {
        return underfabric;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setFactoryprice(double factoryprice) {
        this.factoryprice = factoryprice;
    }

    public void setRetailprice(double retailprice) {
        this.retailprice = retailprice;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTopfabric(String topfabric) {
        this.topfabric = topfabric;
    }

    public void setUnderfabric(String underfabric) {
        this.underfabric = underfabric;
    }

    public int getIdcommodity() {
        return idcommodity;
    }

    public void setIdcommodity(int idcommodity) {
        this.idcommodity = idcommodity;
    }

    public String getAccessoriesfabric() {
        return accessoriesfabric;
    }

    public void setAccessoriesfabric(String accessoriesfabric) {
        this.accessoriesfabric = accessoriesfabric;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public String getCreterdate() {
        return creterdate;
    }

    public void setCreterdate(String creterdate) {
        this.creterdate = creterdate;
    }
}
