package com.example.vize;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HesapMakinasi extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button bbol;
    Button bcik;
    Button bcarp;
    Button btop;
    Button besit;
    Button bc;
    TextView tgirdi,tsonuc;
    Float ilkdeger;
    Float ikincideger;
    boolean toplama, cikartma, carpma, bolme;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hesap_makinasi);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bc = findViewById(R.id.bc);
        bbol = findViewById(R.id.bbol);
        bcik = findViewById(R.id.bcik);
        bcarp = findViewById(R.id.bcarp);
        btop = findViewById(R.id.btop);
        besit = findViewById(R.id.besit);
        tgirdi = findViewById(R.id.tgirdi);
        tsonuc = findViewById(R.id.tsonuc);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tgirdi.setText(tgirdi.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tgirdi.setText(tgirdi.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tgirdi.setText(tgirdi.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tgirdi.setText(tgirdi.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tgirdi.setText(tgirdi.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tgirdi.setText(tgirdi.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tgirdi.setText(tgirdi.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tgirdi.setText(tgirdi.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tgirdi.setText(tgirdi.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tgirdi.setText(tgirdi.getText() + "0");
            }
        });
        btop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkdeger = Float.parseFloat(tgirdi.getText() + "");
                toplama=true;
                tgirdi.setText(null);
            }
        });
        bcik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkdeger = Float.parseFloat(tgirdi.getText() + "");
                cikartma=true;
                tgirdi.setText(null);
            }
        });

        bbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkdeger = Float.parseFloat(tgirdi.getText() + "");
                bolme=true;
                tgirdi.setText(null);
            }
        });

        bcarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkdeger = Float.parseFloat(tgirdi.getText() + "");
                carpma=true;
                tgirdi.setText(null);
            }
        });

        besit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ikincideger = Float.parseFloat(tgirdi.getText() + "");

                if (ilkdeger.equals(null) && ikincideger.equals(null)){
                    Toast.makeText(HesapMakinasi.this, "Lütfen değer girin", Toast.LENGTH_SHORT).show();

                }

                if (toplama == true) {
                    tsonuc.setText(ilkdeger + ikincideger + "");
                    toplama = false;
                }

                if (cikartma == true) {
                    tsonuc.setText(ilkdeger - ikincideger + "");
                    cikartma = false;
                }

                if (carpma == true) {
                    tsonuc.setText(ilkdeger * ikincideger + "");
                    carpma = false;
                }

                if (bolme == true) {
                    tsonuc.setText(ilkdeger / ikincideger + "");
                    bolme = false;
                }


            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tgirdi.setText("");
                tsonuc.setText("");
            }
        });



    }
}