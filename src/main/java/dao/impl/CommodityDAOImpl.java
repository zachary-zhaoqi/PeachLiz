package dao.impl;

import dao.CommodityDAO;
import jdbc.JdbcOperator;
import model.Commodity;

import java.sql.SQLException;
import java.util.List;

public class CommodityDAOImpl implements CommodityDAO {

    private JdbcOperator jdbcOperator;

    public CommodityDAOImpl(JdbcOperator jdbcOperator) {
        this.jdbcOperator = jdbcOperator;
    }

    @Override
    public void removeCommodity(Commodity commodity) {

    }

    @Override
    public int getTotalRecord() throws SQLException {
        String sql="select count(*) from commodity";
        int totalRecord=jdbcOperator.queryForIntOnly(sql);
        return totalRecord;
    }

    @Override
    public List<Commodity> getBookList(int index, int pageSize) {
        return null;
    }
}
