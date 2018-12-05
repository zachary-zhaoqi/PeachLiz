package dao.impl;

import dao.CommodityDAO;
import jdbc.JdbcOperator;
import model.Commodity;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CommodityDAOImpl implements CommodityDAO {

    private JdbcOperator jdbcOperator;

    public CommodityDAOImpl() {
        this.jdbcOperator = new JdbcOperator();
    }

    public CommodityDAOImpl(JdbcOperator jdbcOperator) {
        this.jdbcOperator = jdbcOperator;
    }

    @Override
    public void removeCommodity(int commodity) throws SQLException {
        String sql = "UPDATE commodity SET " +
                "status = '冻结'" +
                "where idcommodity = ?;";

        jdbcOperator.executeUpdate(sql, commodity);

    }

    @Override
    public int getTotalRecord(String whereName, String whereValue) throws SQLException {
        String sql="select count(*) from commodity where "+ whereName +" like ?";
        return jdbcOperator.queryForIntOnly(sql, whereValue);
    }

    @Override
    public List<Commodity> getPageList(String whereName, String whereValue, int index, int pageSize) throws Exception {
        String sql="select * from commodity where "+ whereName +" like ? limit ?,? ";
        return jdbcOperator.queryForJavaBeanList(sql,Commodity.class, whereValue,index,pageSize);
    }

    @Override
    public void addCommodity(Commodity commodity) throws SQLException, UnsupportedEncodingException {

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

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        if (commodity.getCreterdate() == null)
        {
            commodity.setCreterdate(df.format(new Date()));// new Date()为获取当前系统时间
        }

        String sql = "insert into `commodity` (" +
                "container,category,model,picture,color,topfabric,underfabric,Accessoriesfabric,factoryprice,retailprice,remark,status,creterdate)" +
                "values (?,?,?,?,?,?,?,?,?,?,?,?,?);";

        jdbcOperator.executeUpdate(sql,
                turnString(commodity.getContainer()),
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
                commodity.getCreterdate()
        );
        // TODO: 2018/12/4 产品操作记录表
    }

    @Override
    public void editCommodity(Commodity commodity) throws UnsupportedEncodingException, SQLException {
//        UPDATE pillow SET stock = stock-? WHERE idpillow = ?

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

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        if (commodity.getCreterdate() == null)
        {
            commodity.setCreterdate(df.format(new Date()));// new Date()为获取当前系统时间
        }



        String sql = "UPDATE `commodity` SET " +
                "container=?,category=?,model=?,picture=?,color=?," +
                "topfabric=?,underfabric=?,Accessoriesfabric=?,factoryprice=?,retailprice=?," +
                "remark=?,status=?,creterdate=? " +
                "WHERE idcommodity=?;";

        int Result = jdbcOperator.executeUpdate(sql,
                turnString(commodity.getContainer()),
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
                commodity.getCreterdate(),
                commodity.getIdcommodity()
        );
    }

    @Override
    public Commodity getcommodity(int idcommodity) throws Exception {

        String sql = "select * from commodity where idcommodity = ?";

        Commodity commodity = (Commodity) jdbcOperator.queryForJavaBean(sql,Commodity.class,idcommodity);

        return commodity;
    }

    @Override
    public int getId(String name, String value) throws Exception {
        String sql = "select * from commodity where "+ name +" = ?";
        Commodity commodity = (Commodity) jdbcOperator.queryForJavaBean(sql,Commodity.class,value);
        return commodity.getIdcommodity();
    }

    public String turnString(String s) throws UnsupportedEncodingException {
        s=new String(s.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
        return s;
    }
}
