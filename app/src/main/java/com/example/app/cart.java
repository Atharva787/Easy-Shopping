package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class cart extends AppCompatActivity {

    int qty, cost;
    TableRow tr;
    TextView tvq, tvc;
    int total=0,flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        String s = details.getString("username", null);
        EditText n = (EditText) findViewById(R.id.name);
        n.setText(s);



        tr = (TableRow) findViewById(R.id.m1);
        tvq = (TextView) findViewById(R.id.qm1);
        tvc = (TextView) findViewById(R.id.cm1);

        qty = details.getInt("qm1", 0);
        cost = details.getInt("cm1", 500);

        if (qty > 0) {
            flag += qty;
            total += qty*500;
            tr.setVisibility(View.VISIBLE);
            tvq.setText(String.valueOf(qty));
            tvc.setText(String.valueOf(cost));
        }

        tr = (TableRow) findViewById(R.id.m2);
        tvq = (TextView) findViewById(R.id.qm2);
        tvc = (TextView) findViewById(R.id.cm2);
        qty = details.getInt("qm2", 0);
        cost = details.getInt("cm2", 550);

        if (qty > 0) {
            flag += qty;
            total += qty*550;
            tr.setVisibility(View.VISIBLE);
            tvq.setText(String.valueOf(qty));
            tvc.setText(String.valueOf(cost));
        }

        tr = (TableRow) findViewById(R.id.m3);
        tvq = (TextView) findViewById(R.id.qm3);
        tvc = (TextView) findViewById(R.id.cm3);
        qty = 0;
        qty = details.getInt("qm3", 0);
        cost = details.getInt("cm3", 600);

        if (qty > 0) {
            flag += qty;
            total += qty*600;
            tr.setVisibility(View.VISIBLE);
            tvq.setText(String.valueOf(qty));
            tvc.setText(String.valueOf(cost));
        }
        tr = (TableRow) findViewById(R.id.m4);
        tvq = (TextView) findViewById(R.id.qm4);
        tvc = (TextView) findViewById(R.id.cm4);



        qty = 0;
        qty = details.getInt("qm4", 0);
        cost = details.getInt("cm4", 650);
        if (qty > 0) {
            flag += qty;
            total += qty*650;
            tr.setVisibility(View.VISIBLE);
            tvq.setText(String.valueOf(qty));
            tvc.setText(String.valueOf(cost));
        }

        tr = (TableRow) findViewById(R.id.l1);
        tvq = (TextView) findViewById(R.id.ql1);
        tvc = (TextView) findViewById(R.id.cl1);

        qty = details.getInt("ql1", 0);
        cost = details.getInt("cl1", 700);
        if (qty > 0) {
            flag += qty;
            total += qty*700;
            tr.setVisibility(View.VISIBLE);
            tvq.setText(String.valueOf(qty));
            tvc.setText(String.valueOf(cost));
        }

        tr = (TableRow) findViewById(R.id.l2);
        tvq = (TextView) findViewById(R.id.ql2);
        tvc = (TextView) findViewById(R.id.cl2);
        qty = 0;
        qty = details.getInt("ql2", 0);
        cost = details.getInt("cl2", 750);
        if (qty > 0) {
            flag += qty;
            total += qty*750;
            tr.setVisibility(View.VISIBLE);
            tvq.setText(String.valueOf(qty));
            tvc.setText(String.valueOf(cost));
        }

        tr = (TableRow) findViewById(R.id.l3);
        tvq = (TextView) findViewById(R.id.ql3);
        tvc = (TextView) findViewById(R.id.cl3);
        qty = 0;
        qty = details.getInt("ql3", 0);
        cost = details.getInt("cl3", 800);
        if (qty > 0) {
            flag += qty;
            total += qty*800;
            tr.setVisibility(View.VISIBLE);
            tvq.setText(String.valueOf(qty));
            tvc.setText(String.valueOf(cost));
        }

        tr = (TableRow) findViewById(R.id.l4);
        tvq = (TextView) findViewById(R.id.ql4);
        tvc = (TextView) findViewById(R.id.cl4);

        qty = 0;
        qty = details.getInt("ql4", 0);
        cost = details.getInt("cl4", 850);

        if (qty > 0) {
            flag += qty;
            total += qty*850;
            tr.setVisibility(View.VISIBLE);
            tvq.setText(String.valueOf(qty));
            tvc.setText(String.valueOf(cost));
        }



        tr = (TableRow) findViewById(R.id.ma1);
        tvq = (TextView) findViewById(R.id.qma1);
        tvc = (TextView) findViewById(R.id.cma1);

        qty = details.getInt("qma1", 0);
        cost = details.getInt("cma1", 40);

        if (qty > 0) {
            flag += qty;
            total += qty*40;
            tr.setVisibility(View.VISIBLE);
            tvq.setText(String.valueOf(qty));
            tvc.setText(String.valueOf(cost));
        }

        tr = (TableRow) findViewById(R.id.ma2);
        tvq = (TextView) findViewById(R.id.qma2);
        tvc = (TextView) findViewById(R.id.cma2);

        qty = details.getInt("qma2", 0);
        cost = details.getInt("cma2", 50);

        if (qty > 0) {
            flag += qty;
            total += qty*50;
            tr.setVisibility(View.VISIBLE);
            tvq.setText(String.valueOf(qty));
            tvc.setText(String.valueOf(cost));
        }
        tr = (TableRow) findViewById(R.id.ma3);
        tvq = (TextView) findViewById(R.id.qma3);
        tvc = (TextView) findViewById(R.id.cma3);

        qty = details.getInt("qma3", 0);
        cost = details.getInt("cma3", 15);

        if (qty > 0) {
            flag += qty;
            total += qty*15;
            tr.setVisibility(View.VISIBLE);
            tvq.setText(String.valueOf(qty));
            tvc.setText(String.valueOf(cost));
        }

        tr = (TableRow) findViewById(R.id.ma4);
        tvq = (TextView) findViewById(R.id.qma4);
        tvc = (TextView) findViewById(R.id.cma4);

        qty = details.getInt("qma4", 0);
        cost = details.getInt("cma4", 50);

        if (qty > 0) {
            flag += qty;
            total += qty*50;
            tr.setVisibility(View.VISIBLE);
            tvq.setText(String.valueOf(qty));
            tvc.setText(String.valueOf(cost));
        }


        tr = (TableRow) findViewById(R.id.la1);
        tvq = (TextView) findViewById(R.id.qla1);
        tvc = (TextView) findViewById(R.id.cla1);

        qty = details.getInt("qla1", 0);
        cost = details.getInt("cla1", 100);
        if (qty > 0) {
            flag += qty;
            total += qty*100;
            tr.setVisibility(View.VISIBLE);
            tvq.setText(String.valueOf(qty));
            tvc.setText(String.valueOf(cost));
        }

        tr = (TableRow) findViewById(R.id.la2);
        tvq = (TextView) findViewById(R.id.qla2);
        tvc = (TextView) findViewById(R.id.cla2);

        qty = details.getInt("qla2", 0);
        cost = details.getInt("cla2", 25);
        if (qty > 0) {
            flag += qty;
            total += qty*25;
            tr.setVisibility(View.VISIBLE);
            tvq.setText(String.valueOf(qty));
            tvc.setText(String.valueOf(cost));
        }
        tr = (TableRow) findViewById(R.id.la3);
        tvq = (TextView) findViewById(R.id.qla3);
        tvc = (TextView) findViewById(R.id.cla3);

        qty = details.getInt("qla3", 0);
        cost = details.getInt("cla3", 40);
        if (qty > 0) {
            flag += qty;
            total += qty*40;
            tr.setVisibility(View.VISIBLE);
            tvq.setText(String.valueOf(qty));
            tvc.setText(String.valueOf(cost));
        }

        tr = (TableRow) findViewById(R.id.la4);
        tvq = (TextView) findViewById(R.id.qla4);
        tvc = (TextView) findViewById(R.id.cla4);

        qty = details.getInt("qla4", 0);
        cost = details.getInt("cla4", 50);
        if (qty > 0) {
            flag += qty;
            total += qty*50;
            tr.setVisibility(View.VISIBLE);
            tvq.setText(String.valueOf(qty));
            tvc.setText(String.valueOf(cost));
        }
        computecost(flag,total);

    }

    public void computecost(int flag,int total)
    {
        TableRow tr = (TableRow) findViewById(R.id.t);
        TableRow tline = (TableRow) findViewById(R.id.line);
        Button orderb = (Button) findViewById(R.id.orderb);
        if(flag>0){
            orderb.setVisibility(View.VISIBLE);
            tline.setVisibility(View.VISIBLE);
            tr.setVisibility(View.VISIBLE);
            TextView tqty = (TextView) findViewById(R.id.tqty);
            TextView tcost = (TextView) findViewById(R.id.tcost);
            tqty.setText(String.valueOf(flag));
            tcost.setText(String.valueOf(total));
        }
        else{
            orderb.setVisibility(View.GONE);
            tline.setVisibility(View.GONE);
            tr.setVisibility(View.GONE);
        }

    }

    public void logout(View v) {
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        editor.putBoolean("LoggedIn", false).apply();

        Intent loginpage = new Intent();
        loginpage.setClass(this, MainActivity.class);
        Toast.makeText(getApplicationContext(), "Logout Successful", Toast.LENGTH_SHORT).show();
        startActivity(loginpage);
        finish();

    }

    public void order(View v){
        Intent orderpage = new Intent();
        orderpage.setClass(this, com.example.app.order.class);
        startActivity(orderpage);
        finish();
    }

    public void add_m1(View v) {

        Toast.makeText(getApplicationContext(), "M1 added to cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qm1", 0);
        qty = qty + 1;
        int cost = qty * 500;
        editor.putInt("qm1", qty);
        editor.apply();
        flag++;
        total += 500;

        tvq = (TextView) findViewById(R.id.qm1);
        tvc = (TextView) findViewById(R.id.cm1);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void rem_m1(View v) {

        Toast.makeText(getApplicationContext(), "M1 Removed from cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qm1", 0);
        qty = qty - 1;
        int cost = qty * 500;
        editor.putInt("qm1", qty);
        editor.apply();
        flag--;
        total -= 500;

        if(qty<1){
            tr = (TableRow) findViewById(R.id.m1);
            tr.setVisibility(View.GONE);
            computecost(flag,total);
            return;
        }
        tvq = (TextView) findViewById(R.id.qm1);
        tvc = (TextView) findViewById(R.id.cm1);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void add_m2(View v) {

        Toast.makeText(getApplicationContext(), "M2 added to cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qm2", 0);
        qty = qty + 1;
        int cost = qty * 550;
        editor.putInt("qm2", qty);
        editor.apply();
        flag++;
        total += 550;

        tvq = (TextView) findViewById(R.id.qm2);
        tvc = (TextView) findViewById(R.id.cm2);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void rem_m2(View v) {

        Toast.makeText(getApplicationContext(), "M2 Removed from cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qm2", 0);
        qty = qty - 1;
        int cost = qty * 550;
        editor.putInt("qm2", qty);
        editor.apply();
        flag--;
        total -= 550;

        if(qty<1){
            tr = (TableRow) findViewById(R.id.m2);
            tr.setVisibility(View.GONE);
            computecost(flag,total);
            return;
        }
        tvq = (TextView) findViewById(R.id.qm2);
        tvc = (TextView) findViewById(R.id.cm2);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void add_m3(View v) {

        Toast.makeText(getApplicationContext(), "M3 added to cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qm3", 0);
        qty = qty + 1;
        int cost = qty * 600;
        editor.putInt("qm3", qty);
        editor.apply();
        flag++;
        total += 600;

        tvq = (TextView) findViewById(R.id.qm3);
        tvc = (TextView) findViewById(R.id.cm3);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void rem_m3(View v) {

        Toast.makeText(getApplicationContext(), "M3 Removed from cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qm3", 0);
        qty = qty - 1;
        int cost = qty * 600;
        editor.putInt("qm3", qty);
        editor.apply();
        flag--;
        total -= 600;

        if(qty<1){
            tr = (TableRow) findViewById(R.id.m3);
            tr.setVisibility(View.GONE);
            computecost(flag,total);
            return;
        }
        tvq = (TextView) findViewById(R.id.qm3);
        tvc = (TextView) findViewById(R.id.cm3);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }


    public void add_m4(View v) {

        Toast.makeText(getApplicationContext(), "M4 added to cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qm4", 0);
        qty = qty + 1;
        int cost = qty * 650;
        editor.putInt("qm4", qty);
        editor.apply();
        flag++;
        total += 650;

        tvq = (TextView) findViewById(R.id.qm4);
        tvc = (TextView) findViewById(R.id.cm4);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void rem_m4(View v) {

        Toast.makeText(getApplicationContext(), "M4 Removed from cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qm4", 0);
        qty = qty - 1;
        int cost = qty * 650;
        editor.putInt("qm4", qty);
        editor.apply();
        flag--;
        total -= 650;

        if(qty<1){
            tr = (TableRow) findViewById(R.id.m4);
            tr.setVisibility(View.GONE);
            computecost(flag,total);
            return;
        }
        tvq = (TextView) findViewById(R.id.qm4);
        tvc = (TextView) findViewById(R.id.cm4);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void add_l1(View v) {

        Toast.makeText(getApplicationContext(), "L1 added to cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("ql1", 0);
        qty = qty + 1;
        int cost = qty * 700;
        editor.putInt("ql1", qty);
        editor.apply();
        flag++;
        total += 700;

        tvq = (TextView) findViewById(R.id.ql1);
        tvc = (TextView) findViewById(R.id.cl1);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void rem_l1(View v) {

        Toast.makeText(getApplicationContext(), "L1 Removed from cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("ql1", 0);
        qty = qty - 1;
        int cost = qty * 700;
        editor.putInt("ql1", qty);
        editor.apply();
        flag--;
        total -= 700;

        if(qty<1){
            tr = (TableRow) findViewById(R.id.l1);
            tr.setVisibility(View.GONE);
            computecost(flag,total);
            return;
        }
        tvq = (TextView) findViewById(R.id.ql1);
        tvc = (TextView) findViewById(R.id.cl1);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void add_l2(View v) {

        Toast.makeText(getApplicationContext(), "L2 added to cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("ql2", 0);
        qty = qty + 1;
        int cost = qty * 750;
        editor.putInt("ql2", qty);
        editor.apply();
        flag++;
        total += 750;

        tvq = (TextView) findViewById(R.id.ql2);
        tvc = (TextView) findViewById(R.id.cl2);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void rem_l2(View v) {

        Toast.makeText(getApplicationContext(), "L2 Removed from cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("ql2", 0);
        qty = qty - 1;
        int cost = qty * 750;
        editor.putInt("ql2", qty);
        editor.apply();
        flag--;
        total -= 750;
        if(qty<1){
            tr = (TableRow) findViewById(R.id.l2);
            tr.setVisibility(View.GONE);
            computecost(flag,total);
            return;
        }
        tvq = (TextView) findViewById(R.id.ql2);
        tvc = (TextView) findViewById(R.id.cl2);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void add_l3(View v) {

        Toast.makeText(getApplicationContext(), "L3 added to cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("ql3", 0);
        qty = qty + 1;
        int cost = qty * 800;
        editor.putInt("ql3", qty);
        editor.apply();
        flag++;
        total += 800;

        tvq = (TextView) findViewById(R.id.ql3);
        tvc = (TextView) findViewById(R.id.cl3);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void rem_l3(View v) {

        Toast.makeText(getApplicationContext(), "L3 Removed from cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("ql3", 0);
        qty = qty - 1;
        int cost = qty * 800;
        editor.putInt("ql3", qty);
        editor.apply();
        flag--;
        total -= 800;

        if(qty<1){
            tr = (TableRow) findViewById(R.id.l3);
            tr.setVisibility(View.GONE);
            computecost(flag,total);
            return;
        }
        tvq = (TextView) findViewById(R.id.ql3);
        tvc = (TextView) findViewById(R.id.cl3);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }


    public void add_l4(View v) {

        Toast.makeText(getApplicationContext(), "L4 added to cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("ql4", 0);
        qty = qty + 1;
        int cost = qty * 850;
        editor.putInt("qm4", qty);
        editor.apply();
        flag++;
        total += 850;

        tvq = (TextView) findViewById(R.id.ql4);
        tvc = (TextView) findViewById(R.id.cl4);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void rem_l4(View v) {

        Toast.makeText(getApplicationContext(), "L4 Removed from cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("ql4", 0);
        qty = qty - 1;
        int cost = qty * 850;
        editor.putInt("ql4", qty);
        editor.apply();
        flag--;
        total -= 850;

        if(qty<1){
            tr = (TableRow) findViewById(R.id.l4);
            tr.setVisibility(View.GONE);
            computecost(flag,total);
            return;
        }
        tvq = (TextView) findViewById(R.id.ql4);
        tvc = (TextView) findViewById(R.id.cl4);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }


    public void add_ma1(View v) {

        Toast.makeText(getApplicationContext(), "Mobile Charger added to cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qma1", 0);
        qty = qty + 1;
        int cost = qty * 40;
        editor.putInt("qma1", qty);
        editor.apply();
        flag++;
        total += 40;

        tvq = (TextView) findViewById(R.id.qma1);
        tvc = (TextView) findViewById(R.id.cma1);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void rem_ma1(View v) {

        Toast.makeText(getApplicationContext(), "Mobile Charger Removed from cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qma1", 0);
        qty = qty - 1;
        int cost = qty * 40;
        editor.putInt("qma1", qty);
        editor.apply();
        flag--;
        total -= 40;

        if(qty<1){
            tr = (TableRow) findViewById(R.id.ma1);
            tr.setVisibility(View.GONE);
            computecost(flag,total);
            return;
        }
        tvq = (TextView) findViewById(R.id.qma1);
        tvc = (TextView) findViewById(R.id.cma1);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }


    public void add_ma2(View v) {

        Toast.makeText(getApplicationContext(), "Head Phones added to cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qma2", 0);
        qty = qty + 1;
        int cost = qty * 50;
        editor.putInt("qma2", qty);
        editor.apply();
        flag++;
        total += 50;

        tvq = (TextView) findViewById(R.id.qma2);
        tvc = (TextView) findViewById(R.id.cma2);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void rem_ma2(View v) {

        Toast.makeText(getApplicationContext(), "Head Phones Removed from cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qma2", 0);
        qty = qty - 1;
        int cost = qty * 50;
        editor.putInt("qma2", qty);
        editor.apply();
        flag--;
        total -= 50;

        if(qty<1){
            tr = (TableRow) findViewById(R.id.ma2);
            tr.setVisibility(View.GONE);
            computecost(flag,total);
            return;
        }
        tvq = (TextView) findViewById(R.id.qma2);
        tvc = (TextView) findViewById(R.id.cma2);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }



    public void add_ma3(View v) {

        Toast.makeText(getApplicationContext(), "Mobile Cover added to cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qma3", 0);
        qty = qty + 1;
        int cost = qty * 15;
        editor.putInt("qma3", qty);
        editor.apply();
        flag++;
        total += 15;

        tvq = (TextView) findViewById(R.id.qma3);
        tvc = (TextView) findViewById(R.id.cma3);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void rem_ma3(View v) {

        Toast.makeText(getApplicationContext(), "Mobile Cover Removed from cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qma3", 0);
        qty = qty - 1;
        int cost = qty * 15;
        editor.putInt("qma3", qty);
        editor.apply();
        flag--;
        total -= 15;
        if(qty<1){
            tr = (TableRow) findViewById(R.id.ma3);
            tr.setVisibility(View.GONE);
            computecost(flag,total);
            return;
        }
        tvq = (TextView) findViewById(R.id.qma3);
        tvc = (TextView) findViewById(R.id.cma3);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }


    public void add_ma4(View v) {
        Toast.makeText(getApplicationContext(), "Camera Lens added to cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qma4", 0);
        qty = qty + 1;
        int cost = qty * 50;
        editor.putInt("qma4", qty);
        editor.apply();
        flag++;
        total += 50;

        tvq = (TextView) findViewById(R.id.qma4);
        tvc = (TextView) findViewById(R.id.cma4);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void rem_ma4(View v) {

        Toast.makeText(getApplicationContext(), "Camera Lens Removed from cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qma4", 0);
        qty = qty - 1;
        int cost = qty * 50;
        editor.putInt("qma4", qty);
        editor.apply();
        flag--;
        total -= 50;
        if(qty<1){
            tr = (TableRow) findViewById(R.id.ma4);
            tr.setVisibility(View.GONE);
            computecost(flag,total);
            return;
        }
        tvq = (TextView) findViewById(R.id.qma4);
        tvc = (TextView) findViewById(R.id.cma4);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }


    public void add_la1(View v) {

        Toast.makeText(getApplicationContext(), "Laptop Charger added to cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qla1", 0);
        qty = qty + 1;
        int cost = qty * 100;
        editor.putInt("qla1", qty);
        editor.apply();
        flag++;
        total += 100;

        tvq = (TextView) findViewById(R.id.qla1);
        tvc = (TextView) findViewById(R.id.cla1);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void rem_la1(View v) {

        Toast.makeText(getApplicationContext(), "Laptop Charger Removed from cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qla1", 0);
        qty = qty - 1;
        int cost = qty * 100;
        editor.putInt("qla1", qty);
        editor.apply();
        flag--;
        total -= 100;
        if(qty<1){
            tr = (TableRow) findViewById(R.id.la1);
            tr.setVisibility(View.GONE);
            computecost(flag,total);
            return;
        }
        tvq = (TextView) findViewById(R.id.qla1);
        tvc = (TextView) findViewById(R.id.cla1);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }


    public void add_la2(View v) {

        Toast.makeText(getApplicationContext(), "Laptop Cover added to cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qla2", 0);
        qty = qty + 1;
        int cost = qty * 25;
        editor.putInt("qla2", qty);
        editor.apply();
        flag++;
        total += 25;

        tvq = (TextView) findViewById(R.id.qla2);
        tvc = (TextView) findViewById(R.id.cla2);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void rem_la2(View v) {

        Toast.makeText(getApplicationContext(), "Laptop Cover Removed from cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qla2", 0);
        qty = qty - 1;
        int cost = qty * 25;
        editor.putInt("qla2", qty);
        editor.apply();
        flag--;
        total -= 25;

        if(qty<1){
            tr = (TableRow) findViewById(R.id.la2);
            tr.setVisibility(View.GONE);
            computecost(flag,total);
            return;
        }
        tvq = (TextView) findViewById(R.id.qla2);
        tvc = (TextView) findViewById(R.id.cla2);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }


    public void add_la3(View v) {

        Toast.makeText(getApplicationContext(), "Mouse added to cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qla3", 0);
        qty = qty + 1;
        int cost = qty * 40;
        editor.putInt("qla3", qty);
        editor.apply();
        flag++;
        total += 400;

        tvq = (TextView) findViewById(R.id.qla3);
        tvc = (TextView) findViewById(R.id.cla3);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void rem_la3(View v) {

        Toast.makeText(getApplicationContext(), "Mouse Removed from cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qla3", 0);
        qty = qty - 1;
        int cost = qty * 40;
        editor.putInt("qla3", qty);
        editor.apply();
        flag--;
        total -= 40;

        if(qty<1){
            tr = (TableRow) findViewById(R.id.la3);
            tr.setVisibility(View.GONE);
            computecost(flag,total);
            return;
        }
        tvq = (TextView) findViewById(R.id.qla3);
        tvc = (TextView) findViewById(R.id.cla3);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }


    public void add_la4(View v) {
        Toast.makeText(getApplicationContext(), "Keyboard added to cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qla4", 0);
        qty = qty + 1;
        int cost = qty * 50;
        editor.putInt("qla4", qty);
        editor.apply();
        flag++;
        total += 50;
        tvq = (TextView) findViewById(R.id.qla4);
        tvc = (TextView) findViewById(R.id.cla4);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }

    public void rem_la4(View v) {
        Toast.makeText(getApplicationContext(), "Keyboard Removed from cart", Toast.LENGTH_SHORT).show();
        SharedPreferences details = getSharedPreferences("Details", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = details.edit();
        int qty = details.getInt("qla4", 0);
        qty = qty - 1;
        int cost = qty * 50;
        editor.putInt("qla4", qty);
        editor.apply();
        flag--;
        total -= 50;
        if(qty<1){
            tr = (TableRow) findViewById(R.id.la4);
            tr.setVisibility(View.GONE);
            computecost(flag,total);
            return;
        }
        tvq = (TextView) findViewById(R.id.qla4);
        tvc = (TextView) findViewById(R.id.cla4);
        tvq.setText(String.valueOf(qty));
        tvc.setText(String.valueOf(cost));
        computecost(flag,total);
    }
}
