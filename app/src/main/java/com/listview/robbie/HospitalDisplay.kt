package com.listview.robbie

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class HospitalDisplay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospital_display)
        val call = findViewById(R.id.call) as Button
        call.setOnClickListener {
            val dial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:0704563123"))
            startActivity(dial)
            //val web= Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"))
           // startActivity(web)
            //val map = Intent(Intent.ACTION_VIEW, Uri.parse("geo: -1.2613088,36.796112"))
            //startActivity(map)
        }
        val geo = findViewById(R.id.geo) as Button
        geo.setOnClickListener {
            val map = Intent(Intent.ACTION_VIEW, Uri.parse("geo: -1.2613088,36.796112"))
            startActivity(map)
        }
        val browse = findViewById(R.id.browse) as Button
        browse.setOnClickListener {
            val web= Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"))
            startActivity(web)
        }


        //===================
        val webview = findViewById(R.id.webview) as WebView
        val position = intent.getIntExtra("position",99)
        if (position == 0){
            webview.loadUrl("file:///android_asset/apples.html")
        }
        else if (position == 1){
            webview.loadUrl("file:///android_asset/apricots.html")
        }
        else if(position == 2){
            webview.loadUrl("file:///android_asset/bananas.html")
        }
        else if(position == 3){
            webview.loadUrl("file:///android_asset/oranges.html")
        }
        else if (position == 4){
            webview.loadUrl("file:///android_asset/mangoes.html")
        }
        else if (position == 5){
            webview.loadUrl("file:///android_asset/watermelons.html")
        }
        else if (position == 6){
            webview.loadUrl("file:///android_asset/kiwis.html")
        }
        else if (position == 8){
            webview.loadUrl("file:///android_asset/pawpaws.html")
        }
    }
}