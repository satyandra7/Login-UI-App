package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt;
    Button bt2;
    EditText et1;
    EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.usrname);
        et2=findViewById(R.id.pswd);
        bt=findViewById(R.id.signup);
        bt2=findViewById(R.id.login);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Signup.class);
                startActivity(i);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = et1.getText().toString().trim();
                String password = et2.getText().toString().trim();
               if(username.isEmpty())
                    Toast.makeText(MainActivity.this, "Enter Username", Toast.LENGTH_SHORT).show();
               else if(password.isEmpty())
                   Toast.makeText(MainActivity.this, "Enter Password", Toast.LENGTH_SHORT).show();
               else
                {
                    Intent intent= new Intent(MainActivity.this, Welcome.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}