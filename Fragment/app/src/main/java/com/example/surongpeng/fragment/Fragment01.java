package com.example.surongpeng.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by surongpeng on 2016/3/2.
 */
public class Fragment01 extends Fragment {
    @Nullable
    private TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment01,null);
        tv = (TextView) v.findViewById(R.id.tv_fragment01);
        return v;
    }

    public void setText(String text){
        tv.setText(text);
    }
}
