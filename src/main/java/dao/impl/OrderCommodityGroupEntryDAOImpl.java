package dao.impl;

import dao.OrderCommodityGroupEntryDAO;
import jdbc.JdbcOperator;
import model.OrderCommodityGroupEntry;

import java.util.List;

public class OrderCommodityGroupEntryDAOImpl implements OrderCommodityGroupEntryDAO {
    JdbcOperator jdbcOperator = new JdbcOperator();
    @Override
    public List<OrderCommodityGroupEntry> getSqlorderCommodityGroupEntryList(int idgrop) throws Exception {
        String sql = "select * from shippingaddress where idshippingaddress=?;";
        return  jdbcOperator.queryForJavaBeanList(sql,OrderCommodityGroupEntry.class,idgrop);
    }
}
