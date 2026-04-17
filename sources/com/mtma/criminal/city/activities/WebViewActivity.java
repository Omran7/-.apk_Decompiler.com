package com.mtma.criminal.city.activities;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mtma.criminal.city.R;
import f.C0518i;

public class WebViewActivity extends C0518i {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_webview);
        String stringExtra = getIntent().getStringExtra("url");
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        if (stringExtra != null) {
            webView.loadUrl(stringExtra);
        }
    }
}
