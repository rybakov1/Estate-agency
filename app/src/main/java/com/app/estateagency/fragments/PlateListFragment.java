package com.app.estateagency.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.estateagency.Apartment;
import com.app.estateagency.ApartmentAdapter;
import com.app.estateagency.R;

import java.util.ArrayList;
import java.util.List;


public class PlateListFragment extends Fragment {

    public PlateListFragment() {
    }

    public static PlateListFragment newInstance() {
        return new PlateListFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_plate_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Apartment> aparts = new ArrayList<>();

        int[] images = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_background};
        aparts.add(new Apartment(11212421, images, 1230000, "wow", "м. Фрунзенская"));
        aparts.add(new Apartment(22212421, images, 40000, "wow", "м. Московская"));
        aparts.add(new Apartment(33212421, images, 1000, "wow", "м. ЗЕмлянная"));

        RecyclerView recyclerView = view.findViewById(R.id.plate_list_fragment_recycleview);
        ApartmentAdapter adapter = new ApartmentAdapter(aparts);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
    }
}