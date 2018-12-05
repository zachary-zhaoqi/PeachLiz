package dao;

import model.OrderCommodityGroupEntry;

import java.util.List;

public interface OrderCommodityGroupEntryDAO {
    List<OrderCommodityGroupEntry> getSqlorderCommodityGroupEntryList(int idgrop) throws Exception;
}
