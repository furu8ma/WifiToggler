package jp.hateblo.furu8ma.wifitoggler

import android.app.Activity
import android.net.wifi.WifiManager
import android.os.Bundle
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toggleWifi()
        finish();
    }

    fun toggleWifi() {
        val wifiManager: WifiManager = getSystemService(WIFI_SERVICE) as WifiManager;
        if (wifiManager.isWifiEnabled) {
            Toast.makeText(this, "WIFI OFF", Toast.LENGTH_SHORT).show()
            wifiManager.isWifiEnabled = false;
        } else {
            Toast.makeText(this, "WIFI ON", Toast.LENGTH_SHORT).show()
            wifiManager.isWifiEnabled = true;
        }
    }
}
