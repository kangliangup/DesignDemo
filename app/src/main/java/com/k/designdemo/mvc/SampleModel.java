package com.k.designdemo.mvc;

import android.telecom.Call;

/**
 * Created by 小康生活 on 2019/5/23.
 */
public class SampleModel {


    /**
     * 假设这里是从网络获取数据的方法
     */
    public void getData(CallBack callBack){
        callBack.onCallBack("这是从网络获取的数据啊");
    }

}
