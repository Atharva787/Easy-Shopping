package com.example.app;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class lap extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lap);
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        String s = details.getString("username",null);
        EditText n = (EditText) findViewById(R.id.name);
        n.setText(s);
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

    public void cart(View v)
    {
        Intent cartpage = new Intent();
        cartpage.setClass(this, com.example.app.cart.class);
        startActivity(cartpage);
    }

    public void lapd1(View v)
    {
        ImageView iv = (ImageView) findViewById(R.id.lap1);
        TextView tv = (TextView) findViewById(R.id.ld1);
        if(iv.isShown()){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.INVISIBLE);
        }
        else {
            iv.setVisibility(View.VISIBLE);
            tv.setVisibility(View.INVISIBLE);
        }
    }

    public void lapd2(View v)
    {
        ImageView iv = (ImageView) findViewById(R.id.lap2);
        TextView tv = (TextView) findViewById(R.id.ld2);
        if(iv.isShown()){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.INVISIBLE);
        }
        else {
            iv.setVisibility(View.VISIBLE);
            tv.setVisibility(View.INVISIBLE);
        }
    }

    public void lapd3(View v)
    {
        ImageView iv = (ImageView) findViewById(R.id.lap3);
        TextView tv = (TextView) findViewById(R.id.ld3);
        if(iv.isShown()){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.INVISIBLE);
        }
        else {
            iv.setVisibility(View.VISIBLE);
            tv.setVisibility(View.INVISIBLE);
        }
    }

    public void lapd4(View v)
    {
        ImageView iv = (ImageView) findViewById(R.id.lap4);
        TextView tv = (TextView) findViewById(R.id.ld4);
        if(iv.isShown()){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.INVISIBLE);
        }
        else {
            iv.setVisibility(View.VISIBLE);
            tv.setVisibility(View.INVISIBLE);
        }
    }

    public void addl1(View v)
    {
        Toast.makeText(getApplicationContext(),"L1 added to cart",Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("ql1",0);
        qty = qty + 1;
        editor.putInt("ql1",qty);
        editor.apply();
    }

    public void addl2(View v)
    {
        Toast.makeText(getApplicationContext(),"L2 added to cart",Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("ql2",0);
        qty = qty + 1;
        editor.putInt("ql2",qty);
        editor.apply();
    }
    public void addl3(View v)
    {
        Toast.makeText(getApplicationContext(),"L3 added to cart",Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("ql3",0);
        qty = qty + 1;
        editor.putInt("ql3",qty);
        editor.apply();
    }
    public void addl4(View v)
    {
        Toast.makeText(getApplicationContext(),"l4 added to cart",Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("ql4",0);
        qty = qty + 1;
        editor.putInt("ql4",qty);
        editor.apply();
    }
}
