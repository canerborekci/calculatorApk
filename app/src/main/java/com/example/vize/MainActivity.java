package com.example.vize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText isim, parola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn1);
        isim = findViewById(R.id.edt1);
        parola = findViewById(R.id.edt2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( isim.getText().toString().equals("Caner") && parola.getText().toString().equals("12345")) {
                    Intent i = new Intent(MainActivity.this, SecondPage.class);
                    startActivity(i);
                }
                else if( isim.getText().toString().equals("Mehmet") && parola.getText().toString().equals("123456")){
                    Intent i = new Intent(MainActivity.this, SecondPage.class);
                    startActivity(i);
                }
                else if( isim.getText().toString().equals("Asli") && parola.getText().toString().equals("1234")){
                    Intent i = new Intent(MainActivity.this, SecondPage.class);
                    startActivity(i);
                }
                else if( isim.getText().toString().equals("Cem") && parola.getText().toString().equals("123")){
                    Intent i = new Intent(MainActivity.this, SecondPage.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this, "Kullanıcı Adı veya Parola Yanlış", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}