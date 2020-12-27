package com.project.laundryappui.menu.home.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.project.laundryappui.R;
import com.project.laundryappui.menu.home.home_detail.HomeDetailActivity;
import com.project.laundryappui.menu.home.model.HomeModel;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    List<HomeModel> listHome;

    public HomeAdapter(List<HomeModel> listHome) {
        this.listHome = listHome;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recommended, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HomeModel list = listHome.get(position);

        holder.imageRecommended.setBackgroundResource(list.getImage());
        holder.textName.setText(list.getName());
        holder.textPrice.setText(list.getPrice());
        holder.textLocation.setText(list.getLocation());
        holder.containerRecommended.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), HomeDetailActivity.class));
//                Toast.makeText(view.getContext(), "Clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listHome.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView containerRecommended;
        ImageView imageRecommended;
        TextView textPrice, textName, textLocation;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            containerRecommended = itemView.findViewById(R.id.container_recommended);
            imageRecommended     = itemView.findViewById(R.id.item_recommended_image);
            textName             = itemView.findViewById(R.id.item_recommended_name);
            textPrice            = itemView.findViewById(R.id.item_recommended_price);
            textLocation         = itemView.findViewById(R.id.item_recommended_location);
        }
    }
}
