package com.example.parthladani.webview_assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mainList = (ListView) findViewById(R.id.mainList);

        final List<String> l = new ArrayList<String>();
        l.add("Animals");
        l.add("Planets");
        l.add("Countries");
        l.add("Wonders of the World");
        l.add("Languages");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,l);

        mainList.setAdapter(adapter);

        mainList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Intent myIntent = new Intent(view.getContext(), AnimalsActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 1) {
                    Intent myIntent = new Intent(view.getContext(), PlanetsActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 2) {
                    Intent myIntent = new Intent(view.getContext(), CountriesActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 3) {
                    Intent myIntent = new Intent(view.getContext(), WondersActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 4) {
                    Intent myIntent = new Intent(view.getContext(), LanguagesActivity.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });
    }
}
