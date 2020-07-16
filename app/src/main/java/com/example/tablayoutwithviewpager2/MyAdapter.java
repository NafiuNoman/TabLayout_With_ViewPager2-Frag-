package com.example.tablayoutwithviewpager2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdapter extends FragmentStateAdapter {
    public MyAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
                return new FavoriteFragment();
            case 1:
                return new HomeFragment();
            default:
                return new TopFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
