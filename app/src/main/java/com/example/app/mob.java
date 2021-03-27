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

public class mob extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mob);
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

    public void mobd1(View v)
    {
        ImageView iv = (ImageView) findViewById(R.id.mob1);
        TextView tv = (TextView) findViewById(R.id.md1);
        if(iv.isShown()){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.INVISIBLE);
        }
        else {
            iv.setVisibility(View.VISIBLE);
            tv.setVisibility(View.INVISIBLE);
        }
    }

    public void mobd2(View v)
    {
        ImageView iv = (ImageView) findViewById(R.id.mob2);
        TextView tv = (TextView) findViewById(R.id.md2);
        if(iv.isShown()){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.INVISIBLE);
        }
        else {
            iv.setVisibility(View.VISIBLE);
            tv.setVisibility(View.INVISIBLE);
        }
    }
    public void mobd3(View v)
    {
        ImageView iv = (ImageView) findViewById(R.id.mob3);
        TextView tv = (TextView) findViewById(R.id.md3);
        if(iv.isShown()){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.INVISIBLE);
        }
        else {
            iv.setVisibility(View.VISIBLE);
            tv.setVisibility(View.INVISIBLE);
        }
    }
    public void mobd4(View v)
    {
        ImageView iv = (ImageView) findViewById(R.id.mob4);
        TextView tv = (TextView) findViewById(R.id.md4);
        if(iv.isShown()){
            tv.setVisibility(View.VISIBLE);
            iv.setVisibility(View.INVISIBLE);
        }
        else {
            iv.setVisibility(View.VISIBLE);
            tv.setVisibility(View.INVISIBLE);
        }
    }



    public void addm1(View v)
    {
        Toast.makeText(getApplicationContext(),"M1 added to cart",Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qm1",0);
        qty = qty + 1;
        editor.putInt("qm1",qty);
        editor.apply();
    }

    public void addm2(View v)
    {
        Toast.makeText(getApplicationContext(),"M2 added to cart",Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qm2",0);
        qty = qty + 1;
        editor.putInt("qm2",qty);
        editor.apply();
    }
    public void addm3(View v)
    {
        Toast.makeText(getApplicationContext(),"M3 added to cart",Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qm3",0);
        qty = qty + 1;
        editor.putInt("qm3",qty);
        editor.apply();
    }
    public void addm4(View v)
    {
        Toast.makeText(getApplicationContext(),"M4 added to cart",Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qm4",0);
        qty = qty + 1;
        editor.putInt("qm4",qty);
        editor.apply();
    }
}
