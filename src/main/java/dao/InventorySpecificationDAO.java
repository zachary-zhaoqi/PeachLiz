package dao;

import model.Commodity;
import model.InventorySpecification;

import java.util.List;

public interface InventorySpecificationDAO {
    /**
     * 获取数据库总记录数
     * @param whereName
     * @param whereValue
     */
    int getTotalRecord(String whereName, String whereValue);//todo 陈亮 仿照CommodityDAO中的同名函数写一下

    /**
     * @param whereName
     * @param whereValue
     * @param index 当前索引  即从哪个数据开始查
     * @param pageSize 页面大小  即查多少条数据
     */
    List<InventorySpecification> getPageList(String whereName, String whereValue, int index, int pageSize);

}
