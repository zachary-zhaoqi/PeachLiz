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
    int getTotalRecord() throws SQLException;//todo 陈亮 写一个单元测试

    /**
     * @param index 当前索引  即从哪个数据开始查
     * @param pageSize 页面大小  即查多少条数据
     * 得到请求页的数据列表
     */
    List<Commodity> getCommityPageList(int index, int pageSize) throws Exception;//todo 陈亮 写一个单元测试

    //todo 陈亮 写一下文档
    void addCommodity(Commodity commodity) throws SQLException;

    //todo 陈亮 写一下文档
    void editCommodity(Commodity commodity) throws UnsupportedEncodingException, SQLException;


}
