package com.vacance.souvenirs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class AffichageVacance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage_vacance);
        int position = getIntent().getExtras().getInt("position");
        ArrayList <Lieu> lieux = (ArrayList<Lieu>) getIntent().getSerializableExtra("lieu");
        Toast.makeText(getApplicationContext(), "ok !"+position + lieux.toString(), Toast.LENGTH_LONG).show();
    }
}