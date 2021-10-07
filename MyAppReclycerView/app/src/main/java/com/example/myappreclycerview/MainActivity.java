package com.example.myappreclycerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DataRecyclerViewAdapter adapter;
    ArrayList<Data> objData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        objData.add(new Data("Comic 8", "Comedy", "Anggy Umbara", 7.0, "Delapan anak muda dari latar belakang yang berbeda secara tidak sengaja merampok bank pada waktu yang bersamaan. Masing-masing memiliki alasan dan motif yang berbeda: kebingungan, hobi, kesenangan, olahraga adrenalin, bahkan untuk mendukung panti asuhan dan orang miskin. Kedelapan perampok dibagi menjadi tiga tim dengan keterampilan dan pengalaman berbeda. Perampokan yang awalnya dimulai sebagai suatu kebetulan, dikepung oleh wanita polisi super cantik. Akhirnya mereka harus bekerja sama dan menemukan jawaban atas teka-teki dan mencari solusi terbaik.", "29 January 2014"));
        objData.add(new Data("Comic 8 part 2", "Comedy, Action", "Anggy Umbara",6.3 , "Delapan agen rahasia yang bertindak sebagai 8 komik, kembali beraksi, untuk mengalahkan Raja Kasino, sekali dan untuk selamanya.", "3 maret 2016"));

        adapter = new DataRecyclerViewAdapter(objData);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}