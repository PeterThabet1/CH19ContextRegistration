package com.example.ch19contextregistration

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import java.util.logging.Logger

class MyReceiver : BroadcastReceiver() {

    val Log = Logger.getLogger(javaClass.name)

    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "Got it", Toast.LENGTH_LONG).show()
        Log.info("Got it")
    }
}