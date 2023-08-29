package com.example.localfoodoasis;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class recommend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);
        List<ShopItem> shopItems = new ArrayList<>();
        ShopItem item1 = new ShopItem("옐로우시티장성로컬푸드직매장","광주 북구 오룡동",true);
        shopItems.add(item1);
        RecyclerView recyclerView = findViewById(R.id.item_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ShopAdapter adapter = new ShopAdapter(this, shopItems);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);

    }



}