package com.example.vize;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Listview1 extends AppCompatActivity {
    ListView listView;
    String kullaniciad[] = {"Caner", "Asli", "Mehmet", "Cem"};
    String sifre[] = {"12345", "1234", "123456", "1234"};
    String home[] = {"/home/caner", "/home/asli", "/home/mehmet", "/home/cem"};
    String tarih[] = {"23.12.1997", "05.05.1970", "25.05.1967", "08.04.1968"};
    String kalan[] = {"2 hours", "56 minutes", "42 seconds", "1 hour"};
    int images[] = {R.drawable.cbaba, R.drawable.c3, R.drawable.c2, R.drawable.c1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview1);
        listView = findViewById(R.id.listView);

        kullaniciadaptor adapter = new kullaniciadaptor(this,kullaniciad,sifre,home,tarih,kalan,images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    Toast.makeText(Listview1.this, "Caner", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(Listview1.this, "Asli", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(Listview1.this, "Mehmet", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(Listview1.this, "Cem", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
    class kullaniciadaptor extends ArrayAdapter<String>{
        Context context;
        String rkullaniciad[];
        String rsifre[];
        String rhome[];
        String rtarih[];
        String rkalan[];
        int rimages[];

        kullaniciadaptor(Context c, String kullaniciad[], String sifre[],String home[],String tarih[],String kalan[], int images[]){
        super(c, R.layout.row, R.id.textView1, kullaniciad);
        this.context = c;
        this.rkullaniciad = kullaniciad;
        this.rsifre = sifre;
        this.rhome = home;
        this.rtarih = tarih;
        this.rkalan = kalan;
        this.rimages = images;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = (ImageView) row.findViewById(R.id.image);
            TextView kullaniciad = row.findViewById(R.id.textView1);
            TextView sifre = row.findViewById(R.id.textView2);
            TextView home = row.findViewById(R.id.textView3);
            TextView tarih = row.findViewById(R.id.textView4);
            TextView kalan = row.findViewById(R.id.textView5);

            images.setImageResource(rimages[position]);
            kullaniciad.setText(rkullaniciad[position]);
            sifre.setText(rsifre[position]);
            home.setText(rhome[position]);
            tarih.setText(rtarih[position]);
            kalan.setText(rkalan[position]);


            return row;

        }
    }
}