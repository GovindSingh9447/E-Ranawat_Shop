package com.ranawat.e_ranawatshop.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.ranawat.e_ranawatshop.R;
import com.ranawat.e_ranawatshop.adapters.CategoryAdapter;
import com.ranawat.e_ranawatshop.adapters.ProductAdapter;
import com.ranawat.e_ranawatshop.databinding.ActivityMainBinding;
import com.ranawat.e_ranawatshop.models.Category;
import com.ranawat.e_ranawatshop.models.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    CategoryAdapter categoryAdapter;
    ArrayList<Category> categories;

    ProductAdapter productAdapter;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initCategories();

        iniProducts();

    }
    void initCategories(){
        categories =new ArrayList<>();
        //  categories.add(new Category("Sports & Outdoor ", " ", " ", " ",1));
        //  categories.add(new Category("Women's Fashion ", " ", " ", " ",1));
        categories.add(new Category("Home & Lifestyle ", "https://imgs.search.brave.com/AjKOBvJ3VJa5EbDfKzBT1FOjHPezxve7SWe9mZO5vnk/rs:fit:474:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5v/eldheHlrYUpCa0FM/c1FZX041em93SGFI/YSZwaWQ9QXBp", "#18eb4e", " dfxgdgdxgfxgjxghxcxhgfxgjxgx kfkiyfkyhg kfhgc kgcfj",1));
        //categories.add(new Category("Heath & Beauty ", " ", " ", " ",1));
        categories.add(new Category("Food & Groceries ", "https://imgs.search.brave.com/k-7eKCWWwkgcwe2s_5OKOjbdZFOdeuvkiNZRUEq--L0/rs:fit:512:512:1/g:ce/aHR0cHM6Ly9jZG4x/Lmljb25maW5kZXIu/Y29tL2RhdGEvaWNv/bnMvZWNvbW1lcmNl/LXZvbDEtZmlsbGVk/LW91dGxpbmUtYnVr/ZWljb24vMzIvYnVy/Z2VyX2Zvb2RfY2F0/ZWdvcnlfZWNvbW1l/cmNlX2J1a2VpY29u/X29ubGluZV9zaG9w/LTUxMi5wbmc ", "#18eb4e", " dfxgdgdxgfxgjxghxcxhgfxgjxgx kfkiyfkyhg kfhgc kgcfj",1));
        categoryAdapter = new CategoryAdapter(this, categories);
        categories.add(new Category("Home & Lifestyle ", "https://imgs.search.brave.com/AjKOBvJ3VJa5EbDfKzBT1FOjHPezxve7SWe9mZO5vnk/rs:fit:474:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5v/eldheHlrYUpCa0FM/c1FZX041em93SGFI/YSZwaWQ9QXBp", "#18eb4e", " dfxgdgdxgfxgjxghxcxhgfxgjxgx kfkiyfkyhg kfhgc kgcfj",1));
        categories.add(new Category("Home & Lifestyle ", "https://imgs.search.brave.com/AjKOBvJ3VJa5EbDfKzBT1FOjHPezxve7SWe9mZO5vnk/rs:fit:474:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5v/eldheHlrYUpCa0FM/c1FZX041em93SGFI/YSZwaWQ9QXBp", "#18eb4e", " dfxgdgdxgfxgjxghxcxhgfxgjxgx kfkiyfkyhg kfhgc kgcfj",1));
        categories.add(new Category("Home & Lifestyle ", "https://imgs.search.brave.com/AjKOBvJ3VJa5EbDfKzBT1FOjHPezxve7SWe9mZO5vnk/rs:fit:474:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5v/eldheHlrYUpCa0FM/c1FZX041em93SGFI/YSZwaWQ9QXBp", "#18eb4e", " dfxgdgdxgfxgjxghxcxhgfxgjxgx kfkiyfkyhg kfhgc kgcfj",1));
        categories.add(new Category("Home & Lifestyle ", "https://imgs.search.brave.com/AjKOBvJ3VJa5EbDfKzBT1FOjHPezxve7SWe9mZO5vnk/rs:fit:474:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5v/eldheHlrYUpCa0FM/c1FZX041em93SGFI/YSZwaWQ9QXBp", "#18eb4e", " dfxgdgdxgfxgjxghxcxhgfxgjxgx kfkiyfkyhg kfhgc kgcfj",1));
        categories.add(new Category("Home & Lifestyle ", "https://imgs.search.brave.com/AjKOBvJ3VJa5EbDfKzBT1FOjHPezxve7SWe9mZO5vnk/rs:fit:474:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5v/eldheHlrYUpCa0FM/c1FZX041em93SGFI/YSZwaWQ9QXBp", "#18eb4e", " dfxgdgdxgfxgjxghxcxhgfxgjxgx kfkiyfkyhg kfhgc kgcfj",1));
        categories.add(new Category("Home & Lifestyle ", "https://imgs.search.brave.com/AjKOBvJ3VJa5EbDfKzBT1FOjHPezxve7SWe9mZO5vnk/rs:fit:474:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5v/eldheHlrYUpCa0FM/c1FZX041em93SGFI/YSZwaWQ9QXBp", "#18eb4e", " dfxgdgdxgfxgjxghxcxhgfxgjxgx kfkiyfkyhg kfhgc kgcfj",1));
        categories.add(new Category("Home & Lifestyle ", "https://imgs.search.brave.com/AjKOBvJ3VJa5EbDfKzBT1FOjHPezxve7SWe9mZO5vnk/rs:fit:474:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5v/eldheHlrYUpCa0FM/c1FZX041em93SGFI/YSZwaWQ9QXBp", "#18eb4e", " dfxgdgdxgfxgjxghxcxhgfxgjxgx kfkiyfkyhg kfhgc kgcfj",1));


        GridLayoutManager layoutManager=new GridLayoutManager(this,4);
        binding.categoryList.setLayoutManager(layoutManager);
        binding.categoryList.setAdapter(categoryAdapter);


    }

    void iniProducts(){
        products= new ArrayList<>();
        productAdapter=new ProductAdapter(this,products);

        products.add(new Product("Home & Lifestyle ", "https://imgs.search.brave.com/AjKOBvJ3VJa5EbDfKzBT1FOjHPezxve7SWe9mZO5vnk/rs:fit:474:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5v/eldheHlrYUpCa0FM/c1FZX041em93SGFI/YSZwaWQ9QXBp", "#18eb4e", 2,8,5,1));

        products.add(new Product("Home & Lifestyle ", "https://imgs.search.brave.com/AjKOBvJ3VJa5EbDfKzBT1FOjHPezxve7SWe9mZO5vnk/rs:fit:474:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5v/eldheHlrYUpCa0FM/c1FZX041em93SGFI/YSZwaWQ9QXBp", "#18eb4e", 2,8,5,1));
        products.add(new Product("Home & Lifestyle ", "https://imgs.search.brave.com/AjKOBvJ3VJa5EbDfKzBT1FOjHPezxve7SWe9mZO5vnk/rs:fit:474:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5v/eldheHlrYUpCa0FM/c1FZX041em93SGFI/YSZwaWQ9QXBp", "#18eb4e", 2,8,5,1));
        products.add(new Product("Home & Lifestyle ", "https://imgs.search.brave.com/AjKOBvJ3VJa5EbDfKzBT1FOjHPezxve7SWe9mZO5vnk/rs:fit:474:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5v/eldheHlrYUpCa0FM/c1FZX041em93SGFI/YSZwaWQ9QXBp", "#18eb4e", 2,8,5,1));
        products.add(new Product("Home & Lifestyle ", "https://imgs.search.brave.com/AjKOBvJ3VJa5EbDfKzBT1FOjHPezxve7SWe9mZO5vnk/rs:fit:474:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5v/eldheHlrYUpCa0FM/c1FZX041em93SGFI/YSZwaWQ9QXBp", "#18eb4e", 2,8,5,1));



        categories.add(new Category("Home & Lifestyle ", "https://imgs.search.brave.com/AjKOBvJ3VJa5EbDfKzBT1FOjHPezxve7SWe9mZO5vnk/rs:fit:474:225:1/g:ce/aHR0cHM6Ly90c2Uy/Lm1tLmJpbmcubmV0/L3RoP2lkPU9JUC5v/eldheHlrYUpCa0FM/c1FZX041em93SGFI/YSZwaWQ9QXBp", "#18eb4e", " dfxgdgdxgfxgjxghxcxhgfxgjxgx kfkiyfkyhg kfhgc kgcfj",1));


        GridLayoutManager layoutManager=new GridLayoutManager(this,2);
        binding.productReView.setLayoutManager(layoutManager);
        binding.productReView.setAdapter(productAdapter);



    }
}