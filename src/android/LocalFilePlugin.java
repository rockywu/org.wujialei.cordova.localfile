/*
 * 允许跨域加载本地file:///android_asset/www/下的文件
 * 
 * @author rockywu
 * @email wjl19890427@hotmail.com
 * @copyright Wujialei Inc
 * @created 2015-07-17
 */
package org.wujialei.cordova.localfile;

import android.content.Context;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;

public class LocalFilePlugin extends CordovaPlugin {

    private static final String LOG_TAG = "LocalFilePlugin";

    private Context mContext;

    private CordovaWebView webview;
  
  @Override
  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
      super.initialize(cordova, webView);
      // your init code here
      this.mContext = cordova.getActivity();
      this.webView = webView;
      
  }
  
  @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
  //    Log.v("fxapp","action : " + action);
    // if (action.equals(this.deviceRegister)) {
  //        Log.v("fxapp","deviceRegister is Running");
  //        if(this.deviceRegister(args)) {
  //          Log.v("fxapp",this.deviceRegister + " Status.Ok");
  //          callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, "deviceRegister is success"));
  //        } else {
  //          Log.v("fxapp",this.deviceRegister + " Status.Error");
  //          callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, "city_id is 0 or null"));
  //        }
  //           return false;
  //       } else if(action.equals(this.networkReload)) {
  //        this.networkReload(args);
  //        return false;
  //       } else if(action.equals(this.displayMessage)) {
  //        this.displayMessage(args);
  //       }
  //       return true;  // Returning false results in a "MethodNotFound" error.
    return true;
    }
  
  
}
