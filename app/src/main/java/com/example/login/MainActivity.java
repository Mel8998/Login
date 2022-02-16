package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView logo;
    private Button buttonLogin,buttonRegist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo=findViewById(R.id.logoLogin);
        logo.setImageResource(R.drawable.logo);

        this.buttonLogin=findViewById(R.id.button_login);
        this.buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,getText(R.string.mensaje_login),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);

                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });
        this.buttonRegist=findViewById(R.id.button2);
        this.buttonRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignInActivity.class);

                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });
    }
}