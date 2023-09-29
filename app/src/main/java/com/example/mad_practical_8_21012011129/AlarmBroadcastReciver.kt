package com.example.mad_practical_8_21012011129

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmBroadcastReciver : BroadcastReceiver() {

    companion object{
        val ALARAMKEY = "key"
        val ALARAMSTART = "start"
        val ALARAMSTOP = "stop"
    }


    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        val data = intent.getStringExtra(ALARAMKEY)
        val intentservice = Intent(context,AlarmService::class.java)
        if(data == ALARAMSTART){
            context.startService(intentservice)
        }else{
            context.stopService(intentservice)
        }
    }
}