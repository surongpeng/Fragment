package com.example.surongpeng.fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Fragment01 fragment01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showFragment01();
    }

    public void showFragment01(){
        fragment01 = new Fragment01();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fl, fragment01);
        ft.commit();
    }

    public void click1(View v){
        showFragment01();
    }

    public void click2(View v){
        Fragment02 fragment02 = new Fragment02();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fl,fragment02);
        ft.commit();
    }

    public void click3(View v){
        Fragment03 fragment03 = new Fragment03();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fl,fragment03);
        ft.commit();
    }

    public void click4(View v){
        EditText et_main = (EditText) findViewById(R.id.et_main);
        String text = et_main.getText().toString();
        fragment01.setText(text);
    }

    public void setText(String text){
        TextView tv = (TextView) findViewById(R.id.tv_fragment03);
        tv.setText(text);
    }
}
