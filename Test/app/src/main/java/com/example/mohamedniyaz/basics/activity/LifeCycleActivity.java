package com.example.mohamedniyaz.basics.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mohamedniyaz.basics.model_class.Person;
import com.example.mohamedniyaz.basics.R;

public class LifeCycleActivity extends AppCompatActivity {

    String name;
    public EditText editText;
    public TextView textView;
    Button button;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        editText = findViewById(R.id.edit_text);
        textView = (TextView)findViewById(R.id.text);
        button = (Button)findViewById(R.id.btn);
        button1 = (Button)findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = editText.getText().toString().trim();
                textView.setText(name);


                //Example of the explixit intent using string
                Intent intent = new Intent(LifeCycleActivity.this,NextActivity.class);
                intent.putExtra("String",name);

                //Example of explicit intent using Object
                Person person  = new Person();
                person.setName(name);
                Bundle bundle = new Bundle();
                bundle.putSerializable("Object",person);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        Log.d("Oncreate", "onCreate: Open when the app starts first call ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("OnStrat ", "onStart:  Onstart is initiated while oncreated ");
    }

    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        name =  savedInstanceState.getString("Bundle");
        Log.d("Restore", "onRestoreInstanceState: "+name);
        textView.setText(name);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("OnResume", "onResume: OnResume is instantiated followed by onStart ");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("OnPause", "onPause: OnPause is called when the app goes to background");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Save", "onSaveInstanceState: "+name);
        outState.putString("Bundle",name);


    }

    public void Register (View view){
        Log.d("CLick working", "Register: Working ");
        Intent intent = new Intent(LifeCycleActivity.this,RegisterActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("OnStop", "onStop: OnStop is called when the new app is entire occupy the mobile screen");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("OnDestroy", "onDestroy: OnDestroy is called when the activity is called when the app killed by user or for memory space");
    }

}
