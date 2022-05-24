package com.ranawat.e_ranawatshop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ranawat.e_ranawatshop.databinding.ActivityCardBinding;

public class CartActivity extends AppCompatActivity {
    ActivityCardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}