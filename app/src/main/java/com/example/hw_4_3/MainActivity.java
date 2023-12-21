package com.example.hw_4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hw_4_3.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
getSupportFragmentManager().beginTransaction().add(R.id.conteiner, new ContinentFragment()).commit();

    }

}