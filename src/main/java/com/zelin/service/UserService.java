package com.zelin.service;

import com.zelin.pojo.User;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author: wangyilong
 * @Date: 2019/9/30 0030
 * @Description:  用户的service
 */
public class UserService extends BaseService {

//    查询所有用户----------分页查询
    public List<User> getAll(int pageIndex,int pageSize){

        String sql = "select * from t_user limit"+" "+((pageIndex-1)*pageSize)+","+pageSize;
        try {
            return runner.query(sql, new BeanListHandler<>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> findAll(){
        String sql = "SELECT u.*,r.rid,r.roleName rname FROM t_user u,t_role r where u.urid = r.rid";
        try {
            return  runner.query(sql,new BeanListHandler<>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*查询总记录数*/
    public long queryCount(){

        String sql = "select count(*) from t_user";
        try {
            return  (Long) runner.query(sql,new ScalarHandler());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /*查询总记录数*/
    public long queryCountByLike(String name){

        String sql = "select count(*) from t_user where username like ?";
        try {
            return  (Long) runner.query(sql,new ScalarHandler(),"%"+name+"%");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /*根据id查询*/
    public User findUserById(int userid){
        String sql = "select * from t_user where userid = ?";
        try {
            return   runner.query(sql,new BeanHandler<>(User.class),userid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*模糊查询*/
    public List<User> findUserByKeyWords(String name,int  pageIndex,int pageSize){
        String sql = "SELECT u.*,r.rid,r.roleName rname FROM t_user u,t_role r where u.urid = r.rid and username like ? limit ?,?";
        try {
            return   runner.query(sql,new BeanListHandler<>(User.class),"%"+name+"%",((pageIndex-1)*pageSize),pageSize);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public User findByNameAndPwd(String uname,String pwd){

        String sql = "select * from t_user where username=? and upassword = ?";
        try {
            return runner.query(sql,new BeanHandler<>(User.class),uname,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public User CheckUser(String uname){

        String sql = "select * from t_user where username=?";
        try {
            return runner.query(sql,new BeanHandler<>(User.class),uname);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



    /*删除用户*/
    /*返回的是受影响的行数*/
    public int deleteUser(int userid){
        String sql = "delete from t_user where userid = ?";
        try {
           return   runner.update(sql,userid);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }


    /*更新用户*/
    /*返回的是受影响的行数*/
    public int updateUser(User user){
        String sql = "update  t_user set username=?,upassword=?,urid=? where  userid = ?";
        try {
            return   runner.update(sql,user.getUsername(),user.getUpassword(),user.getUrid(),user.getUserid());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /*添加用户*/
    /*返回受影响的行数*/
    public int addUser(User user){
        String sql = "insert into t_user(username,upassword,urid) values(?,?,?)";
        try {
            return runner.update(sql,user.getUsername(),user.getUpassword(),user.getUrid());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }


    public static void main(String[] args) {
        UserService userService = new UserService();
//        System.out.println(userService.findUserByKeyWords("赵"));
//        userService.addUser(new User(null,"张无忌","6666"));
//        User user = userService.findUserById(4);
//        System.out.println(JSONObject.toJSONString(user));

/*    List<User> user = userService.findAll();
        System.out.println(user);*/
        System.out.println(userService.queryCountByLike("赵宏展"));
        List<User> list = userService.findUserByKeyWords("赵宏展",0,2);
        System.out.println(list);
    }

}
