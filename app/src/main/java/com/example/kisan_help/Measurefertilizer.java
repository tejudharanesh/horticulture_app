package com.example.kisan_help;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Measurefertilizer extends AppCompatActivity {
    String uri;
    TextView textview;
    String text;
    ImageView imageview;
    Button btn1,btn2;
    EditText size,trees;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measurefertilizer);
        btn1 = (Button) findViewById(R.id.calc1);
        btn2 = (Button) findViewById(R.id.cal2);
        size = (EditText) findViewById(R.id.landsize);
        trees = (EditText) findViewById(R.id.nooftrees);
        Intent mintent = getIntent();
        int choice = mintent.getIntExtra("index", 0);

        if (choice == 1) {
            uri = "@drawable/mango";
            text = "Mango";
        } else if (choice == 2) {
            uri = "@drawable/banana";
            text = "Banana";
        } else if (choice == 3) {
            uri = "@drawable/guava";
            text = "Guava";
        } else if (choice == 4) {
            uri = "@drawable/papaya";
            text = "Papaya";
        } else if (choice == 5) {
            uri = "@drawable/acid_lime";
            text = "Acid Lime";
        } else if (choice == 6) {
            uri = "@drawable/sapota";
            text = "Sapota";
        } else if (choice == 7) {
            uri = "@drawable/sweetorange";
            text = "Sweet Orange";
        } else if (choice == 8) {
            uri = "@drawable/grapes";
            text = "Grapes";
        } else if (choice == 9) {
            uri = "@drawable/pineapple";
            text = "Pineapple";
        } else if (choice == 10) {
            uri = "@drawable/pomegranate";
            text = "Pomegranate";
        } else if (choice == 11) {
            uri = "@drawable/jackfruit";
            text = "Jackfruit";
        } else if (choice == 12) {
            uri = "@drawable/pear";
            text = "Pear";
        } else if (choice == 13) {
            uri = "@drawable/tomato";
            text = "Tomato";
        } else if (choice == 14) {
            uri = "@drawable/bhendi";
            text = "Bhendi";
        } else if (choice == 15) {
            uri = "@drawable/brinjal";
            text = "Brinjal";
        } else if (choice == 16) {
            uri = "@drawable/chilli";
            text = "Chilli";
        } else if (choice == 17) {
            uri = "@drawable/bottleguard";
            text = "Bottleguard";
        } else if (choice == 18) {
            uri = "@drawable/bittergourd";
            text = "Bittergourd";
        } else if (choice == 19) {
            uri = "@drawable/cucumber";
            text = "Cucumber";
        } else if (choice == 20) {
            uri = "@drawable/watermelon";
            text = "Watermelon";
        } else if (choice == 21) {
            uri = "@drawable/clusterbean";
            text = "Clusterbean";
        } else if (choice == 22) {
            uri = "@drawable/carrot";
            text = "Carrot";
        } else if (choice == 23) {
            uri = "@drawable/beetroot";
            text = "Beetroot";
        } else if (choice == 24) {
            uri = "@drawable/radish";
            text = "Radish";
        } else if (choice == 26) {
            uri = "@drawable/cauliflower";
            text = "Cauliflower";
        } else if (choice == 27) {
            uri = "@drawable/curryleaf";
            text = "Curryleaf";
        } else if (choice == 28) {
            uri = "@drawable/sweetpotato";
            text = "Sweet Potato";
        } else if (choice == 29) {
            uri = "@drawable/potato";
            text = "Potato";
        } else if (choice == 30) {
            uri = "@drawable/onion";
            text = "Onion";
        } else if (choice == 31) {
            uri = "@drawable/arecanut";
            text = "Aracanut";
        } else if (choice == 32) {
            uri = "@drawable/coconut";
            text = "Coconut";
        } else
            uri ="hgch";


            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            imageview =(ImageView) findViewById(R.id.imageView);
            Drawable res = getResources().getDrawable(imageResource);
            imageview.setImageDrawable(res);
            textview =(TextView) findViewById(R.id.textView);
            textview.setText(text);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String size1 = size.getText().toString();
                    int si = Integer.parseInt(size1);
                    Bundle bundle = new Bundle();
                    bundle.putInt("index", choice);
                    bundle.putInt("size", si);
                    Intent intent1 = new Intent(getApplicationContext(),fert1.class);
                    intent1.putExtras(bundle);
                    startActivity(intent1);
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String trees1 = trees.getText().toString();
                    int tr = Integer.parseInt(trees1);
                    Bundle bundle1 = new Bundle();
                    bundle1.putInt("index", choice);
                    bundle1.putInt("size", tr);
                    Intent intent1 = new Intent(getApplicationContext(),fert2.class);
                    intent1.putExtras(bundle1);
                    startActivity(intent1);
                }
            });

}

    }
