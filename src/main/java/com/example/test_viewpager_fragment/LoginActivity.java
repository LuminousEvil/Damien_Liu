package com.example.test_viewpager_fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

import com.example.model.UserSession;
import com.example.model.User;
/**
 * Created by Administrator on 2017/4/25.
 */
public class LoginActivity extends Activity implements OnClickListener {

    Button login, register;
    EditText lId, lPwd;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        login = (Button)findViewById(R.id.button_login);
        register = (Button)findViewById(R.id.button_register);
        lId = (EditText)findViewById(R.id.editText_lId);
        lPwd = (EditText)findViewById(R.id.editText_lPwd);
        login.setOnClickListener(this);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.button_login:
                ///User user = new User(lId.getText().toString(), lPwd.getText().toString());

                //验证登陆
                //。。。

                //把登陆后的用户加入session
                final UserSession userSession = (UserSession)getApplication();
                userSession.setId("14301041");

                //登陆成功后跳转至用户主页界面
                intent.setClass(LoginActivity.this, MainActivity.class);
                LoginActivity.this.startActivity(intent);

                break;
            case R.id.button_register:
                intent.setClass(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(intent);
                break;
        }
    }

}
