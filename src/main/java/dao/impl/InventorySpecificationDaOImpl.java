package dao.impl;
import dao.InventorySpecificationDAO;
import jdbc.JdbcOperator;
import model.InventorySpecification;
import java.sql.SQLException;
import java.util.List;

public class InventorySpecificationDaOImpl implements InventorySpecificationDAO {
    JdbcOperator jdbcOperator = new JdbcOperator();
    @Override
    public int getTotalRecord(String whereName, String whereValue) throws SQLException {
        String sql="select count(*) from inventoryspecification where "+ whereName +" like ?";
        return jdbcOperator.queryForIntOnly(sql, whereValue);
    }

    @Override
    public List<InventorySpecification> getPageList(String whereName, String whereValue, int index, int pageSize) throws Exception {
        String sql="select * from inventoryspecification where "+ whereName +" like ? limit ?,? ";
        return jdbcOperator.queryForJavaBeanList(sql,InventorySpecification.class, whereValue,index,pageSize);
    }

    @Override
    public InventorySpecification getSqlinventorySpecification(int idinventory) throws Exception {
        String sql = "select * from inventoryspecification where idinventory=?;";
        return (InventorySpecification) jdbcOperator.queryForJavaBean(sql,InventorySpecification.class,idinventory);
    }
}