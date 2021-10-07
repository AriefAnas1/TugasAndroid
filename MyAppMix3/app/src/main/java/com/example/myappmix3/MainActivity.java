package com.example.myappmix3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity {

    //isi data Year
    private static final String[] Kota = new String[] {
            "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000",
            "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010"
    };

    //Data
    AutoCompleteTextView auto;
    ListView ListViewMonth;
    String[] months;
    Spinner spinners;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Akses pada autoComplete tahun
        AutoCompleteTextView editText = findViewById(R.id.autoComplete);
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Kota);
        editText.setAdapter(Adapter);

        //Akses pada list view bulan
        ListViewMonth = findViewById(R.id.lvMonth);
        months = new DateFormatSymbols().getMonths();
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, months);
        ListViewMonth.setAdapter(monthAdapter);
        ListViewMonth.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String month = AdapterView.getItemAtPosition(i).toString();
//                String month = months[i];
                String month = ((TextView) view).getText().toString();
                Toast.makeText(getApplicationContext(),"Cliked" + month,Toast.LENGTH_SHORT).show();
            }
        });

        //Akses pada spinner tanggal
        spinners = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.date, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinners.setAdapter(adapter);


    }
}