package com.example.android_num_14_advancedintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        open_web();
    }
    public void open_web(){
        Uri Web = Uri.parse("https://www.google.com/?hl=zh_tw");
        Intent intent = new Intent(Intent.ACTION_VIEW, Web);
        startActivity(intent);
    }
}