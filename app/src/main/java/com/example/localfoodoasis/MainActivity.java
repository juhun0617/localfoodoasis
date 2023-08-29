package com.example.localfoodoasis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    FruitFragment fruitFragment;
    VegetableFragment vegetableFragment;
    SeafoodFragment seafoodFragment;
    MeatFragment meatFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.logoBack).bringToFront();
        findViewById(R.id.imageView2).bringToFront();
        findViewById(R.id.searchView2).bringToFront();





        fruitFragment = new FruitFragment();
        vegetableFragment = new VegetableFragment();
        seafoodFragment = new SeafoodFragment();
        meatFragment = new MeatFragment();




        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, fruitFragment).commit();
            final View indicatorFruits = findViewById(R.id.indicator_fruit);
            indicatorFruits.setVisibility(View.VISIBLE);
        }

        Animation fadeInAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);


        Button buttonFruits = (Button)findViewById(R.id.button13);
        final View indicatorFruits = findViewById(R.id.indicator_fruit);


        Button buttonVegetable = (Button)findViewById(R.id.button11);
        final View indicatorVegetable = findViewById(R.id.indicator_vegetable);

        Button buttonSeafood = (Button)findViewById(R.id.button12);
        final View indicatorSeafood = findViewById(R.id.indicator_seafood);

        Button buttonMeat = (Button)findViewById(R.id.button10);
        final View indicatorMeat = findViewById(R.id.indicator_meat);


        buttonFruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fruitFragment).commit();
                indicatorFruits.setVisibility(View.VISIBLE);
                indicatorFruits.startAnimation(fadeInAnimation);
                indicatorVegetable.setVisibility(View.GONE);
                indicatorSeafood.setVisibility(View.GONE);
                indicatorMeat.setVisibility(View.GONE);
            }
        });

        buttonVegetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,vegetableFragment).commit();
                indicatorVegetable.setVisibility(View.VISIBLE);
                indicatorVegetable.startAnimation(fadeInAnimation);
                indicatorFruits.setVisibility(View.GONE);
                indicatorSeafood.setVisibility(View.GONE);
                indicatorMeat.setVisibility(View.GONE);
            }
        });

        buttonSeafood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,seafoodFragment).commit();
                indicatorSeafood.setVisibility(View.VISIBLE);
                indicatorSeafood.startAnimation(fadeInAnimation);
                indicatorFruits.setVisibility(View.GONE);
                indicatorVegetable.setVisibility(View.GONE);
                indicatorMeat.setVisibility(View.GONE);
            }
        });

        buttonMeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,meatFragment).commit();
                indicatorMeat.setVisibility(View.VISIBLE);
                indicatorMeat.startAnimation(fadeInAnimation);
                indicatorFruits.setVisibility(View.GONE);
                indicatorSeafood.setVisibility(View.GONE);
                indicatorVegetable.setVisibility(View.GONE);
            }
        });

        ConstraintLayout home = findViewById(R.id.shop);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, recommend.class);
                startActivity(intent);


            }
        });


        SearchView searchView = findViewById(R.id.searchView2);
        int searchIconId = searchView.getContext().getResources().getIdentifier("android:id/search_mag_icon", null, null);
        ImageView searchIcon = (ImageView) searchView.findViewById(searchIconId);
    }
}
