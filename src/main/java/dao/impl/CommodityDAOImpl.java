package dao.impl;

import dao.CommodityDAO;
import jdbc.JdbcOperator;
import model.Commodity;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.List;

public class CommodityDAOImpl implements CommodityDAO {

    private JdbcOperator jdbcOperator;

    public CommodityDAOImpl() {
        this.jdbcOperator = new JdbcOperator();
    }

    @Override
    public void removeCommodity(int commodity) throws SQLException {
        String sql = "UPDATE commodity SET" +
                "status = '冻结'" +
                "where idcommodity = ?;";

        int Result = jdbcOperator.executeUpdate(sql,
                commodity
        );

    }

    @Override
    public int getTotalRecord() {
        String sql="select count(*) totalRecord from book";
        return 0;
    }

    @Override
    public List<Commodity> getBookList(int index, int pageSize) {
        return null;
    }

    @Override
    public void addCommodity(Commodity commodity) throws SQLException {

        if (commodity.getRemark() == null)
        {
            commodity.setRemark("");
        }
        if (commodity.getTopfabric() == null)
        {
            commodity.setTopfabric("");
        }
        if (commodity.getUnderfabric() == null)
        {
            commodity.setUnderfabric("");
        }
        if (commodity.getAccessoriesfabric() == null)
        {
            commodity.setAccessoriesfabric("");
        }
        if (commodity.getColor() == null)
        {
            commodity.setColor("");
        }

//        /**产品ID*/
//        private int idcommodity;
//        /**箱号*/
//        private String container;
//        /**品类*/
//        private String category;
//        /**型号*/
//        private String model;
//        /**图片*/
//        private String picture;
//        /**颜色*/
//        private String color;
//        /**面-面料型号*/
//        private String topfabric;
//        /**底-面料型号*/
//        private String underfabric;
//        /**附件面料型号*/
//        private String Accessoriesfabric;
//        /**出厂价*/
//        private double factoryprice ;
//        /**零售价*/
//        private double retailprice;
//        /**备注*/
//        private String remark;
//        /**产品状态*/
//        private String status;

        String sql = "insert into `commodity` (" +
                "container,category,category,model,picture,color,topfabric,underfabric,Accessoriesfabric,factoryprice,retailprice,remark,status)" +
                "values (?,?,?,?,?,?,?,?,?,?,?,?,?);";

        int Result = jdbcOperator.executeUpdate(sql,
                commodity.getContainer(),
                commodity.getCategory(),
                commodity.getCategory(),
                commodity.getModel(),
                commodity.getPicture(),
                commodity.getColor(),
                commodity.getTopfabric(),
                commodity.getUnderfabric(),
                commodity.getAccessoriesfabric(),
                commodity.getFactoryprice(),
                commodity.getRetailprice(),
                commodity.getRemark(),
                commodity.getStatus()
        );


    }

    @Override
    public void editCommodity(Commodity commodity) throws UnsupportedEncodingException, SQLException {
//        UPDATE pillow SET stock = stock-? WHERE idpillow = ?
        String sql = "UPDATE commodity SET" +
                "container=?,category=?,category=?,model=?,picture=?,color=?,topfabric=?," +
                "underfabric=?,Accessoriesfabric=?,factoryprice=?,retailprice=?,remark=?,status=?)" +
                "WHERE idcommodity = ?;";

        int Result = jdbcOperator.executeUpdate(sql,
                turnString(commodity.getContainer()),
                turnString(commodity.getCategory()),
                turnString(commodity.getCategory()),
                turnString(commodity.getModel()),
                turnString(commodity.getPicture()),
                turnString(commodity.getColor()),
                turnString(commodity.getTopfabric()),
                turnString(commodity.getUnderfabric()),
                turnString(commodity.getAccessoriesfabric()),
                commodity.getFactoryprice(),
                commodity.getRetailprice(),
                turnString(commodity.getRemark()),
                turnString(commodity.getStatus()),
                commodity.getIdcommodity()
        );
    }

    public String turnString(String s) throws UnsupportedEncodingException {
        s=new String(s.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
        return s;
    }
}
