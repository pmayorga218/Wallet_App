package com.paulamayorga.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRV = new ArrayList<>();
    private RecyclerView myReclycleAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();

        myReclycleAccount = findViewById(R.id.rv_list_accounts);
        AccountAdapter myAdaptador = new AccountAdapter(listAccountRV);
        myReclycleAccount.setAdapter(myAdaptador);
        myReclycleAccount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));


    }

    private void loadFakeData(){
        Account myAccount1 = new Account("Bancolombia", "Cuenta de ahorros", 10003402.0);
        Account myAccount2 = new Account("Davivienda", "Cuenta debito", 10003402.0);
        Account myAccount3 = new Account("Efectivo", "Tarjeta de crédito", 1058402.0);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
    }
}