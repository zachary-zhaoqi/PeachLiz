package dao.impl;

import dao.CommodityDAO;
import jdbc.JdbcOperator;
import model.Commodity;

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
    public int getTotalRecord() {
        String sql="select count(*) totalRecord from book";
        return 0;
    }

    @Override
    public List<Commodity> getBookList(int index, int pageSize) {
        return null;
    }
}
