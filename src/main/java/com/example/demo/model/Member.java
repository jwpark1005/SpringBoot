package com.example.demo.model;

public class Member {

    String userid;
    String username;
    String userpwd;

    public Member(String userid, String uname, String userpwd) {
        this.userid = userid;
        this.username = username;
        this.userpwd = userpwd;
    }

    public Member() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUname() {
        return username;
    }

    public void setUname(String uname) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

}
