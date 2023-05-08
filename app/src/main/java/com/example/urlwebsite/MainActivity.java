package com.example.urlwebsite;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @SuppressLint({"WrongViewCast", "MissingInflatedId", "SetJavaScriptEnabled"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        webView= (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://responsive-protifle-mosaad.web.app/?fbclid=IwAR3v0tcHcYAtAYhMka-QAN0nIzBJ8ts_LpZSLhswGFxlPwYiM07q4cEUGSI");

        WebSettings webSettings= webView.getSettings();
        webSettings.setJavaScriptEnabled(true);



    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()) {
            webView.goBack();
        }else {
            super.onBackPressed();

        }

    }
}