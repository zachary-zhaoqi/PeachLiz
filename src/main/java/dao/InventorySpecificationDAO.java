package dao;

import model.Commodity;
import model.InventorySpecification;

import java.sql.SQLException;
import java.util.List;

public interface InventorySpecificationDAO {
    /**
     * 获取数据库总记录数
     * @param whereName
     * @param whereValue
     */
    int getTotalRecord(String whereName, int whereValue) throws SQLException;

    /**
     * @param whereName
     * @param whereValue
     * @param index 当前索引  即从哪个数据开始查
     * @param pageSize 页面大小  即查多少条数据
     */
    List<InventorySpecification> getPageList(String whereName, int whereValue, int index, int pageSize) throws Exception;

    InventorySpecification getSqlinventorySpecification(int idinventory) throws Exception;

    void addInventorySpecification(int idcommodity, String specification, int number) throws SQLException;
}
