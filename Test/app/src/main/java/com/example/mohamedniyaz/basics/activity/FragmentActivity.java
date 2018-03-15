package com.example.mohamedniyaz.basics.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohamedniyaz.basics.R;

public class FragmentActivity extends AppCompatActivity {

    Button activity;
    Button fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        activity = (Button)findViewById(R.id.fragment_activity);
        fragment = (Button)findViewById(R.id.fragment_fragment);

        activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FragmentActivity.this,FragmentToActivtiy.class);
                startActivity(intent);
            }
        });

        fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FragmentActivity.this,Fragment_FragmentActivity.class);
                startActivity(intent);

            }
        });

    }
}
