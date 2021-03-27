package com.example.app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.app.R;

public class MainActivity extends AppCompatActivity {
    /*SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
    SharedPreferences.Editor editor = details.edit();*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);

        if(details.getBoolean("LoggedIn",true)){
            Intent homepage = new Intent();
            homepage.setClass(this,com.example.app.home.class);
            startActivity(homepage);
            finish();
        }
        else
            setContentView(R.layout.activity_main);
    }
    public void login(View v){
        int flag = 0;
        // getting name and password
        EditText ename = (EditText) findViewById(R.id.username);
        EditText epassword = (EditText) findViewById(R.id.password);
        if(ename.length() == 0) {
            flag = 1;
            ename.setError("Please Enter Name");
        }
        if(epassword.length() == 0){
            flag = 1;
            epassword.setError("Please Enter Password");
        }
        if(flag == 1)
            return;

        String en = ename.getText().toString();
        String ep = epassword.getText().toString();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        String n = details.getString("username","");
        String p = details.getString("password","");
        // Checking name and password
        if(en.compareTo(n)!=0 || ep.compareTo(p)!=0)
        {
            AlertDialog.Builder alertmessage = new AlertDialog.Builder(this);
            alertmessage.setMessage("Entered Name/Password is Incorrect!!");
            alertmessage.setTitle("Login Failed...");
            alertmessage.setPositiveButton("OK", null);
            alertmessage.setCancelable(true);
            alertmessage.create().show();
        }
        else{
            CheckBox keeploggedin = (CheckBox) findViewById(R.id.loggedin);
            if(keeploggedin.isChecked())
                editor.putBoolean("LoggedIn",true).apply();

            Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT).show();

            Intent homepage = new Intent();
            homepage.setClass(this,com.example.app.home.class);
            startActivity(homepage);
            finish();
        }
    }

    public void reg(View v){
        Intent register = new Intent();
        register.setClass(this, com.example.app.Register.class);
        startActivity(register);
        finish();
    }
}
