package com.example.test_viewpager_fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.model.UserSession;

/**
 * Created by Administrator on 2017/4/24.
 */
public class CenterFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.center, container, false);
        Button log = (Button)view.findViewById(R.id.button_log);
        final UserSession userSession = (UserSession)getActivity().getApplication();
        if(userSession.getId() == null) {
            log.setText("请先登录");
            log.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Intent intent = new Intent();
                    intent.setClass(getActivity(), LoginActivity.class);
                    getActivity().startActivity(intent);
                }
            });
        }
        else {
            log.setText("退出");
        }

        return view;
    }

}
