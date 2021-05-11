package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    EditText et1;
    EditText et2;
    EditText et3;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        et1=findViewById(R.id.usrname);
        et2=findViewById(R.id.email);
        et3=findViewById(R.id.pswd);
        bt=findViewById(R.id.signup);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=et1.getText().toString().trim();
                String email=et2.getText().toString().trim();
                String password=et3.getText().toString().trim();
                if(username.isEmpty())
                    Toast.makeText(Signup.this, "Enter Username", Toast.LENGTH_SHORT).show();
                else if(email.isEmpty())
                    Toast.makeText(Signup.this, "Enter Your Email", Toast.LENGTH_SHORT).show();
                else if(password.isEmpty())
                    Toast.makeText(Signup.this, "Enter Password", Toast.LENGTH_SHORT).show();
                else
                {
                    Intent intent=new Intent(Signup.this,Welcome.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}