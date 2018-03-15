package com.example.mohamedniyaz.basics.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mohamedniyaz.basics.R;

public class LayoutActivity extends AppCompatActivity  {


    Button linear;
    Button relative;
    Button constraint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        linear = (Button)findViewById(R.id.linear_layout);
        relative = (Button)findViewById(R.id.relative_layout);
        constraint = (Button)findViewById(R.id.constraint_layout);

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LayoutActivity.this,LinearLayoutActivity.class);
                startActivity(intent);

            }
        });
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LayoutActivity.this,RelativeLayoutActivity.class);
                startActivity(intent);
            }
        });

      constraint.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(LayoutActivity.this,ConstraintLayoutActivity.class);
              startActivity(intent);
          }
      });

    }


    }

