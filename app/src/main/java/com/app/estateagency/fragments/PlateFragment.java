package com.app.estateagency.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.app.estateagency.R;

public class PlateFragment extends Fragment {
    private static final String PLATE_ID = "PLATE_ID";

    private int plate_id;

    public PlateFragment() {
    }

    public static PlateFragment newInstance(int plate_id) {
        PlateFragment fragment = new PlateFragment();
        Bundle args = new Bundle();
        args.putInt(PLATE_ID, plate_id);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            plate_id = getArguments().getInt(PLATE_ID);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_plate, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Toolbar toolbar = view.findViewById(R.id.plate_fragment_top_app_bar);
        toolbar.setTitle(String.valueOf(plate_id));
    }
}