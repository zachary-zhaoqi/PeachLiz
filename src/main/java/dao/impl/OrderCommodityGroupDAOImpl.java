package dao.impl;

import dao.OrderCommodityGroupDAO;
import jdbc.JdbcOperator;
import model.OrderCommodityGroup;

import java.util.List;

public class OrderCommodityGroupDAOImpl implements OrderCommodityGroupDAO {
    JdbcOperator jdbcOperator = new JdbcOperator();
    @Override
    public List<OrderCommodityGroup> getSqlidorderCommodityGroup(int idorder) throws Exception {
        String sql = "select * from ordercommoditygroup where idorder=?;";
        return jdbcOperator.queryForJavaBeanList(sql,OrderCommodityGroup.class,idorder);
    }
}
