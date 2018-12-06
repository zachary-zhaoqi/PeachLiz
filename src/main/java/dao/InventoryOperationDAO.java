package dao;

import java.sql.SQLException;

public interface InventoryOperationDAO {

//    /**操作id*/
//    private int idoperation;
//    /**库存id*/
//    private int idinventory;
//    /**操作员id*/
//    private int idoperator;
//    /**操作时间*/
//    private String operationdate;
//    /**改动数量*/
//    private int change;

    void addOperation( int idinventory,int idoperator,int change) throws SQLException;
}
