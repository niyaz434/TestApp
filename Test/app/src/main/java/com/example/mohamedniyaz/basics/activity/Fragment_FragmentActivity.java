package com.example.mohamedniyaz.basics.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mohamedniyaz.basics.Interface.FragmentInterface;
import com.example.mohamedniyaz.basics.R;
import com.example.mohamedniyaz.basics.fragments.Fragment_Two;

public class Fragment_FragmentActivity extends AppCompatActivity implements FragmentInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment__fragment);
    }


    @Override
    public void FragmentMessage(String msg) {

        Fragment_Two fragment_two = (Fragment_Two)getSupportFragmentManager().findFragmentById(R.id.frag_2);
        fragment_two.set_message(msg);
    }
}
