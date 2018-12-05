package dao;

import model.Commodity;

import java.sql.SQLException;
import java.util.List;

public interface PageModelDAO<T> {
    /**
     * @param whereName
     * @param whereValue
     * 获取数据库总记录数
     */
    int getTotalRecord(String whereName, String whereValue) throws SQLException;

    /**
     * @param whereName
     * @param whereValue
     * @param index 当前索引  即从哪个数据开始查
     * @param pageSize 页面大小  即查多少条数据
     */
    List<T> getPageList(String whereName, String whereValue, int index, int pageSize) throws Exception;


}
