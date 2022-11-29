package com.app.estateagency;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.app.estateagency.fragments.PlateListFragment;

import java.util.ArrayList;
import java.util.List;

public class MainScreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        PlateListFragment plateListFragment = PlateListFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_fragment, plateListFragment)
                .addToBackStack(null)
                .commit();
    }
}