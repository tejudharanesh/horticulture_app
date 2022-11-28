package com.example.kisan_help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class Pest extends AppCompatActivity {
    String uri;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pest);

        Intent mintent = getIntent();
        int choice = mintent.getIntExtra("index", 0);


        if (choice == 1) {

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



    }
}