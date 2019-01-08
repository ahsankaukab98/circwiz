package com.example.user1.circwiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String[] titles = new String[] { "Pakistan",
            "India", "Australia", "South Africa" };

    public static final Integer[] images = { R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};

    Spinner spinner;
    List<RowItems> rowItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rowItems = new ArrayList<RowItems>();
        for (int i = 0; i < titles.length; i++) {

            RowItems item = new RowItems(titles[i],images[i]);
            rowItems.add(item);
        }

        spinner = (Spinner)findViewById(R.id.spinner);
        CustomAdopter adapter = new CustomAdopter(MainActivity.this,
                R.layout.list_view_items, R.id.title, rowItems);
        spinner.setAdapter(adapter);
    }
}
