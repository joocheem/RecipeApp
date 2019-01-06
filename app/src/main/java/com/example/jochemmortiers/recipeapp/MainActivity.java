package com.example.jochemmortiers.recipeapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;
import retrofit2.Call;
import retrofit2.Response;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.viewPager)
    ViewPager viewPager;
    ReceptPagerAdapter mAdapter;
    List<Recept> mRecipes = new ArrayList<>();

    @AfterViews
    void init() {
        mAdapter = new ReceptPagerAdapter(getSupportFragmentManager(), mRecipes);
        viewPager.setAdapter(mAdapter);

        requestData();
    }

    public void requestData() {
        APIService service = APIService.retrofit.create(APIService.class);
        Call<APIAnswer> call = service.getRecepten();
        call.enqueue(new Callback<APIAnswer>() {
            @Override
            public void onResponse(Call<APIAnswer> call, Response<APIAnswer> response) {
                mAdapter.setItems(response.body().recipes);
            }

            @Override
            public void onFailure(Call<APIAnswer> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
