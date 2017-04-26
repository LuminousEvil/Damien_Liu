package com.example.test_viewpager_fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.model.UserSession;
import com.example.threads.RegisterThread;
import com.example.threads.ReleaseThread;

import parttimejob.JobInfo;

public class Fragment1 extends Fragment implements View.OnClickListener {

	View view;
	Button release;
	EditText wn, tel, content, money, people;
	Spinner type, wType, location;
	DatePicker date;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view= inflater.inflate(R.layout.layout1, container, false);

		release = (Button)view.findViewById(R.id.button_release);
		wn = (EditText)view.findViewById(R.id.editText_wn);
		tel = (EditText)view.findViewById(R.id.editText_tel);
		type = (Spinner)view.findViewById(R.id.spinner_type);
		content = (EditText)view.findViewById(R.id.add_content);
		money = (EditText)view.findViewById(R.id.editText_money);
		wType = (Spinner)view.findViewById(R.id.spinner_wtype);
		date = (DatePicker)view.findViewById(R.id.dateAndTimePicker_datePicker);
		location = (Spinner)view.findViewById(R.id.spinner_location);
		people = (EditText)view.findViewById(R.id.editText_people);

		release.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {
		final UserSession userSession = (UserSession)getActivity().getApplication();
		JobInfo jobInfo = new JobInfo();
		jobInfo.setUserid(userSession.getId());
		jobInfo.setJobname(wn.getText().toString());
		jobInfo.setPhone(tel.getText().toString());
		jobInfo.setJobtype(type.getSelectedItem().toString());
		jobInfo.setJobcontent(content.getText().toString());
		jobInfo.setCash(money.getText().toString());
		jobInfo.setExcutedate(date.getYear() + "-" + date.getMonth() + "-" + date.getDayOfMonth() + " 00:00:00");
		jobInfo.setAdress(location.getSelectedItem().toString());
		//jobInfo.setPeople(people.getText().toString());

		ReleaseThread releaseThread = new ReleaseThread(jobInfo);
		releaseThread.start();

	}

}
