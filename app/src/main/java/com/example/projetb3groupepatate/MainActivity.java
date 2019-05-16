package com.example.projetb3groupepatate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changePhotoButton = findViewById(R.id.changePhotoButton);
        ImageView img1 = findViewById(R.id.imageView4);


    }

    public void onChangePhotoButton(View changePhotoButton){

    }
}
