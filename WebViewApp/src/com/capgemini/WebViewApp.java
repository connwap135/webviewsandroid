package com.capgemini;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class WebViewApp extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        WebView webView = (WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        //webView.loadUrl("file:///android_asset/www/sencha-touch-1.1.1/examples/carousel/index.html");
        //webView.loadUrl("file:///android_asset/www/carousel.html");
        webView.loadUrl("file:///android_asset/www/Turntable/Carousel.html");
        //webView.loadUrl("file:///android_asset/www/x.html");
    }
}