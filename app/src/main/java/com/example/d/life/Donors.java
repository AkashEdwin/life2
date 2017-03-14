package com.example.d.life;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.database.sqlite.SQLiteDatabase;

public class Donors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_donors );
        SQLiteDatabase mydatabase = openOrCreateDatabase("db",MODE_PRIVATE,null);
       }
}

