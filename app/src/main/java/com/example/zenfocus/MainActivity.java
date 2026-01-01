package com.example.zenfocus;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        // 初始化 WebView
        mWebView = new WebView(this);
        setContentView(mWebView);

        setupWebView();

        // 加载本地 Assets 目录下的 React 应用
        mWebView.loadUrl("file:///android_asset/index.html");
    }

    private void setupWebView() {
        WebSettings settings = mWebView.getSettings();

        // 1. 启用 JavaScript (React 运行必须)
        settings.setJavaScriptEnabled(true);

        // 2. 启用 DOM Storage (用于 LocalStorage 数据持久化)
        settings.setDomStorageEnabled(true);

        // 3. 允许从文件系统访问 (加载 assets 资源)
        settings.setAllowFileAccess(true);

        // 4. 优化：缓存设置，提升加载速度
        settings.setCacheMode(WebSettings.LOAD_DEFAULT);

        // 防止跳转到系统浏览器
        mWebView.setWebViewClient(new WebViewClient());
    }

}