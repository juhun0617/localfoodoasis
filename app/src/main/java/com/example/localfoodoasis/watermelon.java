package com.example.localfoodoasis;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class watermelon extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watermelon);
        Spinner spinner = findViewById(R.id.spiner);
        String[] location = {"장성로컬푸드직매장","농협하나로광천점"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.sppiner_item,location);
        spinner.setAdapter(adapter);

        List<MyAdapter.ItemData> myDataList = new ArrayList<>();

        MyAdapter.ItemData item1 = new MyAdapter.ItemData("18,000원","박주훈","전라남도 장성군 남면","2023-08-23","010-1234-5678",R.drawable.melon);
        myDataList.add(item1);

        RecyclerView recyclerView = findViewById(R.id.listview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(myDataList));


    }





}

