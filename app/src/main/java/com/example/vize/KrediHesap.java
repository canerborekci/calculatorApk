package com.example.vize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class KrediHesap extends AppCompatActivity {
    Button btnh, btng;
    EditText kredi,taksit;
    RadioGroup rg;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    TextView sonuc;
    Float faizs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kredi_hesap);

        btnh = findViewById(R.id.btnhesap);
        btng = findViewById(R.id.btngeri);
        kredi = findViewById(R.id.kredi);
        taksit = findViewById(R.id.taksit);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rg = findViewById(R.id.rg);
        sonuc = findViewById(R.id.sonuc);

        btnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int secilen = rg.getCheckedRadioButtonId();
            switch (secilen){
                case(R.id.rb1):
                    faizs=0.01f;
                    break;
                case(R.id.rb2):
                    faizs=0.02f;
                    break;
                case(R.id.rb3):
                    faizs=0.05f;
                    break;
                default:
                    Toast.makeText(KrediHesap.this, "Lütfen Seçim Yapın", Toast.LENGTH_SHORT).show();
            }
                float kreditutar = Float.parseFloat(kredi.getText().toString());
                float taksitsayisi = Float.parseFloat(taksit.getText().toString());
                float faizartibir=faizs+1;
                float us = (float) Math.pow(faizartibir,taksitsayisi);
                sonuc.setText(String.valueOf(kreditutar*((faizs*us)/(us-1))));
       }
        });
        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KrediHesap.this,SecondPage.class);
                startActivity(i);
            }
        });

    }
}
