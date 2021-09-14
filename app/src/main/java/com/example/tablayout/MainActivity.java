package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    ViewpagerAdapter  viewpagerAdapter;
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    private String[] title= new String[]{"Stock","New Stock"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2=findViewById(R.id.view_pager1);
        tabLayout = findViewById(R.id.tab_layout);
        viewpagerAdapter = new ViewpagerAdapter(this);

        viewPager2.setAdapter(viewpagerAdapter);

        new TabLayoutMediator(tabLayout,viewPager2,((tab, position) -> tab.setText(title[position]))).attach();


    }
}