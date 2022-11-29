package com.example.gdgchallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gdgchallenge.databinding.ActivityEventScheduleBinding
import com.example.gdgchallenge.databinding.ActivityEventsBinding
import com.example.gdgchallenge.pojo.EventSchedule

class EventScheduleActivity : AppCompatActivity() {
    lateinit var binding: ActivityEventScheduleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEventScheduleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras?.get("EventSchedule") as EventSchedule

        binding.timeTask1.text = bundle.arrayTasks[0].time
        binding.timeTask2.text = bundle.arrayTasks[1].time
        binding.timeTask3.text = bundle.arrayTasks[2].time
        binding.timeTask4.text = bundle.arrayTasks[3].time
        binding.timeTask5.text = bundle.arrayTasks[4].time

        binding.dateTask1.text = bundle.arrayTasks[0].date
        binding.dateTask2.text = bundle.arrayTasks[1].date
        binding.dateTask3.text = bundle.arrayTasks[2].date
        binding.dateTask4.text = bundle.arrayTasks[3].date
        binding.dateTask5.text = bundle.arrayTasks[4].date

        binding.titleTask1.text = bundle.arrayTasks[0].title
        binding.titleTask2.text = bundle.arrayTasks[1].title
        binding.titleTask3.text = bundle.arrayTasks[2].title
        binding.titleTask4.text = bundle.arrayTasks[3].title
        binding.titleTask5.text = bundle.arrayTasks[4].title


        binding.buFeedBack.setOnClickListener {
            startActivity(Intent(this ,FeedBackActivity::class.java))
        }

    }
}