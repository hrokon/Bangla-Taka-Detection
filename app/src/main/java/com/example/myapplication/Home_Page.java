package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Home_Page extends AppCompatActivity {



    Button profile , rating , video ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        profile = findViewById(R.id.Profile) ;
        rating = findViewById(R.id.Rating)  ;
        video = findViewById(R.id.Video) ;

        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, RatingApp.class));
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, UserProfile_Page.class));
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, Youtube_Video_Embedded.class));
            }
        });
    }
}