package com.example.srinivas.shopmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvEmail = (TextView) findViewById(R.id.tvEmailProfile);
        tvEmail.setText(getIntent().getExtras().getString("Email"));
    }

    public void Addstore(View view) {

        Intent intent=new Intent(ProfileActivity.this,AddstoreActivity.class);
        startActivity(intent);
    }

    public void Viewstore(View view) {

        Intent intent=new Intent(ProfileActivity.this,ViewstoreActivity.class);
        startActivity(intent);
    }
}
