package com.example.embedvideoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class videoPlayer extends AppCompatActivity {

    WebView webView;
    public static String video_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_player);
        // id select
        webView = findViewById(R.id.webVideo);


        // web view show
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(video_url);
    }
}