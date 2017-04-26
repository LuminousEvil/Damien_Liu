package com.example.model;

/**
 * Created by Administrator on 2017/4/26.
 */
public class User {
    private String userid;
    private String username;
    private String nickname;
    private String sex;
    private String school;
    private String password;
    private String phonenumber;
    private int comments;
    private float commentstar;
    private int usercash;

    public User() {
        userid = null;
        username = null;
        nickname = null;
        sex = null;
        school = null;
        password = null;
        phonenumber = null;
        comments = 0;
        commentstar = 0;
        usercash = 0;
    }

    public User(String userid, String password) {
        this.userid = userid;
        this.password = password;
    }

    public User(String userid, String username, String nickname, String sex, String school, String password, String phonenumber, int comments, float commentstar, int usercash) {
        this.userid = userid;
        this.username = username;
        this.nickname = nickname;
        this.sex = sex;
        this.school = school;
        this.password = password;
        this.phonenumber = phonenumber;
        this.comments = comments;
        this.commentstar = commentstar;
        this.usercash = usercash;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public float getCommentstar() {
        return commentstar;
    }

    public void setCommentstar(float commentstar) {
        this.commentstar = commentstar;
    }

    public int getUsercash() {
        return usercash;
    }

    public void setUsercash(int usercash) {
        this.usercash = usercash;
    }
}
