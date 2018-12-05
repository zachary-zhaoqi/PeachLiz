package dao.impl;
import dao.InventorySpecificationDAO;
import dao.PageModelDAO;
import jdbc.JdbcOperator;
import model.InventorySpecification;
import java.sql.SQLException;
import java.util.List;

public class InventorySpecificationDaOImpl implements InventorySpecificationDAO, PageModelDAO {
    
    JdbcOperator jdbcOperator = new JdbcOperator();

    @Override
    public InventorySpecification getSqlinventorySpecification(int idinventory) throws Exception {
        String sql = "select * from inventoryspecification where idinventory=?;";
        return (InventorySpecification) jdbcOperator.queryForJavaBean(sql,InventorySpecification.class,idinventory);
    }

    @Override
    public void addInventorySpecification(int idcommodity, String specification, int number) throws SQLException {
        String sql =  "insert into `inventoryspecification` (" +
                "idcommodity,size,number)" +
                "values (?,?,?);";
        jdbcOperator.executeUpdate(sql,idcommodity,specification,number);
    }

    @Override
    public int getTotalRecord(String whereName, Object whereValue) throws SQLException {
        String sql="select count(*) from inventoryspecification where "+ whereName +" = ?";
        return jdbcOperator.queryForIntOnly(sql, whereValue);
    }

    @Override
    public List getPageList(String whereName, Object whereValue, int index, int pageSize) throws Exception {
        String sql="select * from inventoryspecification where "+ whereName +" = ? limit ?,? ";
        List<InventorySpecification> list = jdbcOperator.queryForJavaBeanList(sql, InventorySpecification.class, whereValue, index, pageSize);
        for (InventorySpecification i :list) {
            i.setCommodity();
        }
        return list;
    }
}
