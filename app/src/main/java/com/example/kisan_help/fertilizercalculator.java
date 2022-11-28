package com.example.kisan_help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class fertilizercalculator extends AppCompatActivity {
ImageButton click1,click2,click3,click4,click5,click6,click7,click8,click9,click10,click11,click12,click13,click14,click15,click16,click17,click18,click19,click20,click21,click22,click23,click24,click26,click27,click28,click29,click30,click31,click32;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fertilizercalculator);

        click1 = (ImageButton) findViewById(R.id.image1);
        click2 = (ImageButton) findViewById(R.id.image2);
        click3 = (ImageButton) findViewById(R.id.image3);
        click4 = (ImageButton) findViewById(R.id.image4);
        click5 = (ImageButton) findViewById(R.id.image5);
        click6 = (ImageButton) findViewById(R.id.image6);
        click7 = (ImageButton) findViewById(R.id.image7);
        click8 = (ImageButton) findViewById(R.id.image8);
        click9 = (ImageButton) findViewById(R.id.image9);
        click10 = (ImageButton) findViewById(R.id.image10);
        click11 = (ImageButton) findViewById(R.id.image11);
        click12 = (ImageButton) findViewById(R.id.image12);
        click13 = (ImageButton) findViewById(R.id.image13);
        click14 = (ImageButton) findViewById(R.id.image14);
        click15 = (ImageButton) findViewById(R.id.image15);
        click16 = (ImageButton) findViewById(R.id.image16);
        click17 = (ImageButton) findViewById(R.id.image17);
        click18 = (ImageButton) findViewById(R.id.image18);
        click19 = (ImageButton) findViewById(R.id.image19);
        click20 = (ImageButton) findViewById(R.id.image20);
        click21 = (ImageButton) findViewById(R.id.image21);
        click22 = (ImageButton) findViewById(R.id.image22);
        click23 = (ImageButton) findViewById(R.id.image23);
        click24 = (ImageButton) findViewById(R.id.image24);
        click26 = (ImageButton) findViewById(R.id.image26);
        click27 = (ImageButton) findViewById(R.id.image27);
        click28 = (ImageButton) findViewById(R.id.image28);
        click29 = (ImageButton) findViewById(R.id.image29);
        click30 = (ImageButton) findViewById(R.id.image30);
        click31 = (ImageButton) findViewById(R.id.image31);
        click32 = (ImageButton) findViewById(R.id.image32);

        click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",1);
                startActivity(intent);
            }
        });
        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",2);
                startActivity(intent);
            }
        });
        click3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",3);
                startActivity(intent);

            }
        });

        click4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",4);
                startActivity(intent);

            }
        });

        click5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",5);
                startActivity(intent);

            }
        });

        click6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",6);
                startActivity(intent);

            }
        });

        click7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",7);
                startActivity(intent);

            }
        });

        click8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",8);
                startActivity(intent);

            }
        });

        click9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",9);
                startActivity(intent);

            }
        });

        click10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",10);
                startActivity(intent);

            }
        });

        click11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",11);
                startActivity(intent);

            }
        });

        click12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",12);
                startActivity(intent);

            }
        });

        click13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",13);
                startActivity(intent);

            }
        });

        click14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",14);
                startActivity(intent);

            }
        });

        click15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",15);
                startActivity(intent);

            }
        });

        click16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",16);
                startActivity(intent);

            }
        });

        click17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",17);
                startActivity(intent);

            }
        });

        click18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",18);
                startActivity(intent);

            }
        });

        click19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",19);
                startActivity(intent);

            }
        });

        click20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",20);
                startActivity(intent);

            }
        });

        click21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",21);
                startActivity(intent);

            }
        });

        click22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",22);
                startActivity(intent);

            }
        });

        click23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",23);
                startActivity(intent);

            }
        });

        click24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",24);
                startActivity(intent);

            }
        });

        click26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",26);
                startActivity(intent);

            }
        });

        click27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",27);
                startActivity(intent);

            }
        });

        click28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",28);
                startActivity(intent);

            }
        });

        click29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",29);
                startActivity(intent);

            }
        });

        click30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",30);
                startActivity(intent);

            }
        });

        click31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",31);
                startActivity(intent);

            }
        });

        click32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Measurefertilizer.class);
                intent.putExtra("index",32);
                startActivity(intent);

            }
        });


    }

}