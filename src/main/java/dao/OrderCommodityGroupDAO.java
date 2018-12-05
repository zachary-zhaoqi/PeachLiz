package dao;

import model.OrderCommodityGroup;

import java.util.List;

public interface OrderCommodityGroupDAO {
    List<OrderCommodityGroup> getSqlidorderCommodityGroup(int idorder) throws Exception;
}
