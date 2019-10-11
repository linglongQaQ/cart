package com.zelin.pojo;

/**
 * @author: wangyilong
 * @Date: 2019/9/30 0030
 * @Description: pojo类   User表
 */
public class User {

    private Integer userid;
    private String username;
    private String upassword;
    private int urid;
    private String rname;

    public User() {
    }

    public User(Integer userid, String username, String upassword) {
        this.userid = userid;
        this.username =username;
        this.upassword = upassword;
    }

    public User(String username, String upassword, int urid) {
        this.username = username;
        this.upassword = upassword;
        this.urid = urid;
    }

    public User(Integer userid, String username, String upassword, int urid) {
        this.userid = userid;
        this.username = username;
        this.upassword = upassword;
        this.urid = urid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public int getUrid() {
        return urid;
    }

    public void setUrid(int urid) {
        this.urid = urid;
    }
    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", upassword='" + upassword + '\'' +
                ", rid=" + urid +
                ", rname='" + rname + '\'' +
                '}';
    }
}
