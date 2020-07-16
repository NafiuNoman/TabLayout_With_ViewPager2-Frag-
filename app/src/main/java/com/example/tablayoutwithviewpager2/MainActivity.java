package com.example.tablayoutwithviewpager2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayoutId);
        viewPager2 = findViewById(R.id.viewPagerId);


       MyAdapter myAdapter = new MyAdapter(this);

       viewPager2.setAdapter(myAdapter);


        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position)
                {
                    case 0:
                        tab.setText("FAVORITES");
                        tab.setIcon(R.drawable.favorite);
                        break;

                    case 1:
                        tab.setText("HOME");
                        tab.setIcon(R.drawable.home);
                        break;

                    case 2:
                        tab.setText("TOP");
                        tab.setIcon(R.drawable.top);
                        break;
                }

            }
        });

        tabLayoutMediator.attach();





    }
}