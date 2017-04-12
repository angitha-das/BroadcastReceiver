package com.example.angithadas.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    WifiReceiver wifiReceiver = new WifiReceiver();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerReceiver(wifiReceiver, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"),"android.permission.ACCESS_NETWORK_STATE",null);
        //registerReceiver(wifiReceiver, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
        Toast.makeText(this, "Registered broadcast receiver", Toast.LENGTH_SHORT)
                .show();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(wifiReceiver);
        Toast.makeText(this, "unregistered broadcast receiver", Toast.LENGTH_SHORT)
                .show();
    }

}
