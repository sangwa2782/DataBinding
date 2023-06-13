package com.ajayam.p28_databinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ajayam.p28_databinding.databinding.ActivitySecondPageBinding;

public class SecondPage extends AppCompatActivity {
    ActivitySecondPageBinding page2Binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page2Binding=ActivitySecondPageBinding.inflate(getLayoutInflater());
        setContentView(page2Binding.getRoot());


        page2Binding.t1.setText("This value is also changed");

    }
}