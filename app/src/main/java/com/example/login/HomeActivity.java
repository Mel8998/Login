package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class HomeActivity extends AppCompatActivity {
    private ImageView backgroundImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.backgroundImage=findViewById(R.id.backgroundImage);
        String url="https://i.imgur.com/DvpvklR.png";
        Picasso.get().load(url).into(this.backgroundImage);
    }
}