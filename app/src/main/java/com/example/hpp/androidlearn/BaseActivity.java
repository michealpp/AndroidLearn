package com.example.hpp.androidlearn;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by vico13 on 2018/1/12.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityManager.Add(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityManager.Remove(this);
    }
}
