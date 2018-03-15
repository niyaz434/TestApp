package com.example.mohamedniyaz.basics;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText name1;
    EditText email;
    EditText password;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        name1 = (EditText)findViewById(R.id.userName);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        button = (Button)findViewById(R.id.checkbutton);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String userName = name1.getText().toString();
                Log.d("CHECK", "onCreate: "+userName.length());
                final String userEmail = email.getText().toString().trim();
                final String userPassword = password.getText().toString().trim();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                String passwordPattern ="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$";

                if((userName.length() == 0 || userEmail.length()== 0 || userPassword.length() == 0)){
                    Snackbar.make(v,"Please fill all the fields",Snackbar.LENGTH_LONG).show();
                    Toast.makeText(RegisterActivity.this, "Plase fill all the feilds", Toast.LENGTH_SHORT).show();
                }
                else if( (userName.length()== 0 || (userName.length() < 3 || (userName.length()>10)))){
                    Log.d("TAG", "onClick: "+userName.length());
                    Snackbar.make(v, "Name should not be null, Please enter atleast 3 characters", Snackbar.LENGTH_LONG).show();
                    name1.setError("Invalid name , Please enter a valid name which contains min 3 char and max10");
                }
                else if(!userEmail.matches(emailPattern)){
                    Snackbar.make(v,"Enter the valid email id",Snackbar.LENGTH_LONG).show();
                    //Toast.makeText(RegisterActivity.this, "Email is valid", Toast.LENGTH_SHORT).show();
                    email.setError("Please enter the valid email id");
                }
                else if(!userPassword.matches(passwordPattern)){
                    Snackbar.make(v,"Password should contain 1caps,1small,1numeric and 1 special",Snackbar.LENGTH_LONG).show();
                    password.setError("Enter the valid password");
                }

                else {
                    Snackbar.make(v,"ALL FIELDS ARE REGISTERD SUCCESFULLY",Snackbar.LENGTH_LONG).show();
                }

            }
        });





    }
}
