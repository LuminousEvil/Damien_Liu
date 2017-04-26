package com.example.threads;

import parttimejob.JobInfo;
import parttimejob.SendJobInfo;

/**
 * Created by Administrator on 2017/4/26.
 */
public class ReleaseThread extends Thread {
    JobInfo jobInfo;

    public ReleaseThread(JobInfo jobInfo) {
        this.jobInfo = jobInfo;
    }

    @Override
    public void run() {
        SendJobInfo send = new SendJobInfo();
        send.setAdress(jobInfo.getAdress());
        send.setCash(jobInfo.getCash());
        send.setDeadline("2017-4-24 12:00:00");
        send.setExcutedate(jobInfo.getExcutedate());
        send.setJobcontent(jobInfo.getJobcontent());
        send.setJobname(jobInfo.getJobname());
        send.setJobtype(jobInfo.getJobtype());
        send.setPhone(jobInfo.getPhone());
        send.setPushdate();
        send.setSexrequire("男");
        send.setUserid(jobInfo.getUserid());
        send.sendJobInfo();
    }
}
