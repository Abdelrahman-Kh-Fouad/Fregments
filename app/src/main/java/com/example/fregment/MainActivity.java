package com.example.fregment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.fragment.*;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fregmant upFragment = new Fregmant();
        fragmentManager.beginTransaction().add(R.id.up , upFragment).commit();
        Fregmant interFragment = new Fregmant();
        fragmentManager.beginTransaction().add(R.id.inter , interFragment).commit();
        Fregmant downFragment = new Fregmant();
        fragmentManager.beginTransaction().add(R.id.down , downFragment).commit();



    }
}