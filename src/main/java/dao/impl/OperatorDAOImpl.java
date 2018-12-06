package dao.impl;

import dao.OperatorDAO;
import dao.PageModelDAO;
import jdbc.JdbcOperator;
import model.Operator;

import java.sql.SQLException;
import java.util.List;

public class OperatorDAOImpl implements OperatorDAO , PageModelDAO {
    JdbcOperator jdbcOperator = new JdbcOperator();
    @Override
    public Operator login(String account, String pwd) throws Exception {
        String sql = "select * from operator where account = ? and pwd = ?;";
        return (Operator) jdbcOperator.queryForJavaBean(sql,Operator.class,account,pwd);
    }

    @Override
    public void changePwd(String account, String pwd, String newPwd) throws Exception {
        String sql = "update operator set " +
                "pwd = ? " +
                "where account = ? and pwd = ?;";
        jdbcOperator.executeUpdate(sql, newPwd, account, pwd);
    }

    public void freeOperator(String account) throws SQLException {
        String sql = "update operator set " +
                "status = '冻结' "+
                "where account = ? ;";
        jdbcOperator.executeUpdate(sql, account);
    }

    @Override
    public int getTotalRecord(String whereName, Object whereValue) throws SQLException {
        String sql="select count(*) from operator where "+ whereName +" like ?";
        return jdbcOperator.queryForIntOnly(sql, whereValue);
    }

    @Override
    public List getPageList(String whereName, Object whereValue, int index, int pageSize) throws Exception {
        String sql="select * from operator where "+ whereName +" like ? limit ?,? ";
        return jdbcOperator.queryForJavaBeanList(sql,Operator.class, whereValue,index,pageSize);

    }
}
