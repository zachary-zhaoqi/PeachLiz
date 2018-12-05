package dao;

import jdbc.JdbcOperator;
import model.Order;

import java.awt.*;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Tool {

    JdbcOperator jdbcOperator = new JdbcOperator();
    public String turnString(String s) throws UnsupportedEncodingException {
        s=new String(s.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
        return s;
    }
    public int getTotalRecord(String table,String whereName, String whereValue) throws SQLException {
        String sql = "select count(*) from "+table+" where " + whereName + " like ?";
        return jdbcOperator.queryForIntOnly(sql, whereValue);
    }
    public List getPageList(Class javaBeanClass, String table, String whereName, String whereValue, int index, int pageSize) throws Exception {
        String sql="select * from "+table+" where "+ whereName +" like ? limit ?,? ";
        java.util.List<Object> list = new ArrayList<Object>();
        list = jdbcOperator.queryForJavaBeanList(sql,javaBeanClass, whereValue,index,pageSize);
        return list;
    }



}
