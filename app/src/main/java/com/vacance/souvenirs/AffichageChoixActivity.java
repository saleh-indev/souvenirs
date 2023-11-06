package com.vacance.souvenirs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;

public class AffichageChoixActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage_choix);
    }

    public void lister(View v){
        Intent intent = new Intent(AffichageChoixActivity.this, AffichageListeActivity.class);
        startActivity(intent);
        finish();
    }
    public void maps(View v){
        Intent intent = new Intent(AffichageChoixActivity.this, AffichageMapsActivity.class);
        startActivity(intent);
        finish();
    }
}