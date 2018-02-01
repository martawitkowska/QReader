package com.test.qreader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Komputer on 2018-01-31.
 */

public class PhotoActivity extends AppCompatActivity {

    ImageView photo;
    TextView englishName;
    TextView latinName;
    Plant plant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        Intent intent = getIntent();
        String QRplantName = intent.getStringExtra("plantName");

        if (Repository.getPlants().containsKey(QRplantName))
            plant = Repository.getPlants().get(QRplantName);
        else
            plant = Repository.getDefaultPlant();

        photo = findViewById(R.id.photoImageView);
        englishName = findViewById(R.id.englishTextView);
        latinName = findViewById(R.id.latinTextView);

        photo.setImageResource(plant.photoResource);
        englishName.setText(plant.englishName);
        latinName.setText(plant.latinName);
    }

}
