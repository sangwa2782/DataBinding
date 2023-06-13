package com.ajayam.p28_databinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ajayam.p28_databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainxml;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainxml=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainxml.getRoot());

        mainxml.t1.setText("Here value is changed");

        mainxml.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SecondPage.class);
                startActivity(i);

            }
        });
    }
}