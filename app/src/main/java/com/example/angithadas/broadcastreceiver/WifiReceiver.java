package com.example.angithadas.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.widget.Toast;

/**
 * Created by angitha.das on 12-04-2017.
 */

public class WifiReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int wifiState = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE,
                WifiManager.WIFI_STATE_UNKNOWN);
        String wifiStateText = "No State";

        switch (wifiState) {
            case WifiManager.WIFI_STATE_DISABLING:
                wifiStateText = "WIFI_STATE_DISABLING";
                break;
            case WifiManager.WIFI_STATE_DISABLED:
                wifiStateText = "WIFI_STATE_DISABLED";
                break;
            case WifiManager.WIFI_STATE_ENABLING:
                wifiStateText = "WIFI_STATE_ENABLING";
                break;
            case WifiManager.WIFI_STATE_ENABLED:
                wifiStateText = "WIFI_STATE_ENABLED";
                break;
            case WifiManager.WIFI_STATE_UNKNOWN:
                wifiStateText = "WIFI_STATE_UNKNOWN";
                break;
            default:
                break;
        }
        Toast.makeText(context,"onReceive Broadcast > WiFiState: " + wifiStateText, Toast.LENGTH_SHORT).show();
    }
}