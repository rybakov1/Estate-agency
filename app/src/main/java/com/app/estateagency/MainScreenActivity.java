package com.app.estateagency;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainScreenActivity extends AppCompatActivity {

    List<Apartment> aparts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.plates_list);
        ApartmentAdapter adapter = new ApartmentAdapter(aparts);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    private void setInitialData() {
        int[] images = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_background};
        aparts.add(new Apartment(images, 1230000, "wow", "м. Фрунзенская"));
        aparts.add(new Apartment(images, 40000, "wow", "м. Московская"));
        aparts.add(new Apartment(images, 1000, "wow", "м. ЗЕмлянная"));
    }
}