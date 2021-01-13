package com.example.vize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SecondPage extends AppCompatActivity {

    Switch sw;
    View v1,v2;
    Button kredi,hesap,kullanici,ekle,cikis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        sw = findViewById(R.id.switch1);
        v1 = findViewById((R.id.view));
        v2 = findViewById(R.id.view2);
        kredi = findViewById(R.id.button2);
        hesap = findViewById(R.id.button3);
        kullanici = findViewById(R.id.button4);
        ekle = findViewById(R.id.button5);
        cikis = findViewById(R.id.button6);

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(sw.isChecked()){
                v1.setBackgroundResource(R.color.notdark);
                kredi.setTextColor(getResources().getColor(R.color.notdark));
                hesap.setTextColor(getResources().getColor(R.color.notdark));
                kullanici.setTextColor(getResources().getColor(R.color.notdark));
                ekle.setTextColor(getResources().getColor(R.color.notdark));
                cikis.setTextColor(getResources().getColor(R.color.notdark));

                }

                else{
                    v1.setBackgroundResource(R.color.dark);
                    kredi.setTextColor(getResources().getColor(R.color.white));
                    hesap.setTextColor(getResources().getColor(R.color.white));
                    kullanici.setTextColor(getResources().getColor(R.color.white));
                    ekle.setTextColor(getResources().getColor(R.color.white));
                    cikis.setTextColor(getResources().getColor(R.color.white));
                }

            }

        });
        kredi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondPage.this,KrediHesap.class);
                startActivity(i);
            }
        });
        cikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondPage.this,MainActivity.class);
                startActivity(i);
            }
        });
        hesap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondPage.this,HesapMakinasi.class);
                startActivity(i);
            }
        });
        kullanici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondPage.this,Listview1.class);
                startActivity(i);
            }
        });
    }
}