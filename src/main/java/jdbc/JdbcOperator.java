package jdbc;

import org.apache.commons.beanutils.BeanUtils;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JdbcOperator {

    private DataSource dataSource;

    public JdbcOperator() {
        this.dataSource = DataSourceConfig.getDataSource();
    }

    public JdbcOperator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int executeUpdateBack(String sql, Connection connection,Object... params ) throws SQLException {
        PreparedStatement preparedStatement = null;

        int result;

        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw e;
        }finally {
            if (preparedStatement != null) {
                closePreparedStatement(preparedStatement);
            }
        }
        return result;
    }
    public int executeUpdateBackId(String sql, Connection connection,Object... params ) throws SQLException {
        PreparedStatement preparedStatement = null;

        ResultSet result;

        int id = 0;

        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            preparedStatement.executeUpdate();
            result = preparedStatement.getGeneratedKeys();
            while (result.next()){
                id = result.getInt(1);
            }

        } catch (SQLException e) {
            throw e;
        }finally {
            if (preparedStatement != null) {
                closePreparedStatement(preparedStatement);
            }
        }
        return id;
    }
    public int executeUpdate(String sql, Object... params) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        int result;

        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw e;
        } finally {
            if (preparedStatement != null) {
                closePreparedStatement(preparedStatement);
            }
            if (connection != null) {
                closeConnection(connection);
            }
        }
        return result;
    }

    public int queryForIntOnly(String sql, Object... params) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet=null;
        int result = -1;

        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                result= resultSet.getInt(1);
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            if (preparedStatement != null) {
                closePreparedStatement(preparedStatement);
            }
            if (connection != null) {
                closeConnection(connection);
            }
            if (resultSet != null) {
                closeResultSet(resultSet);
            }
        }
        return result;
    }

    public Object queryForJavaBean(String sql, Class javaBeanClass, Object... params) throws Exception {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        Object object=null;

        try {
            connection=dataSource.getConnection();
            if (connection!=null){
                preparedStatement=connection.prepareStatement(sql);
                for (int i=0;i<params.length;i++){
                    preparedStatement.setObject(i+1,params[i]);
                }
                resultSet=preparedStatement.executeQuery();
                ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
                int count=resultSetMetaData.getColumnCount();

                while (resultSet.next()){
                    object=javaBeanClass.newInstance();
                    Map map=new HashMap();
                    for (int i = 1; i <count+1; i++) {
                        Object value=resultSet.getObject(i);
                        String name=resultSetMetaData.getColumnName(i).toLowerCase();
                        map.put(name,value);
                    }
                    BeanUtils.populate(object,map);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            throw e;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
        }finally {
            if (connection!=null){
                closeConnection(connection);
            }
            if (preparedStatement != null) {
                closePreparedStatement(preparedStatement);
            }
            if (resultSet != null) {
                closeResultSet(resultSet);
            }
        }
        return object;
    }

    public List queryForJavaBeanList(String sql, Class javaBeanClass, Object... params) throws Exception {
        List<Object>list=new ArrayList<Object>();
        Object object;
        Connection conn = null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;

        try {
            conn = dataSource.getConnection();
            //��ɲ�ѯ�����ز�ѯ���������
            if (conn!=null) {
                preparedStatement=conn.prepareStatement(sql);
                for (int i = 0; i < params.length; i++) {
                    preparedStatement.setObject(i+1, params[i]);
                }
                resultSet=preparedStatement.executeQuery();
                ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
                int count=resultSetMetaData.getColumnCount();

                while (resultSet.next()) {
                    object=javaBeanClass.newInstance();
                    Map map=new HashMap();
                    for (int i = 1; i <= count; i++) {
                        Object value=resultSet.getObject(i);
                        String name =resultSetMetaData.getColumnName(i).toLowerCase();
                        map.put(name, value);
                    }
                    BeanUtils.populate(object, map);
                    list.add(object);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally{
            if(conn != null){
                closeConnection(conn);
            }
            if (preparedStatement!=null) {
                closePreparedStatement(preparedStatement);
            }
            if (resultSet!=null) {
                closeResultSet(resultSet);
            }
        }

        return list;
    }

    private void closeResultSet(ResultSet resultSet) {
        try {
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void closePreparedStatement(PreparedStatement preparedStatement) {
        try {
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

