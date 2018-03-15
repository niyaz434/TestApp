package com.example.mohamedniyaz.basics.fragments;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mohamedniyaz.basics.R;

public class Fragment_Two extends Fragment {

ViewGroup root;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {


        root = (ViewGroup)inflater.inflate(R.layout.fragment_two,null);
        return  root;
    }


    public void  set_message(String message){

        TextView textView = (TextView)root.findViewById(R.id.fragment2_textView1);

            textView.setText("From Fragment one" + message );


    }
}
