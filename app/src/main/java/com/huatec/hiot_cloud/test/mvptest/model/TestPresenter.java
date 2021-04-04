package com.huatec.hiot_cloud.test.mvptest.model;

import com.huatec.hiot_cloud.test.mvptest.TestView;

public class TestPresenter {

    private TestView view;

    public TestPresenter(TestView view) {
        this.view=view;
    }

    public  void login(User user){
        if("lilei".equals(user.getUserName()) &&"123".equals(user.getPassword())){
          view.showMessage("登录成功");
    }else{
            view.showMessage("登录失败");
        }
}}
