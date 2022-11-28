package com.example.kisan_help;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
public class mainpage1 extends AppCompatActivity {
    ImageButton fertilizer,pest,identifydisease;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage1);

        fertilizer = (ImageButton) findViewById(R.id.imageButton5);
        pest = (ImageButton) findViewById(R.id.imageButton3);
        identifydisease = (ImageButton) findViewById(R.id.imageButton2);

        fertilizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //complete code//
                Intent intent = new Intent(getApplicationContext(),fertilizercalculator.class);
                startActivity(intent);

            }
        });
        pest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //complete code//
                Intent intent = new Intent(getApplicationContext(),pestidentify.class);
                startActivity(intent);
            }
        });

        identifydisease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // complete code//
                Intent intent = new Intent(getApplicationContext(),deseaseidentify.class);
                startActivity(intent);
            }
        });

    }
}