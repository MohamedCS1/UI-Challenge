package com.example.gdgchallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gdgchallenge.databinding.ActivityEventsBinding
import com.example.gdgchallenge.pojo.EventSchedule
import com.example.gdgchallenge.pojo.Task

class EventsActivity : AppCompatActivity() {
    lateinit var binding:ActivityEventsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEventsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buDevFest.setOnClickListener {
            val eventSchedule = EventSchedule(arrayListOf(Task("01 nov" ,"10:00 AM" ,"Opening Ceremony")
                ,Task("01 nov" ,"10:30 AM" ,"WORKSHOP 1")
                ,Task("01 nov" ,"12:30 PM" ,"LUNCH BREAK")
                ,Task("01 nov" ,"13:30 PM" ,"TALK 2 ( CANCELED)")
                ,Task("01 nov" ,"16:30 PM" ,"Closing Ceremony")))
            val intent = Intent(this ,EventScheduleActivity::class.java)
            intent.putExtra("EventSchedule" ,eventSchedule)
            startActivity(intent)
        }

        binding.buDroidWeek.setOnClickListener {
            val eventSchedule = EventSchedule(arrayListOf(Task("02 dec" ,"10:00 AM" ,"Opening Ceremony")
                ,Task("02 dec" ,"10:30 AM" ,"WORKSHOP Rest Api")
                ,Task("02 dec" ,"12:00 PM" ,"LUNCH BREAK")
                ,Task("02 dec" ,"14:30 PM" ,"TALK 1")
                ,Task("02 dec" ,"16:30 PM" ,"Closing Ceremony")))
            val intent = Intent(this ,EventScheduleActivity::class.java)
            intent.putExtra("EventSchedule" ,eventSchedule)
            startActivity(intent)
        }

        binding.buGovTech.setOnClickListener {
            val eventSchedule = EventSchedule(arrayListOf(Task("03 jan" ,"10:00 AM" ,"Opening Ceremony")
                ,Task("03 jan" ,"10:30 AM" ,"WORKSHOP 1")
                ,Task("03 jan" ,"12:30 PM" ,"LUNCH BREAK")
                ,Task("03 jan" ,"13:30 PM" ,"TALK 2 ( CANCELED)")
                ,Task("03 jan" ,"16:30 PM" ,"Closing Ceremony")))
            val intent = Intent(this ,EventScheduleActivity::class.java)
            intent.putExtra("EventSchedule" ,eventSchedule)
            startActivity(intent)
        }
    }
}