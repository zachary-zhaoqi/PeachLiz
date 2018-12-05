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
     * @param commodityAttribute
     * @param commodityAttributeDetails
     * 获取数据库总记录数
     */
    int getTotalRecord(String commodityAttribute, String commodityAttributeDetails) throws SQLException;

    /**
     * @param commodityAttribute
     * @param commodityAttributeDetails
     * @param index 当前索引  即从哪个数据开始查
     * @param pageSize 页面大小  即查多少条数据
     */
    List<Commodity> getCommityPageList(String commodityAttribute, String commodityAttributeDetails, int index, int pageSize) throws Exception;


    /**
     *  把产品类所有属性添加入数据库。备注，颜色，三个型号这五个属性可以为null。creterdate若为null会自动获取当前时间
     * @param commodity 产品
     * @throws SQLException
     * @throws UnsupportedEncodingException
     */
    void addCommodity(Commodity commodity) throws SQLException, UnsupportedEncodingException;

    /**
     * 根据产品id更新数据库。备注，颜色，三个型号这五个属性可以为null。creterdate若为null会自动获取当前时间
     * @param commodity 产品
     * @throws UnsupportedEncodingException
     * @throws SQLException
     */

    void editCommodity(Commodity commodity) throws UnsupportedEncodingException, SQLException;

    /**
     * @param idcommodity 产品id
     * @return 完整的产品实体
     *                    根据产品id获取数据库中的响应属性
     * */
    Commodity getcommodity(int idcommodity) throws Exception;
}
