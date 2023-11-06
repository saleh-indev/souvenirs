package com.vacance.souvenirs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class AffichageListeActivity extends AppCompatActivity {
    ImageView ajout;
    ArrayList<VacanceModel> vacanceList;
    RecyclerView rvEvent;
    VacanceAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage_liste);

        ajout = (ImageView) findViewById(R.id.ajout);
        vacanceList = new ArrayList<>();
        rvEvent = findViewById(R.id.rv_liste);
        adapter = new VacanceAdapter(vacanceList);


        ajout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });

        afficherListe();
    }

    private void afficherListe() {
        vacanceList.add(new VacanceModel("Eté 2010 Istanbul"));
        adapter.notifyDataSetChanged();
        vacanceList.add(new VacanceModel("Printemps 2013 Venise"));
        adapter.notifyDataSetChanged();
        vacanceList.add(new VacanceModel("Été 2015 Barcelone"));
        adapter.notifyDataSetChanged();
        vacanceList.add(new VacanceModel("Hiver 2017 Prague"));
        adapter.notifyDataSetChanged();

        vacanceList.add(new VacanceModel("Automne 2018 Kyoto"));
        adapter.notifyDataSetChanged();
        vacanceList.add(new VacanceModel(" Été 2019 Santorin"));
        adapter.notifyDataSetChanged();

        vacanceList.add(new VacanceModel(" Septembre 2020 Zagreb"));
        adapter.notifyDataSetChanged();

        vacanceList.add(new VacanceModel(" Octobre 2021 Marseille"));
        adapter.notifyDataSetChanged();

        vacanceList.add(new VacanceModel(" Été 2022 à Paris"));
        adapter.notifyDataSetChanged();
        vacanceList.add(new VacanceModel(" Hiver 2022 à Tokyo"));
        adapter.notifyDataSetChanged();

        vacanceList.add(new VacanceModel(" Printemps 2023 à Rome"));
        adapter.notifyDataSetChanged();
        vacanceList.add(new VacanceModel("Automne 2023 à Marrakech"));
        adapter.notifyDataSetChanged();

        rvEvent.setAdapter(adapter);
        rvEvent.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvEvent.addItemDecoration(new DividerItemDecoration(rvEvent.getContext(), DividerItemDecoration.VERTICAL));

    }
}