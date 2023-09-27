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
        Account myAccount1 = new Account("Bancolombia", "Cuenta de ahorros", 10003402.0,"https://www.wradio.com.co/resizer/MdKkwbwW3966bveYe-g1UYpr144=/800x0/filters:format(jpg):quality(70)/cloudfront-us-east-1.images.arcpublishing.com/prisaradioco/FAKX7DE4Q5B73NRKRFSZD72R6Y.jpg");
        Account myAccount2 = new Account("Davivienda", "Cuenta debito", 10003402.0,"https://i.pinimg.com/originals/92/61/91/926191354beba38c7c6a82ee21597e50.png");
        Account myAccount3 = new Account("Efectivo", "Tarjeta de crédito", 1058402.0,"https://previews.123rf.com/images/photoplotnikov/photoplotnikov1602/photoplotnikov160200038/53961327-mano-que-sostiene-el-dinero-en-billetes-en-efectivo-en-la-mano-tipo-de-pago-ilustraci%C3%B3n-del.jpg");
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
    }
}