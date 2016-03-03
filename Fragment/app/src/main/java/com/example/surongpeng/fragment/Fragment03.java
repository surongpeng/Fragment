package com.example.surongpeng.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by surongpeng on 2016/3/2.
 */
public class Fragment03 extends Fragment implements View.OnClickListener {
    @Nullable
    private EditText et;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment03,null);
        et = (EditText) v.findViewById(R.id.et_main);
        v.findViewById(R.id.bt_fragment03).setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View v) {
        String text = et.getText().toString();
        ((MainActivity)getActivity()).setText(text);

    }
}
