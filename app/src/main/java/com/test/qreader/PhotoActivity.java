package com.test.qreader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Komputer on 2018-01-31.
 */

public class PhotoActivity extends AppCompatActivity {

    TextView QResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        Intent intent = getIntent();
        String plantName = intent.getStringExtra("plantName");
        QResult = findViewById(R.id.QRtextView);
        QResult.setText(plantName);
    }

}
