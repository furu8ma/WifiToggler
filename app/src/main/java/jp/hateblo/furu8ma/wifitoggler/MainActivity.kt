package jp.hateblo.furu8ma.wifitoggler

import android.app.Activity
import android.net.wifi.WifiManager
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toggleWifi()
        finish();
    }

    fun toggleWifi() {
        val wifiManager: WifiManager = getSystemService(WIFI_SERVICE) as WifiManager;
        var message = "UNKNOWN";
        if (wifiManager.isWifiEnabled) {
            wifiManager.isWifiEnabled = false;
            message = "WIFI OFF"
        } else {
            message = "WIFI ON"
            wifiManager.isWifiEnabled = true;
        }
        val toast = Toast.makeText(this, "\n\n　　　" + message + "　　　\n\n", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }
}
