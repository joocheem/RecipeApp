package com.example.jochemmortiers.recipeapp;

import android.support.v4.app.Fragment;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;

@EFragment(R.layout.fragment_recept)
public class ReceptFragment extends Fragment {

    @ViewById(R.id.picture)
    ImageView imageView;

    @ViewById(R.id.name)
    TextView name;

    @ViewById(R.id.ingredients)
    TextView ingredients;

    @FragmentArg
    Recept recept;

    @AfterViews
    void init(){
        Glide.with(this).load(recept.getImageUrl()).into(imageView);
        name.setText(recept.getTitle());
    }

}
