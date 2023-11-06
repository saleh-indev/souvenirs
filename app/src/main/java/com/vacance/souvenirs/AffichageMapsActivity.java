package com.vacance.souvenirs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AffichageMapsActivity extends AppCompatActivity {
    ImageView ajout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage_maps);

        ajout = (ImageView) findViewById(R.id.ajout1);
        ajout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                 Intent intent = new Intent(AffichageMapsActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

                 */

            }
        });
    }


}