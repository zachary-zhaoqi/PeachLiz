package dao;

import model.Commodity;

public interface CommodityDAO {

    /**
     * @param commodity 可能只有id
     *  将该商品状态设置为冻结
     * */
    public void removeCommodity(Commodity commodity);


}
