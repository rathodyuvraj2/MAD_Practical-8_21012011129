package com.example.mad_practical_8_21012011129

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun setAlarm(militime:Long,action:String){
        val intentalarm = Intent(applicationContext,AlarmBroadcastReciver::class.java)
        intentalarm.putExtra(AlarmBroadcastReciver.ALARAMKEY,action)
        val pendingintent = PendingIntent.getBroadcast(applicationContext,4345,intentalarm,PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT)
        val manager = getSystemService(ALARM_SERVICE) as AlarmManager
        if(action == AlarmBroadcastReciver.ALARAMSTART){
            manager.setExact(AlarmManager.RTC_WAKEUP,militime,pendingintent)
        }else if(action == AlarmBroadcastReciver.ALARAMSTOP){
            manager.cancel(pendingintent)
            sendBroadcast(intentalarm)
        }

    }
}