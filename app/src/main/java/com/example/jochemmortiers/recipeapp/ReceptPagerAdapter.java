package com.example.jochemmortiers.recipeapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class ReceptPagerAdapter extends FragmentPagerAdapter {

    List<Recept> items;

    public ReceptPagerAdapter(FragmentManager fragmentManager, List<Recept> mRecipes) {
        super(fragmentManager);
        this.items = mRecipes;
    }

    public void setItems(List<Recept> pItems){
        items = pItems;
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return ReceptFragment_.builder().recept(items.get(position)).build();
    }

    @Override
    public int getCount() {
        return items.size();
    }
}
