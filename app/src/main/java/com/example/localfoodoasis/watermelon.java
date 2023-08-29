package com.example.localfoodoasis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
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

        MyAdapter.ItemData item1 = new MyAdapter.ItemData("18,000원","이정심","전라남도 장성군 남면","2023-08-23","010-1234-5678",R.drawable.melon);
        myDataList.add(item1);

        MyAdapter.ItemData item2 = new MyAdapter.ItemData("19,500원","김혜진","전라남도 나주시 동면","2023-08-07","010-2345-6789",R.drawable.melon2);
        myDataList.add(item2);
        RecyclerView recyclerView = findViewById(R.id.listview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(myDataList));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);

        ConstraintLayout home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(watermelon.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });


    }





}

