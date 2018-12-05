package dao.impl;

import dao.OperatorDAO;
import jdbc.JdbcOperator;
import model.Operator;

public class OperatorDAOImpl implements OperatorDAO {
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
}
