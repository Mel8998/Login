package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SignInActivity extends AppCompatActivity {
    private Spinner age;
    private String[] listaEdad={"16","17","18","19","20","21","22","23","24","25","26","27",
    "28","29","30","31","32","33","34","35","36","37","38","39","40"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        age = findViewById(R.id.spinner);
        ArrayAdapter ad
                = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                listaEdad);
        age.setAdapter(ad);

    }
}