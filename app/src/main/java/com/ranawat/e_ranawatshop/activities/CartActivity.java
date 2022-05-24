package com.ranawat.e_ranawatshop.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.ranawat.e_ranawatshop.adapters.CartAdapter;
import com.ranawat.e_ranawatshop.databinding.ActivityCardBinding;
import com.ranawat.e_ranawatshop.models.Product;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {
    ActivityCardBinding binding;
    CartAdapter adapter;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        products=new ArrayList<>();

        products.add(new Product("Product 1","----","12345",67,45,90,6));
        products.add(new Product("Product 2","----","12345",67,45,90,6));
        products.add(new Product("Product 3","----","12345",67,45,90,6));
        products.add(new Product("Product 4","----","12345",67,45,90,6));
        products.add(new Product("Product 5","----","12345",67,45,90,6));

        adapter=new CartAdapter(this ,products);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        DividerItemDecoration itemDecoration =new DividerItemDecoration(this, layoutManager.getOrientation());
        binding.cartList.setLayoutManager(layoutManager);
        binding.cartList.addItemDecoration(itemDecoration);


        binding.cartList.setAdapter(adapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}