package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        String s = details.getString("username",null);
        EditText n = (EditText) findViewById(R.id.name);
        n.setText(s);
        //setContentView(R.layout.activity_home);
    }

    public void logout(View v)
    {
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        editor.putBoolean("LoggedIn",false).apply();

        Intent loginpage = new Intent();
        loginpage.setClass(this, MainActivity.class);
        Toast.makeText(getApplicationContext(),"Logout Successful",Toast.LENGTH_SHORT).show();
        startActivity(loginpage);
        finish();
    }

    public void mob(View v)
    {
        Intent mob = new Intent();
        mob.setClass(this, com.example.app.mob.class);
        startActivity(mob);
    }

    public void lap(View v)
    {
        Intent lap = new Intent();
        lap.setClass(this, com.example.app.lap.class);
        startActivity(lap);
    }

    public void mob_acc(View v)
    {
        Intent mob_acc = new Intent();
        mob_acc.setClass(this, com.example.app.mob_acc.class);
        startActivity(mob_acc);
    }

    public void lap_acc(View v)
    {
        Intent lap_acc = new Intent();
        lap_acc.setClass(this, com.example.app.lap_acc.class);
        startActivity(lap_acc);
    }

    public void cart(View v)
    {
        Intent cartpage = new Intent();
        cartpage.setClass(this, com.example.app.cart.class);
        startActivity(cartpage);
    }
}