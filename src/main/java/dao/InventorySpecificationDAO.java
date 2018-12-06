package dao;

import model.InventorySpecification;

import java.sql.SQLException;

public interface InventorySpecificationDAO {

    InventorySpecification getSqlinventorySpecification(int idinventory) throws Exception;

    void addInventorySpecification(int idcommodity, String specification, int number) throws SQLException;

    void updateInventorySpecification(int idinventory,int number);
}
