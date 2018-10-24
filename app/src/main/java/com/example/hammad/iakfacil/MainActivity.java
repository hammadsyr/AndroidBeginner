package com.example.hammad.iakfacil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView nilaiA, nilaiB;
    private int A=0,B=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //onCreate adalah membuka baru
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tambahA =  findViewById(R.id.btn_plus_a);
        Button kurangA =  findViewById(R.id.btn_minus_a);
        Button resetA =  findViewById(R.id.btn_reset_a);
        Button tambahB =  findViewById(R.id.btn_plus_b);
        Button kurangB =  findViewById(R.id.btn_minus_b);
        Button resetB =  findViewById(R.id.btn_reset_b);

        nilaiA =  findViewById(R.id.tv_nilai_a);
        nilaiB = findViewById(R.id.tv_nilai_b);

        tambahA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A = A + 1;
                nilaiA.setText("" + A);
            }
        });
        kurangA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(A<=0){
                    Toast.makeText(getApplicationContext(),"The Score is 0", Toast.LENGTH_SHORT).show();
                }else {
                    A = A - 1;
                    nilaiA.setText("" + A);
                }
            }
        });
        resetA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A = 0;
                nilaiA.setText("" + A);
            }
        });

        tambahB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B = B + 1;
                nilaiB.setText("" + B);
            }
        });
        kurangB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(B<=0){
                    Toast.makeText(getApplicationContext(),"The Score is 0", Toast.LENGTH_SHORT).show();
                }else {
                    B = B - 1;
                    nilaiB.setText("" + B);
                }
            }
        });
        resetB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B = 0;
                nilaiB.setText("" + B);
            }
        });
    }
}
