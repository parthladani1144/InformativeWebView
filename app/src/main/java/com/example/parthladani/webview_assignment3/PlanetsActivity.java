package com.example.parthladani.webview_assignment3;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class PlanetsActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        final ListView list = (ListView) findViewById(R.id.list);

        final List<String> l = new ArrayList<String>();
        l.add("Mars");
        l.add("Earth");
        l.add("Jupiter");
        l.add("Uranus");
        l.add("Venus");

        ArrayAdapter<String> animalsAdapter = new ArrayAdapter<String>(PlanetsActivity.this,android.R.layout.simple_list_item_1,l);

        list.setAdapter(animalsAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent myIntent = new Intent(view.getContext(), Web_Activity.class);
                String s = l.get(position);
                myIntent.putExtra("a",s);
                startActivity(myIntent);

            }
        });
    }
}
