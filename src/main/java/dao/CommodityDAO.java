package dao;

import model.Commodity;

import java.sql.SQLException;
import java.util.List;

public interface CommodityDAO {
    /**
     * @param commodity 可能只有id
     *                  将该商品状态设置为冻结
     */
    void removeCommodity(Commodity commodity);

    /**
     * 获取数据库总记录数
     */
    int getTotalRecord() throws SQLException;

    /**
     * 得到请求页的数据列表
     */
    List<Commodity> getBookList(int index, int pageSize);

}
