package com.example.app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.app.R;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void reg(View v) {
        int flag = 0;
        AlertDialog.Builder alertmessage = new AlertDialog.Builder(this); // To display error message
        EditText name = (EditText) findViewById(R.id.reg_name);
        EditText email = (EditText) findViewById(R.id.reg_email);
        EditText password = (EditText) findViewById(R.id.reg_pass);
        EditText conf_password = (EditText) findViewById(R.id.reg_conf_pass);

        if (name.length() == 0) {
            flag = 1;
            name.setError("Please Enter Name");
        }
        if (email.length() == 0) {
            flag = 1;
            email.setError("Please Enter E-Mail");
        }
        if (password.length() == 0) {
            flag = 1;
            password.setError("Please Enter Password");
        }
        if (conf_password.length() == 0) {
            flag = 1;
            conf_password.setError("Please Re-Enter Password");
        }
        if (flag == 1)
            return;

        if (!(password.getText().toString().equals(conf_password.getText().toString()))) {
            alertmessage.setMessage("Re-entered password does not match with the password");
            alertmessage.setTitle("Error...");
            alertmessage.setPositiveButton("OK", null);
            alertmessage.setCancelable(true);
            alertmessage.create().show();
            flag = 1;
        }
        if (flag == 1)
            return;

        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();

        editor.putString("username", name.getText().toString());
        editor.putString("email", email.getText().toString());
        editor.putString("password", password.getText().toString());
        editor.putInt("qm1",0);
        editor.putInt("qm2",0);
        editor.putInt("qm3",0);
        editor.putInt("qm4",0);
        editor.putInt("ql1",0);
        editor.putInt("ql2",0);
        editor.putInt("ql3",0);
        editor.putInt("ql4",0);
        editor.putInt("qma1",0);
        editor.putInt("qma2",0);
        editor.putInt("qma3",0);
        editor.putInt("qma4",0);
        editor.putInt("qla1",0);
        editor.putInt("qla2",0);
        editor.putInt("qla3",0);
        editor.putInt("qla4",0);
        editor.apply();

        Toast.makeText(getApplicationContext(),"Registration Successful",Toast.LENGTH_SHORT).show();

        Intent homepage = new Intent();
        homepage.setClass(this,com.example.app.home.class);
        startActivity(homepage);
        finish();
    }
}