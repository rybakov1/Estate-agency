package com.app.estateagency;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.app.estateagency.fragments.PlateFragment;

import java.util.List;

public class ApartmentAdapter extends RecyclerView.Adapter<ApartmentAdapter.ViewHolder> {

    List<Apartment> aparts;

    public ApartmentAdapter(List<Apartment> aparts) {
        this.aparts = aparts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inf = LayoutInflater.from(context);

        View view = inf.inflate(R.layout.plate_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Apartment apartment = aparts.get(position);

        holder.image.setImageResource(apartment.getImages()[0]);
        holder.cost.setText(String.valueOf(apartment.getCost()));
        holder.description.setText(String.valueOf(1));
        holder.metro.setText(String.valueOf(apartment.getMetro()));

        holder.card.setOnClickListener(view -> {
            FragmentActivity activity = (FragmentActivity) holder.card.getContext();
            PlateFragment fragment = PlateFragment.newInstance(apartment.getId());

            activity.getSupportFragmentManager().beginTransaction()
                    .addToBackStack(null)
                    .replace(R.id.main_fragment, fragment)
                    .commit();
        });
    }

    @Override
    public int getItemCount() {
        return aparts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public TextView cost;
        public TextView description;
        public TextView metro;
        public CardView card;

        public ViewHolder(View view) {
            super(view);
            image = view.findViewById(R.id.plate_item_image);
            cost = view.findViewById(R.id.plate_item_cost);
            description = view.findViewById(R.id.plate_item_description);
            metro = view.findViewById(R.id.plate_item_metro);
            card = view.findViewById(R.id.plate_item_cardview);
        }
    }
}
