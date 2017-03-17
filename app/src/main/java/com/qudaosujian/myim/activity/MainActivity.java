package com.qudaosujian.myim.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.qudaosujian.myim.R;
import com.qudaosujian.myim.view.refresh.MaterialRefreshLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.contacts_recyclerview)
    RecyclerView contactsRecyclerview;
    @BindView(R.id.contacts_refresh)
    MaterialRefreshLayout contactsRefresh;

    public static void launch(Context context) {
        if (context == null) return;
        Intent in = new Intent(context, MainActivity.class);
        context.startActivity(in);
    }

    public static void startActivity(Context context, Class activityClass) {
        if (context == null) return;
        Intent in = new Intent(context, activityClass);
        context.startActivity(in);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

}
