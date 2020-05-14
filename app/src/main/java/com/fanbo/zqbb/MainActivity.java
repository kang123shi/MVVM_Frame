package com.fanbo.zqbb;


import android.content.Intent;
import android.os.Bundle;

import com.fanbo.zqbb.view.DemoActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent =new Intent();
        intent.setClass(this,DemoActivity.class);
        startActivity(intent);
    }
}
