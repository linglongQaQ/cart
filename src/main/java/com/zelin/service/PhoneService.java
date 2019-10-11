package com.zelin.service;

import com.zelin.pojo.Phone;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author: wangyilong
 * @Date: 2019/10/10 0010
 * @Description:
 */
public class PhoneService extends BaseService {

    /*查询所有*/
    public List<Phone> findAll(){
        String sql = "select * from t_phone";
        try {
            return runner.query(sql,new BeanListHandler<>(Phone.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*根据id查询*/
    public Phone getById(int id){

        String sql = "select * from t_phone where id = ?";
        try {
            return runner.query(sql,new BeanHandler<>(Phone.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }



    public static void main(String[] args) {
        System.out.println(new PhoneService().findAll());
        System.out.println(new PhoneService().getById(1));
    }
}
