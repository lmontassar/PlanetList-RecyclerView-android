package com.example.recycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder> {

    private List<Planet> planets;
    private Context context;

    public PlanetAdapter(Context context,List<Planet> planets) {
        this.planets = planets;
        this.context = context;
    }

    @Override
    public PlanetViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_planet, parent, false);
        return new PlanetViewHolder(view);
    }

    @Override
    public void onBindViewHolder( PlanetViewHolder holder, int position) {
        Planet planet = planets.get(position);
        holder.planetName.setText(planet.getName());
        holder.planetDescription.setText(planet.getDescription());
        holder.planetImage.setImageResource(planet.getImageResourceId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, PlanetDetail.class);
            intent.putExtra(PlanetDetail.EXTRA_PLANET_NAME, planet.getName());
            intent.putExtra(PlanetDetail.EXTRA_PLANET_DESCRIPTION, planet.getDescription());
            intent.putExtra(PlanetDetail.EXTRA_PLANET_IMAGE, planet.getImageResourceId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return planets.size();
    }

    static class PlanetViewHolder extends RecyclerView.ViewHolder {
        ImageView planetImage;
        TextView planetName;
        TextView planetDescription;

        PlanetViewHolder(View itemView) {
            super(itemView);
            planetImage = itemView.findViewById(R.id.planetImage);
            planetName = itemView.findViewById(R.id.planetName);
            planetDescription = itemView.findViewById(R.id.planetDescription);
        }
    }
}
