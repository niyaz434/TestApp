package com.example.mohamedniyaz.basics.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mohamedniyaz.basics.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.activity);
        button1 = (Button) findViewById(R.id.layouts);
        button2 = (Button)findViewById(R.id.fragments);


        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
                case  R.id.activity :
                        Intent intent = new Intent(MainActivity.this, LifeCycleActivity.class);
                        startActivity(intent);
                        break;

                case R.id.layouts:
                        Intent intent1 = new Intent(MainActivity.this,LayoutActivity.class);
                        startActivity(intent1);
                        break;


            case  R.id.fragments:
                        Intent intent2 = new Intent(MainActivity.this,FragmentActivity.class);
                        startActivity(intent2);
                        break;

        }
    }
}
