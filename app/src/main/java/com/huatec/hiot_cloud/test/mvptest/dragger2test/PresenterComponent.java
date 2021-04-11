package com.huatec.hiot_cloud.test.mvptest.dragger2test;

import com.huatec.hiot_cloud.test.mvptest.model.TestMVPActivity;

import dagger.Component;

/**
 * 测试注入器接口
 */
@Component(modules = TestModule.class)
public interface PresenterComponent {

    void inject(TestMVPActivity testMVPActivity);
}
