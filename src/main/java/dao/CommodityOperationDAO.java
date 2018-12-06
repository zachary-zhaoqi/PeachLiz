package dao;

import java.sql.SQLException;

public interface CommodityOperationDAO {
    void addOperation( int idcommodity,int idoperator,String change) throws SQLException;

}
