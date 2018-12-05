package dao;

import model.Operator;

public interface OperatorDAO {

    /**
     * @param account 输入的账户
     * @param pwd 输入的密码
     *            通过账户和密码查询操作员实体，若有，返回操作员
     * */
    Operator login(String account,String pwd) throws Exception;

    /**
     * @param account 输入的账户
     * @param pwd 输入的密
     * @param newPwd 新的密码
     *               通过账户和密码查询操作员实体，若有，再更改其密码。
     *               如果更改失败则抛出错误。
     * */
    void changePwd(String account,String pwd,String newPwd) throws Exception;
}
