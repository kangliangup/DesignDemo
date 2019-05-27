package com.k.designdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.k.designdemo.mvc.CallBack;
import com.k.designdemo.mvc.SampleModel;

public class MainActivity extends AppCompatActivity {

    private SampleModel sampleModel;
    private TextView tv_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sampleModel = new SampleModel();

        tv_data = findViewById(R.id.tv_data);
        TextView btn_get_data = findViewById(R.id.btn_get_data);


        btn_get_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
            }
        });

    }


    private void getData() {
        sampleModel.getData(new CallBack() {
            @Override
            public void onCallBack(String data) {
                setView(data);
            }
        });
    }


    private void setView(String data) {
        tv_data.setText(data);
    }


}
