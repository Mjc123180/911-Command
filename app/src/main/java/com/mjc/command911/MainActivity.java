package com.mjc.command911;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.view.View;
public class MainActivity extends Activity {
 private WebView web;
 @Override public void onCreate(Bundle state){super.onCreate(state);getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN|View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);web=new WebView(this);web.setWebViewClient(new WebViewClient());WebSettings settings=web.getSettings();settings.setJavaScriptEnabled(true);settings.setDomStorageEnabled(true);settings.setAllowFileAccess(true);setContentView(web);web.loadUrl("file:///android_asset/index.html");}
 @Override public void onBackPressed(){web.evaluateJavascript("document.getElementById('mainMenu').classList.remove('hidden')",null);}
 @Override protected void onDestroy(){web.destroy();super.onDestroy();}
}
