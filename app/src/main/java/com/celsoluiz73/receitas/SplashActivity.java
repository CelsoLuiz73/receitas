package com.celsoluiz73.receitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.celsoluiz73.receitas.R.id.imageView2;

public class SplashActivity extends AppCompatActivity {

    ImageView imageViewSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageViewSplash = findViewById(imageView2);

        imageViewSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(SplashActivity.this,CategoriaActivity.class));
            }
        });
    }
}









