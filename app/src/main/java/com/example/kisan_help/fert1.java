package com.example.kisan_help;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class fert1 extends AppCompatActivity {
    float dap,mop,urea,dap2,mop2,urea2;
    int dap1,mop1,urea1;
    TextView A,B,C,D,E,F;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fert1);

        A = (TextView)findViewById(R.id.dap1);
        B = (TextView)findViewById(R.id.mop1);
        C = (TextView)findViewById(R.id.urea1);
        D = (TextView)findViewById(R.id.dap2);
        E = (TextView)findViewById(R.id.mop2);
        F = (TextView)findViewById(R.id.urea2);

        Intent m1intent = getIntent();
        int choice = m1intent.getIntExtra("index", 0);
        Intent m2intent = getIntent();
        float size = m2intent.getIntExtra("size", 0);
        if(choice == 1){
            dap = size*100;
            mop = size*50;
            urea = size*25;
            dap1 = (int)(dap/50);
            if(dap%50 !=0)
                dap1++;
            mop1 = (int)(mop/20);
            if(mop%20 !=0)
                mop++;
            urea1 = (int)(urea/10);
            if(urea%10!=0)
                urea1++;
            dap2= size*70;
            A.setText("DAP = "+dap+"kg,"+dap1+"bag");
            B.setText("MOP = "+mop+"kg,"+mop1+"bag");
            C.setText("Urea = "+urea+"kg,"+urea1+"bag");
            D.setText("NPK = "+dap2+"kg,"+dap1+"bag");
            E.setText("MOP = "+mop+"kg,"+mop1+"bag");
            F.setText("Urea = "+urea+"kg,"+urea1+"bag");


        }
        else if(choice == 3){
            dap = size*100;
            mop = size*50;
            urea = size*25;
            dap1 = (int)(dap/50);
            if(dap%50 !=0)
                dap1++;
            mop1 = (int)(mop/20);
            if(mop%20 !=0)
                mop++;
            urea1 = (int)(urea/10);
            if(urea%10!=0)
                urea1++;
            dap2= size*70;
            A.setText("DAP = "+dap+"kg,"+dap1+"bag");
            B.setText("MOP = "+mop+"kg,"+mop1+"bag");
            C.setText("Urea = "+urea+"kg,"+urea1+"bag");
            D.setText("NPK = "+dap2+"kg,"+dap1+"bag");
            E.setText("MOP = "+mop+"kg,"+mop1+"bag");
            F.setText("Urea = "+urea+"kg,"+urea1+"bag");


        }
        else if(choice == 2){
            dap = size*100;
            mop = size*50;
            urea = size*25;
            dap1 = (int)(dap/50);
            if(dap%50 !=0)
                dap1++;
            mop1 = (int)(mop/20);
            if(mop%20 !=0)
                mop++;
            urea1 = (int)(urea/10);
            if(urea%10!=0)
                urea1++;
            dap2= size*70;
            A.setText("DAP = "+dap+"kg,"+dap1+"bag");
            B.setText("MOP = "+mop+"kg,"+mop1+"bag");
            C.setText("Urea = "+urea+"kg,"+urea1+"bag");
            D.setText("NPK = "+dap2+"kg,"+dap1+"bag");
            E.setText("MOP = "+mop+"kg,"+mop1+"bag");
            F.setText("Urea = "+urea+"kg,"+urea1+"bag");
        }

        else if(choice == 13){
            dap = size*80;
            mop = size*30;
            urea = size*20;
            dap1 = (int)(dap/50);
            if(dap%50 !=0)
                dap++;
            mop1 = (int)(mop/20);
            if(mop%20 !=0)
                mop++;
            urea1 = (int)(urea/10);
            if(urea%10!=0)
                urea1++;
            dap2= size*60;
            A.setText("DAP = "+dap+"kg,"+dap1+"bag");
            B.setText("MOP = "+mop+"kg,"+mop1+"bag");
            C.setText("Urea = "+urea+"kg,"+urea1+"bag");
            D.setText("NPK = "+dap2+"kg,"+dap1+"bag");
            E.setText("MOP = "+mop+"kg,"+mop1+"bag");
            F.setText("Urea = "+urea+"kg,"+urea1+"bag");
        }

        else {
            dap=10;
        }





    }
}