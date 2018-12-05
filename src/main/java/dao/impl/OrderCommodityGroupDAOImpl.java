package dao.impl;

import dao.OrderCommodityGroupDAO;
import jdbc.JdbcOperator;
import model.OrderCommodityGroup;

import java.sql.SQLException;
import java.util.List;

public class OrderCommodityGroupDAOImpl implements OrderCommodityGroupDAO {
    JdbcOperator jdbcOperator = new JdbcOperator();
    @Override
    public List<OrderCommodityGroup> getSqlidorderCommodityGroup(int idorder) throws Exception {
        String sql = "select * from ordercommoditygroup where idorder=?;";
        return jdbcOperator.queryForJavaBeanList(sql,OrderCommodityGroup.class,idorder);
    }

    @Override
    public void setidorderCommodityGroupList(List<OrderCommodityGroup> orderCommodityGroupList) throws SQLException {
        String sql = "insert into `ordercommoditygroup` (" +
                "idorder,productname,remark,total,picture)" +
                "values (?,?,?,?,?);";
        for (OrderCommodityGroup  odeerCommodityGroup:orderCommodityGroupList
             ) {
            jdbcOperator.executeUpdate(sql,odeerCommodityGroup.getIdorder(),odeerCommodityGroup.getProductname(),odeerCommodityGroup.getRemark(),
                    odeerCommodityGroup.getTotal(),odeerCommodityGroup.getPicture());
        }

    }
}
