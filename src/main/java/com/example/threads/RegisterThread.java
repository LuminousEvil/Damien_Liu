package com.example.threads;

import userManage.SetUserInfo;

import com.example.model.User;

/**
 * Created by Administrator on 2017/4/25.
 */
public class RegisterThread extends Thread {
    User user;

    public RegisterThread(User user) {
        this.user = user;
    }

    public void run() {

        SetUserInfo setuserinfo = new SetUserInfo();
        setuserinfo.setUserid(user.getUserid());
        setuserinfo.setUsername(user.getUsername());
        setuserinfo.setNikename(user.getNickname());
        setuserinfo.setSex(user.getSex());
        setuserinfo.setSchool(user.getSchool());
        setuserinfo.setPassword(user.getPassword());
        setuserinfo.setPhonenumber(user.getPhonenumber());
        setuserinfo.sendInfo();
    }

}
