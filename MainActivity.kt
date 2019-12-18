package com.example.myapplication4

import android.content.Context
import android.os.BatteryManager
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById(R.id.textView) as TextView
        val batteryManager = getSystemService(Context.BATTERY_SERVICE) as BatteryManager
        val battery = batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_ENERGY_COUNTER)
        val battery2 = batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CURRENT_AVERAGE)
        val battery3 = batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_STATUS)
        val battery4 = batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY)
        val battery5 = batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CHARGE_COUNTER)
        val battery6 = batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CURRENT_NOW)
        val battery7 = batteryManager.getIntProperty(BatteryManager.BATTERY_STATUS_UNKNOWN)
        textView.setText("BATTERY_PROPERTY_ENERGY_COUNTER:"+battery.toString()+"\n"+
                "BATTERY_PROPERTY_CURRENT_AVERAGE:"+battery2.toString()+"\n"+
                "BATTERY_PROPERTY_STATUS:"+battery3.toString()+"\n"+
                "BATTERY_PROPERTY_CAPACITY:"+battery4.toString()+"\n"+
                "BATTERY_PROPERTY_CHARGE_COUNTER:"+battery5.toString()+"\n"+
                "BATTERY_PROPERTY_CURRENT_NOW:"+battery6.toString()+"\n"+
                "BATTERY_STATUS_UNKNOWN:"+battery7.toString()
        )
    }
}
