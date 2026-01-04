package com.example.puzzels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.annotation.SuppressLint

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.settings.javaScriptEnabled = true

        // Optional: for debugging and proper page loading
        myWebView.webChromeClient = WebChromeClient()
        myWebView.webViewClient = WebViewClient()

        myWebView.loadUrl("file:///android_asset/brain_game.html")
    }
}
