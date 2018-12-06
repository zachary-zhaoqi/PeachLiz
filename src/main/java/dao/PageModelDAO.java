package dao;

import model.Commodity;

import java.sql.SQLException;
import java.util.List;

public interface PageModelDAO<T1,T2> {
    /**
     * @param whereName
     * @param whereValue
     * 获取数据库总记录数
     */
    int getTotalRecord(String whereName, T2 whereValue) throws SQLException;

    /**
     * @param whereName
     * @param whereValue
     * @param index 当前索引  即从哪个数据开始查
     * @param pageSize 页面大小  即查多少条数据
     */
    List<T1> getPageList(String whereName, T2 whereValue, int index, int pageSize) throws Exception;


}
