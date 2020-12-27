package com.project.laundryappui.menu.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.project.laundryappui.R;

import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder>{
    List<SearchModel> listSearch;

    public SearchAdapter(List<SearchModel> listSearch) {
        this.listSearch = listSearch;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_maps, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SearchModel list = listSearch.get(position);

        holder.textName.setText(list.getName());
        holder.textScore.setText(list.getScore());
        holder.textLocation.setText(list.getLocation());
        holder.containerMaps.setOnClickListener(view -> Toast.makeText(view.getContext(), "Clicked!", Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return listSearch.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView containerMaps;
        TextView textScore, textName, textLocation;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            containerMaps   = itemView.findViewById(R.id.container_recommended);
            textName        = itemView.findViewById(R.id.item_recommended_name);
            textScore       = itemView.findViewById(R.id.item_recommended_price);
            textLocation    = itemView.findViewById(R.id.item_recommended_location);
        }
    }
}
