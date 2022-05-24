package com.ranawat.e_ranawatshop.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.ranawat.e_ranawatshop.R;
import com.ranawat.e_ranawatshop.adapters.CategoryAdapter;
import com.ranawat.e_ranawatshop.adapters.ProductAdapter;
import com.ranawat.e_ranawatshop.databinding.ActivityMainBinding;
import com.ranawat.e_ranawatshop.models.Category;
import com.ranawat.e_ranawatshop.models.Product;
import com.ranawat.e_ranawatshop.utils.Constants;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.concurrent.CompletionService;
import java.util.jar.JarException;

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

        initSlider();
        initCategories();
        initProducts();

        getCategories();



    }


    void initCategories(){
        categories =new ArrayList<>();
        categoryAdapter =new CategoryAdapter(this,categories);


        GridLayoutManager layoutManager=new GridLayoutManager(this,4);
        binding.categoryList.setLayoutManager(layoutManager);
        binding.categoryList.setAdapter(categoryAdapter);


    }

    void getCategories() {
        RequestQueue queue = Volley.newRequestQueue(this);

        StringRequest request = new StringRequest(Request.Method.GET, Constants.GET_CATEGORIES_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    Log.e("err", response);
                    JSONObject mainObj = new JSONObject(response);
                    if(mainObj.getString("status").equals("success")) {
                        JSONArray categoriesArray = mainObj.getJSONArray("categories");
                        for(int i =0; i< categoriesArray.length(); i++) {
                            JSONObject object = categoriesArray.getJSONObject(i);
                            Category category = new Category(
                                    object.getString("name"),
                                    Constants.CATEGORIES_IMAGE_URL + object.getString("icon"),
                                    object.getString("color"),
                                    object.getString("brief"),
                                    object.getInt("id")
                            );
                            categories.add(category);
                        }
                        categoryAdapter.notifyDataSetChanged();
                    }  // DO nothing

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        queue.add(request);
    }

    void getRecentProducts(){
        RequestQueue queue=Volley.newRequestQueue(this);

        String url=Constants.GET_PRODUCTS_URL +"?count=10";
        StringRequest request= new StringRequest(Request.Method.GET, url, response -> {

            try {
                JSONObject object=new JSONObject(response);
                if (object.getString("status").equals("success")){
                    JSONArray productArray= object.getJSONArray("products");
                    for(int i =0; i< productArray.length(); i++) {
                        JSONObject childObj = productArray.getJSONObject(i);
                        Product product = new Product(
                                childObj.getString("name"),
                                Constants.PRODUCTS_IMAGE_URL + childObj.getString("image"),
                                childObj.getString("status"),
                                childObj.getDouble("price"),
                                childObj.getDouble("price_discount"),
                                childObj.getInt("stock"),
                                childObj.getInt("id")

                        );
                        products.add(product);
                    }
                    productAdapter.notifyDataSetChanged();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }, error -> {

        });
        queue.add(request);
    }

    void getRecentOffers(){
        RequestQueue queue=Volley.newRequestQueue(this);

        StringRequest request=new StringRequest(Request.Method.GET, Constants.GET_OFFERS_URL, response -> {
            try {
                JSONObject object =new JSONObject(response);
                if (object.getString("status").equals("success")){
                    JSONArray offerArray =object.getJSONArray("news_infos");
                    for (int i=0;i< offerArray.length();i++){
                        JSONObject childObj =offerArray.getJSONObject(i);
                        binding.carousel.addData(
                                new CarouselItem(
                                        Constants.NEWS_IMAGE_URL +childObj.getString("image"),
                                        childObj.getString("title")
                                )
                        );
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }


        }, error -> {


        });
        queue.add(request);
    }

    private void initSlider() {
        getRecentOffers();
           }

    void initProducts(){
        products= new ArrayList<>();
        productAdapter=new ProductAdapter(this,products);

        getRecentProducts();
        GridLayoutManager layoutManager=new GridLayoutManager(this,2);
        binding.productReView.setLayoutManager(layoutManager);
        binding.productReView.setAdapter(productAdapter);



    }
}