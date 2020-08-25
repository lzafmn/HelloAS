package com.zarlyd.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//test git test git
    //test git branch 1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_hello = findViewById(R.id.tv_hello);
        tv_hello.setText("今天天气真热啊,火辣辣的");
        tv_hello.setTextColor(Color.RED);
        tv_hello.setTextSize(30);
        TextView tv_code_six = findViewById(R.id.tv_code_six);
        tv_code_six.setText("这是一个六位背景颜色");
        tv_code_six.setBackgroundColor(Color.CYAN);
        tv_code_six.setTextColor(Color.MAGENTA);
        tv_code_six.setTextSize(30);
        TextView tv_code_eight = findViewById(R.id.tv_code_eight);
        tv_code_eight.setText("这是一个八位背景颜色");
        tv_code_eight.setBackgroundColor(0xff00ff00);
//        tv_code_eight.setTextColor(getResources().getColor(R.color.colorLike));
        tv_code_eight.setTextSize(30);
        TextView deviceInfo = findViewById(R.id.deviceInfo);
//        JavaClass1.hello();
//        int screenWidth ;
//        screenWidth = getScreenWidth();
//        deviceInfo.setText("当前屏幕的宽度是"+screenWidth);
    }

}