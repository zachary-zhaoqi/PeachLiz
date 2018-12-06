package dao.impl;

import dao.InventoryOperationDAO;
import jdbc.JdbcOperator;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InventoryOperationDAOImpl implements InventoryOperationDAO {
    JdbcOperator jdbcOperator = new JdbcOperator();
    @Override
    public void addOperation(int idinventory, int idoperator, int change) throws SQLException {
        String sql =  "insert into `inventoryoperation` (" +
                "idinventory,idoperator,operationdate,change)" +
                "values (?,?,?,?);";

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        jdbcOperator.executeUpdate(sql,idinventory,idoperator,df.format(new Date()),change);

    }
}
