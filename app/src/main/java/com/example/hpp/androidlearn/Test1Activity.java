package com.example.hpp.androidlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Test1Activity extends BaseActivity {

    private static final String TAG = "Test1Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        Intent it = getIntent();
        it.getStringExtra(MainActivity.DATA_KEY1);
        TextView tv = findViewById(R.id.dt_show);
        tv.setText(it.getStringExtra(MainActivity.DATA_KEY1));

        Log.d(TAG, this.toString() + " onCreate, taskid " + getTaskId());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    public void onButtonAct1Click(View view){
        Intent it = new Intent(this, Test1Activity.class);
        startActivity(it);
    }

    public void onButtonAct2Click(View view){
        Intent it = new Intent(this, Test2Activity.class);
        startActivity(it);
    }
}
