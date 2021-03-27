package com.example.app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

public class order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void order(View v){
        AlertDialog.Builder alertmessage = new AlertDialog.Builder(this);
        TextView add = (TextView) findViewById(R.id.address);
        if(add.length() == 0){
            alertmessage.setMessage("Please Enter a Address.");
            alertmessage.setTitle("Error...");
            alertmessage.setPositiveButton("OK", null);
            alertmessage.setCancelable(true);
            alertmessage.create().show();
            return;
        }
        alertmessage.setMessage("Your Order is Successful and will be Delivered to you Shortly!!");
        alertmessage.setTitle("Thank You!!");
        alertmessage.create().show();

        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        editor.putInt("qm1", 0);
        editor.putInt("qm2", 0);
        editor.putInt("qm3", 0);
        editor.putInt("qm4", 0);
        editor.putInt("ql1", 0);
        editor.putInt("ql2", 0);
        editor.putInt("ql3", 0);
        editor.putInt("ql4", 0);
        editor.putInt("qma1", 0);
        editor.putInt("qma2", 0);
        editor.putInt("qma3", 0);
        editor.putInt("qma4", 0);
        editor.putInt("qla1", 0);
        editor.putInt("qla2", 0);
        editor.putInt("qla3", 0);
        editor.putInt("qla4", 0);
        editor.apply();
        Intent home= new Intent();
        home.setClass(this,home.class);
        startActivity(home);
        finish();
    }
}
