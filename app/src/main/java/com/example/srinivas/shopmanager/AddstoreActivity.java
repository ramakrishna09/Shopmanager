package com.example.srinivas.shopmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddstoreActivity extends AppCompatActivity {
   private EditText id, name, loc;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addstore);

        id=(EditText)findViewById(R.id.editText_id);
        name=(EditText)findViewById(R.id.editText_n);
        loc=(EditText)findViewById(R.id.editText_l);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReferenceFromUrl("https://shopmanager-c94e7.firebaseio.com/Stores");

    }

    public void Save(View view) {

        DatabaseReference i=databaseReference.push();
        i.child("id").setValue(id.getText().toString());
        i.child("name").setValue(name.getText().toString());
        i.child("loc").setValue(loc.getText().toString());

        Intent intent=new Intent(AddstoreActivity.this,ViewstoreActivity.class);
        startActivity(intent);


    }
}
