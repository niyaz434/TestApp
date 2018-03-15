package com.example.mohamedniyaz.basics.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mohamedniyaz.basics.model_class.Person;
import com.example.mohamedniyaz.basics.R;

public class NextActivity extends AppCompatActivity {


    TextView textView;
    TextView textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


        textView = (TextView)findViewById(R.id.nexttext);
        textView1 = (TextView)findViewById(R.id.objecttext);


        //Exmaple of an explicit intent using string
        Intent intent = getIntent();
        String name = intent.getStringExtra("String");
        textView.setText("Using String :" +name);

        //Example of an explicit intent usin object
        Bundle bundle ;
        bundle = intent.getExtras();
        Person person = null;
        if (bundle != null) {
            person = (Person)bundle.getSerializable("Object");
        }
        if (person != null) {
            textView1.setText("object :"+person.getName());
        }

    }
}
