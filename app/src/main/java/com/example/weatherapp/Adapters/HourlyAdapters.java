package com.example.weatherapp.Adapters;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherapp.Domains.Hourly;

public class HourlyAdapters extends RecyclerView.Adapter<HourlyAdapters.viewHolder> {
    @NonNull
    @Override
    public HourlyAdapters.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HourlyAdapters.viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolder extends  RecyclerView.ViewHolder{
        TextView hour,temp;
        ImageView picPath;
        public viewHolder(@NonNull ViewGroup parent) {
            super(parent);
        }

    }

}
