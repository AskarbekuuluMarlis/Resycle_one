package com.example.resycle;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    private TextView tvAnimal;

    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        tvAnimal = itemView.findViewById(R.id.tv_animal);
    }

    void bind(String animal) {

        tvAnimal.setText(animal);
    }

}
