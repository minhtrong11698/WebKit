package com.example.webkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView=findViewById(R.id.webview1);
        webView.loadUrl("https://www.google.com/maps");
        webView.getSettings().setJavaScriptEnabled(true);
    }
}
