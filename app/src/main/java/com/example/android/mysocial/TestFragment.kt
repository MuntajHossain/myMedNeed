package com.example.android.mysocial

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.android.mysocial.databinding.FragmentTestBinding


class TestFragment : Fragment() {

    private var requestId = 5
    private lateinit var intent: Intent
    private lateinit var pendingIntent: PendingIntent
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentTestBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_test, container, false)
        binding.setAlarm.setOnClickListener {
            val alarmManager =
                context?.getSystemService(Context.ALARM_SERVICE) as? AlarmManager

            intent = Intent(context, myService::class.java)
            pendingIntent =
                PendingIntent.getBroadcast(context, 0, intent,
                    0)
            alarmManager?.set(AlarmManager.RTC, System.currentTimeMillis() + 10000, pendingIntent)
        }
        return binding.root
    }
}