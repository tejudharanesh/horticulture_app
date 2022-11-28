package com.example.kisan_help;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class fert2 extends AppCompatActivity {
    float dap,mop,urea,dap2,mop2,urea2;
    int dap1,mop1,urea1,npk1,npk2,npk3;
    TextView A,B,C,D,E,F;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fert2);

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
            dap = (float) (size*0.5);
            mop = (float) (size*0.4);
            urea = (float) (size*0.3);
            dap1 = (int)(dap/50);
            if(dap%50 !=0)
                dap1++;
            mop1 = (int)(mop/20);
            if(mop%20 !=0)
                mop1++;
            urea1 = (int)(urea/10);
            if(urea%10!=0)
                urea1++;
            dap2 = (float) (size*0.6);
            mop2 = (float) (size*0.5);
            urea2 = (float)(size*0.54);
            npk1 = (int) (dap2 / 50);
            if(dap2%50 !=0)
                npk1++;
            npk2 = (int)(mop2/20);
            if(mop2%20 !=0)
                npk2++;
            npk3 = (int)(urea2/10);
            if(urea2%10!=0)
                npk3++;
            A.setText("DAP = "+dap+"kg,"+dap1+"bag");
            B.setText("MOP = "+mop+"kg,"+mop1+"bag");
            C.setText("Urea = "+urea+"kg,"+urea1+"bag");
            D.setText("NPK = "+dap2+"kg,"+npk1+"bag");
            E.setText("MOP = "+mop2+"kg,"+npk2+"bag");
            F.setText("Urea = "+urea2+"kg,"+npk3+"bag");


        }
        else if(choice == 3){
            dap = (float) (size*0.5);
            mop = (float) (size*0.4);
            urea = (float) (size*0.3);
            dap1 = (int)(dap/50);
            if(dap%50 !=0)
                dap1++;
            mop1 = (int)(mop/20);
            if(mop%20 !=0)
                mop1++;
            urea1 = (int)(urea/10);
            if(urea%10!=0)
                urea1++;


            dap2 = (float) (size*0.6);
            mop2 = (float) (size*0.5);
            urea2 = (float)(size*0.54);
            npk1 = (int) (dap2 / 50);
            if(dap2%50 !=0)
                npk1++;
            npk2 = (int)(mop2/20);
            if(mop2%20 !=0)
                npk2++;
            npk3 = (int)(urea2/10);
            if(urea2%10!=0)
                npk3++;


            A.setText("DAP = "+dap+"kg,"+dap1+"bag");
            B.setText("MOP = "+mop+"kg,"+mop1+"bag");
            C.setText("Urea = "+urea+"kg,"+urea1+"bag");
            D.setText("NPK = "+dap2+"kg,"+npk1+"bag");
            E.setText("MOP = "+mop2+"kg,"+npk2+"bag");
            F.setText("Urea = "+urea2+"kg,"+npk3+"bag");



        }
        else if(choice == 2){
            dap = (float) (size*0.5);
            mop = (float) (size*0.4);
            urea = (float) (size*0.3);
            dap1 = (int)(dap/50);
            if(dap%50 !=0)
                dap1++;
            mop1 = (int)(mop/20);
            if(mop%20 !=0)
                mop1++;
            urea1 = (int)(urea/10);
            if(urea%10!=0)
                urea1++;


            dap2 = (float) (size*0.6);
            mop2 = (float) (size*0.5);
            urea2 = (float)(size*0.54);
            npk1 = (int) (dap2 / 50);
            if(dap2%50 !=0)
                npk1++;
            npk2 = (int)(mop2/20);
            if(mop2%20 !=0)
                npk2++;
            npk3 = (int)(urea2/10);
            if(urea2%10!=0)
                npk3++;


            A.setText("DAP = "+dap+"kg,"+dap1+"bag");
            B.setText("MOP = "+mop+"kg,"+mop1+"bag");
            C.setText("Urea = "+urea+"kg,"+urea1+"bag");
            D.setText("NPK = "+dap2+"kg,"+npk1+"bag");
            E.setText("MOP = "+mop2+"kg,"+npk2+"bag");
            F.setText("Urea = "+urea2+"kg,"+npk3+"bag");


        }
        else {
            dap=10;
        }
    }
}