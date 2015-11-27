package org.wujialei.cordova.localfile;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

import org.apache.cordova.engine.SystemWebViewClient;
import org.apache.cordova.engine.SystemWebViewEngine;

import java.io.IOException;


/**
 * This class is the WebViewClient that implements callbacks for our web view.
 * The kind of callbacks that happen here are regarding the rendering of the
 * document instead of the chrome surrounding it, such as onPageStarted(), 
 * shouldOverrideUrlLoading(), etc. Related to but different than
 * CordovaChromeClient.
 */
public class LocalFileWebViewClient extends SystemWebViewClient {

    private LocalFilePlugin plugin;

    public LocalFileWebViewClient(SystemWebViewEngine parentEngine, LocalFilePlugin plugin) {
        super(parentEngine);
        this.plugin = plugin;
    }

    /**
     * 用于主动拦截 SCHEME_TAG类型的请求
     * @param view
     * @param url
     * @return
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        WebResourceResponse response = super.shouldInterceptRequest(view, url);
        boolean isLocal = url.contains(LocalFilePlugin.SCHEME_TAG);
        if(url != null && isLocal) {
            String assetPath = url.substring(url.indexOf(LocalFilePlugin.SCHEME_TAG) +
                    LocalFilePlugin.SCHEME_TAG.length(), url.length());
            try {
                plugin.log("base : " + assetPath);
                response = new WebResourceResponse(
                        "application/javascript",
                        "UTF8",
                        view.getContext().getAssets().open("www/" + assetPath)
                );
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return response;
    }
}
