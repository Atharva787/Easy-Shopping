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

public class lap_acc extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lap_acc);
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

    public void lapad1(View v)
    {
        ImageView iv = (ImageView) findViewById(R.id.lap_acc1);
        TextView tv = (TextView) findViewById(R.id.lad1);
        if(iv.isShown()){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.INVISIBLE);
        }
        else {
            iv.setVisibility(View.VISIBLE);
            tv.setVisibility(View.INVISIBLE);
        }
    }

    public void lapad2(View v)
    {
        ImageView iv = (ImageView) findViewById(R.id.lap_acc2);
        TextView tv = (TextView) findViewById(R.id.lad2);
        if(iv.isShown()){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.INVISIBLE);
        }
        else {
            iv.setVisibility(View.VISIBLE);
            tv.setVisibility(View.INVISIBLE);
        }
    }

    public void lapad3(View v)
    {
        ImageView iv = (ImageView) findViewById(R.id.lap_acc3);
        TextView tv = (TextView) findViewById(R.id.lad3);
        if(iv.isShown()){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.INVISIBLE);
        }
        else {
            iv.setVisibility(View.VISIBLE);
            tv.setVisibility(View.INVISIBLE);
        }
    }

    public void lapad4(View v)
    {
        ImageView iv = (ImageView) findViewById(R.id.lap_acc4);
        TextView tv = (TextView) findViewById(R.id.lad4);
        if(iv.isShown()){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.INVISIBLE);
        }
        else {
            iv.setVisibility(View.VISIBLE);
            tv.setVisibility(View.INVISIBLE);
        }
    }

    public void addla1(View v)
    {
        Toast.makeText(getApplicationContext(),"Laptop Charger added to cart",Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qla1",0);
        qty = qty + 1;
        editor.putInt("qla1",qty);
        editor.apply();
    }

    public void addla2(View v)
    {
        Toast.makeText(getApplicationContext(),"Laptop Cover added to cart",Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qla2",0);
        qty = qty + 1;
        editor.putInt("qla2",qty);
        editor.apply();
    }

    public void addla3(View v)
    {
        Toast.makeText(getApplicationContext(),"Mouse added to cart",Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qla3",0);
        qty = qty + 1;
        editor.putInt("qla3",qty);
        editor.apply();
    }

    public void addla4(View v)
    {
        Toast.makeText(getApplicationContext(),"Keyboard added to cart",Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qla4",0);
        qty = qty + 1;
        editor.putInt("qla4",qty);
        editor.apply();
    }


}
