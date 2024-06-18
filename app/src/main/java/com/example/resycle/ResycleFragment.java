package com.example.resycle;

import static java.nio.file.Files.find;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ResycleFragment extends Fragment {

    private ArrayList<String> animalList = new ArrayList();
    private RecyclerView animalRecyclerView;
    private AnimalAdapter adapter = new AnimalAdapter(animalList);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resycle, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        animalRecyclerView = view.findViewById(R.id.recycler_view);
        animalRecyclerView.setAdapter(adapter);

    }

    private void loadData() {

        animalList.add("Мангуст");
        animalList.add("Лев");
        animalList.add("Кошка");
        animalList.add("Волк");
        animalList.add("Собака");
        animalList.add("Ястреб");
        animalList.add("Гепард");
        animalList.add("Кролик");
        animalList.add("Тигр");
        animalList.add("Ежик");
        animalList.add("Тасманский зверь");
        animalList.add("Крот");
        animalList.add("Лошадь");
        animalList.add("Мишка");
        animalList.add("Леопард");
        animalList.add("Анаконда");
        animalList.add("Зайчик");
        animalList.add("Бык");

    }
}