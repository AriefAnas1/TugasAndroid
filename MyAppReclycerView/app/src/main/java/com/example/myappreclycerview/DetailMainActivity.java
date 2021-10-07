package com.example.myappreclycerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailMainActivity extends AppCompatActivity {

    TextView textViewTittle, textViewRating, textViewGenre, textViewReleaseDate, textViewDirector, textViewDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_main);

        textViewTittle = findViewById(R.id.tvTittle);
        textViewRating = findViewById(R.id.tvRating);
        textViewGenre = findViewById(R.id.tvGenre);
        textViewReleaseDate = findViewById(R.id.tvReleaseDate);
        textViewDirector = findViewById(R.id.tvDirector);
        textViewDescription = findViewById(R.id.tvDescription);

        Data data = getIntent().getParcelableExtra("Data");
        textViewTittle.setText(data.getTittle());
        textViewRating.setText(String.valueOf(data.getRating()));
        textViewGenre.setText(data.getGenre());
        textViewReleaseDate.setText(data.getReleasedate());
        textViewDirector.setText(data.getDirector());
        textViewDescription.setText(data.getDescrption());
    }
}