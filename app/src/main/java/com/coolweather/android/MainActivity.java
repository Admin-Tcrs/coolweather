package com.coolweather.android;
/**
 * 程序执行入口
 * 开发酷欧天气-
 * 全国省市县数据信息服务器：以下是访问地址
 * 省：http://guolin.tech/api/china
 * 市：http://guolin.tech/api/china/16
 * 县：http://guolin.tech/api/china/16/116
 *
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if(prefs.getString("weather", null) != null){
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}