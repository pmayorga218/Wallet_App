package com.paulamayorga.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class ListCategoryActivity extends AppCompatActivity {
    private ArrayList<Category> listCategory = new ArrayList<>();
    private RecyclerView myReclycleAccount1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_category);
        loadFakeData();

        myReclycleAccount1 = findViewById(R.id.rv_list_category);
        CategoryAdapter myAdapter = new CategoryAdapter(listCategory);
        myReclycleAccount1.setAdapter(myAdapter);
        myReclycleAccount1.setLayoutManager(new LinearLayoutManager(ListCategoryActivity.this));


    }

    private void loadFakeData(){
        Category myCategory1 = new Category("Restaurante", "Cuenta de ahorros","#FFFF0000" ,"https://cdn-icons-png.flaticon.com/512/1996/1996055.png");
        Category myCategory2 = new Category("Gasolina", "Cuenta debito", "FF26FF00","https://cdn-icons-png.flaticon.com/512/2554/2554991.png");
        Category myCategory3 = new Category("Arriendo", "Tarjeta de crédito", "FF001AFF","https://cdn-icons-png.flaticon.com/512/2558/2558072.png");
        listCategory.add(myCategory1);
        listCategory.add(myCategory2);
        listCategory.add(myCategory3);
    }
}

