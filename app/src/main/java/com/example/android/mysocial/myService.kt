package com.example.android.mysocial

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class myService:BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"alarm ended",Toast.LENGTH_LONG).show()

    }

}