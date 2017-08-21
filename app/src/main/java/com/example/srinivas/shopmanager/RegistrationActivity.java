package com.example.srinivas.shopmanager;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

    }

    public void Fruits(View view) {

        Intent intent=new Intent(RegistrationActivity.this,FruitsActivity.class);
        startActivity(intent);
    }

    public void Vegitables(View view){

        Intent intent=new Intent(RegistrationActivity.this,VegitablesActivity.class);
        startActivity(intent);
        }
     public void Grocerys(View view){
         
         Intent intent=new Intent(RegistrationActivity.this,GroceryActivity.class);
         startActivity(intent);
     }   

    }

