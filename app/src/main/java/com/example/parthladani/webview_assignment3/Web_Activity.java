package com.example.parthladani.webview_assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Web_Activity extends AppCompatActivity {

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        wv = (WebView) findViewById(R.id.wv);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        String data = b.getString("a");
        wv.loadUrl("https://www.wikipedia.org/wiki/"+data);

    }
}
