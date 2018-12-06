package dao.impl;

import dao.CommodityOperationDAO;
import jdbc.JdbcOperator;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommodityOperationDAOImpl implements CommodityOperationDAO {
    JdbcOperator jdbcOperator = new JdbcOperator();
    @Override
    public void addOperation(int idcommodity, int idoperator, String change) throws SQLException {
        String sql =  "insert into `commodityoperation` (" +
                "idcommodity,idoperator,operationdate,change)" +
                "values (?,?,?,?);";

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        jdbcOperator.executeUpdate(sql,idcommodity,idoperator,df.format(new Date()),change);
    }
}
