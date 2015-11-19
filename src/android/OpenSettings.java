package nl.tapme.cordova;

import android.util.Log;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;

import org.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;

public class OpenSettings extends CordovaPlugin {
	private static final String TAG = "OpenSettings";

	@Override
	public void initialize(final CordovaInterface cordova, CordovaWebView webView) {
		Log.v(TAG, "OpenSettings: initialization");
		super.initialize(cordova, webView);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}

	public boolean execute(String action, CordovaArgs args, final CallbackContext callbackContext) throws JSONException {
		return false;
	}
}
