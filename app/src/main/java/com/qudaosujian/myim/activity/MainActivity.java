package com.qudaosujian.myim.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.qudaosujian.myim.R;

public class MainActivity extends AppCompatActivity {

    public static void launch(Context context) {
        if (context == null) return;
        Intent in = new Intent(context, MainActivity.class);
        context.startActivity(in);
    }

    public static void startActivity(Context context , Class activityClass){
        if (context == null) return;
        Intent in = new Intent(context,activityClass);
        context.startActivity(in);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
