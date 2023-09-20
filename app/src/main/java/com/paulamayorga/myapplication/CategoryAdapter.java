package com.paulamayorga.myapplication;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private ArrayList<Category> dataSet;

    public CategoryAdapter(ArrayList<Category> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_list, parent, false);

        return new ViewHolder(myView);
    }


    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {
        Category myCategory = dataSet.get(position);
        holder.loadInfo(myCategory);

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvCategory;
        private ImageView ivCategoryImage;
        private ImageButton btnColor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvCategory = itemView.findViewById(R.id.tv_category);
            ivCategoryImage = itemView.findViewById(R.id.iv_category_image);
            btnColor = itemView.findViewById(R.id.btn_color);
        }

        public void loadInfo(Category myCategory) {
            tvCategory.setText(myCategory.getName());
            btnColor.setBackgroundColor(Color.parseColor(myCategory.getColor()));

            Picasso
                    .get()
                    .load(myCategory.getIcon())
                    .placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)
                    .into(ivCategoryImage);

        }
    }
}

