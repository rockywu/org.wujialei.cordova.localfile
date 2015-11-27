package org.wujialei.cordova.localfile;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.Log;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

import org.apache.cordova.engine.SystemWebViewClient;
import org.apache.cordova.engine.SystemWebViewEngine;


/**
 * This class is the WebViewClient that implements callbacks for our web view.
 * The kind of callbacks that happen here are regarding the rendering of the
 * document instead of the chrome surrounding it, such as onPageStarted(), 
 * shouldOverrideUrlLoading(), etc. Related to but different than
 * CordovaChromeClient.
 */
public class LocalFileWebViewClient extends SystemWebViewClient {

    public LocalFileWebViewClient(SystemWebViewEngine parentEngine) {
        super(parentEngine);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        //基本可以实现localfile拦截
        Log.v("wujialei", "url : " + url);
        return super.shouldInterceptRequest(view, url);
    }
}
