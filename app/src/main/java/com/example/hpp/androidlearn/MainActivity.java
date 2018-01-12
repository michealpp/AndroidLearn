package com.example.hpp.androidlearn;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";
    final public static String DATA_KEY1 = "data_key1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate, taskid " + getTaskId());
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main, menu);

        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //
        switch (item.getItemId())
        {
            case R.id.mi_test1:
               //Toast.makeText(this, "menu clicked", Toast.LENGTH_LONG).show();
               // Log.d(TAG, "onOptionsItemSelected: menu clicked");
                startTest1Activity();
               return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void startTest1Activity(){
        Intent it = new Intent(this, Test1Activity.class);

        EditText ev = findViewById(R.id.et_data);


        it.putExtra(DATA_KEY1, ev.getText().toString());
        startActivity(it);
    }

    public void onButton1Click(View v){
        Intent it = new Intent(this, Test2Activity.class);
        startActivity(it);
    }

    public void onButton2Click(View v){
        Intent it = new Intent(this, Test3Activity.class);
        startActivity(it);
    }

    public void onButton4Click(View v){
        Intent it = new Intent(this, LinearLayoutTestActivity.class);
        startActivity(it);
    }

    public void onButton5Click(View v){
        Intent it = new Intent(this, FrameLayoutTestActivity.class);
        startActivity(it);
    }

    public void onButton6Click(View v){
        Intent it = new Intent(this, RelativeLayoutTestActivity.class);
        startActivity(it);
    }

    public void onButton7Click(View v){
        //showDialog("this is the title", "this is the message");
        String[] items = {"item1", "item2", "item3"};
        showSingleChoiceDialog("this is the title", items);
    }

    private void showDialog(String title, String msg){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.loco);
        builder.setTitle(title);
        builder.setMessage(msg);

        builder.setPositiveButton("确定", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dlg, int which){
                Log.d(TAG, "onClick");
            }
        });

        builder.setNegativeButton("取消",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dlg, int which){
                Log.d(TAG, "onClick cancel");
            }
        });
        builder.setCancelable(true);
        builder.create().show();
    }


    private void showChoiceDialog(String title, String[] items){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.loco);
        builder.setTitle(title);

        builder.setItems(items, new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dlg, int which){
                Log.d(TAG, "onClick");
            }
        });

        builder.setCancelable(true);
        builder.create().show();
    }

    private void showSingleChoiceDialog(String title, final String[] items){
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.loco);
        builder.setTitle(title);
        builder.setSingleChoiceItems(items, 1, new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dlg, int i){
                Toast.makeText(getApplicationContext(), "you chose " + items[i], Toast.LENGTH_SHORT).show();
                //dlg.dismiss();
            }
        });
        builder.setCancelable(true);
        builder.create().show();
    }

}
