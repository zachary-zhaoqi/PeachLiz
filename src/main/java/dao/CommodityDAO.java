package dao;

import model.Commodity;


import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;

public interface CommodityDAO {
    /**
     * @param commodity 可能只有id
     *                  将该商品状态设置为冻结
     */
    void removeCommodity(int commodity) throws SQLException;

    /**
     * 获取数据库总记录数
     */
    int getTotalRecord() throws SQLException;

    /**
     * 得到请求页的数据列表
     */
    List<Commodity> getCommityPageList(int index, int pageSize) throws Exception;

    void addCommodity(Commodity commodity) throws SQLException;

    void editCommodity(Commodity commodity) throws UnsupportedEncodingException, SQLException;
}
