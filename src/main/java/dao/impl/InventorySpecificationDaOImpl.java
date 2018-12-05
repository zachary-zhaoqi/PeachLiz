package dao.impl;

import dao.InventorySpecificationDAO;
import model.InventorySpecification;

import java.util.List;

public class InventorySpecificationDaOImpl implements InventorySpecificationDAO {
    @Override
    public int getTotalRecord(String whereName, String whereValue) {
        return 0;
    }

    @Override
    public List<InventorySpecification> getPageList(String whereName, String whereValue, int index, int pageSize) {
        return null;
    }
}
