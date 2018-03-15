package com.example.mohamedniyaz.basics.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mohamedniyaz.basics.Interface.FragmentInterface;
import com.example.mohamedniyaz.basics.R;

public class FragmentToActivtiy extends AppCompatActivity implements FragmentInterface {


    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_to_activtiy);

        textView = (TextView)findViewById(R.id.activity_textView);
    }

    @Override
    public void FragmentMessage(String msg) {

        textView.setText(msg);

    }
}
