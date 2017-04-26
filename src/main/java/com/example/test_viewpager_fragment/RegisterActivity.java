package com.example.test_viewpager_fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.example.threads.RegisterThread;
import com.example.model.User;
/**
 * Created by Administrator on 2017/4/24.
 */
public class RegisterActivity extends Activity implements View.OnClickListener {
    EditText rId, rName, rNickName, rSchool, rTel, rPwd;
    RadioGroup rSex;
    Button register;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        rId = (EditText) findViewById(R.id.editText_rId);
        rName = (EditText)findViewById(R.id.editText_rName);
        rNickName = (EditText) findViewById(R.id.editText_rNickName);
        rSchool = (EditText)findViewById(R.id.editText_rSchool);
        rTel = (EditText)findViewById(R.id.editText_rTel);
        rSex = (RadioGroup)findViewById(R.id.radioGroup_rSex);
        rPwd = (EditText)findViewById(R.id.editText_rPwd);
        register = (Button)findViewById(R.id.button_registerCommit);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        User user = new User();
        //用户对象实体化
        user.setUserid(rId.getText().toString());
        user.setUsername(rName.getText().toString());
        user.setNickname(rNickName.getText().toString());
        user.setSchool(rSchool.getText().toString());
        user.setPhonenumber(rTel.getText().toString());
        user.setPassword(rPwd.getText().toString());
        if(rSex.getCheckedRadioButtonId() == R.id.radioButton_male) {
            user.setSex("男");
        }
        else {
            user.setSex("女");
        }


        //数据库操作。
        RegisterThread registerThread = new RegisterThread(user);
        registerThread.start();

        //注册完成后界面跳转到登陆界面
        Intent intent = new Intent();
        intent.setClass(RegisterActivity.this, LoginActivity.class);
        RegisterActivity.this.startActivity(intent);
    }
}
