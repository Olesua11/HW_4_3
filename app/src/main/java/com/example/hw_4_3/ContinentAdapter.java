package com.example.hw_4_3;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw_4_3.databinding.ItemMultcontsBinding;

import java.util.ArrayList;

public class ContinentAdapter  extends RecyclerView.Adapter <ViewHolder> {

   import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw_4_3.databinding.ItemMultcontsBinding;

import java.util.ArrayList;

    public class СontinentAdapter extends RecyclerView.Adapter<ViewHolder> {

        private ArrayList<ContinentModel> continentList;
        private OnitemClick onClick;

        public continentAdapter(ArrayList<ContinentModel> continentList, OnitemClick onClick) {
            this.continentList = continentList;
            this.onClick = onClick;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolder(ItemMultcontsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
            holder.onBind(continentList.get(position));
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    onClick.OnitemClick(position);
                }
            });
        }

        @Override
        public int getItemCount() {
            return continentList.size();
        }
    }






    class ViewHolder extends RecyclerView.ViewHolder {
private  ItemMultcontsBinding binding;
    public ViewHolder(@NonNull ItemMultcontsBinding binding) {
        super(binding.getRoot());
       this.binding = binding;
    }
    public void onBind(ContinentModel continent){
        binding.contName.setText(continent.getName());
        Glide.with(binding.imgPin).load(continent.getContinent()).into(binding.imgPin);

    }
}}