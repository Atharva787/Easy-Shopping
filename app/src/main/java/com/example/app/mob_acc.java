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

public class mob_acc extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mob_acc);
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

    public void mobad1(View v)
    {
        ImageView iv = (ImageView) findViewById(R.id.mob_acc1);
        TextView tv = (TextView) findViewById(R.id.mad1);
        if(iv.isShown()){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.INVISIBLE);
        }
        else {
            iv.setVisibility(View.VISIBLE);
            tv.setVisibility(View.INVISIBLE);
        }
    }

    public void mobad2(View v)
    {
        ImageView iv = (ImageView) findViewById(R.id.mob_acc2);
        TextView tv = (TextView) findViewById(R.id.mad2);
        if(iv.isShown()){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.INVISIBLE);
        }
        else {
            iv.setVisibility(View.VISIBLE);
            tv.setVisibility(View.INVISIBLE);
        }
    }
    public void mobad3(View v)
    {
        ImageView iv = (ImageView) findViewById(R.id.mob_acc3);
        TextView tv = (TextView) findViewById(R.id.mad3);
        if(iv.isShown()){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.INVISIBLE);
        }
        else {
            iv.setVisibility(View.VISIBLE);
            tv.setVisibility(View.INVISIBLE);
        }
    }
    public void mobad4(View v)
    {
        ImageView iv = (ImageView) findViewById(R.id.mob_acc4);
        TextView tv = (TextView) findViewById(R.id.mad4);
        if(iv.isShown()){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.INVISIBLE);
        }
        else {
            iv.setVisibility(View.VISIBLE);
            tv.setVisibility(View.INVISIBLE);
        }
    }

    public void addma1(View v)
    {
        Toast.makeText(getApplicationContext(),"Charger added to cart",Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qma1",0);
        qty = qty + 1;
        editor.putInt("qma1",qty);
        editor.apply();
    }

    public void addma2(View v)
    {
        Toast.makeText(getApplicationContext(),"Head Phones added to cart",Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qma2",0);
        qty = qty + 1;
        editor.putInt("qma2",qty);
        editor.apply();
    }

    public void addma3(View v)
    {
        Toast.makeText(getApplicationContext(),"Mobile Cover added to cart",Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qma3",0);
        qty = qty + 1;
        editor.putInt("qma3",qty);
        editor.apply();
    }

    public void addma4(View v)
    {
        Toast.makeText(getApplicationContext(),"Camera Lens added to cart",Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qma4",0);
        qty = qty + 1;
        editor.putInt("qma4",qty);
        editor.apply();
    }

}
