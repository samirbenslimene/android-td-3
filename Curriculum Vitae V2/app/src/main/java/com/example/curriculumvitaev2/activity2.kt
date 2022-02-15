package com.example.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.slider.Slider
import com.google.android.material.snackbar.Snackbar
import androidx.annotation.NonNull




class activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val sub : Button = findViewById(R.id.btnvalid)
        sub.setOnClickListener {
            Submit()
        }
    }
    fun Submit () : Boolean
    {
        val android : Slider = findViewById<Slider>(R.id.sandroid)
        val ios : Slider = findViewById<Slider>(R.id.sios)
        val flutter : Slider = findViewById<Slider>(R.id.sflutter)
        val arabic : CheckBox = findViewById(R.id.carabic)
        val french : CheckBox = findViewById(R.id.cfrench)
        val english : CheckBox = findViewById(R.id.cenglish)
        val music : CheckBox = findViewById(R.id.cmusic)
        val sport : CheckBox = findViewById(R.id.csport)
        val games : CheckBox = findViewById(R.id.cgames)
        var nbAnd = 5
        var nbIos = 5
        var nbFlut = 5
        var language =""
        var hobbies = ""
        android?.addOnSliderTouchListener(object : Slider.OnSliderTouchListener {
            override fun onStartTrackingTouch(slider: Slider) {
                // Responds to when slider's touch event is being started
            }

            override fun onStopTrackingTouch(slider: Slider) {
                // Responds to when slider's touch event is being stopped
                nbAnd = slider.value.toInt()
            }
        })
                                    /* IOS */
        ios?.addOnSliderTouchListener(object : Slider.OnSliderTouchListener {
            override fun onStartTrackingTouch(slider: Slider) {
                // Responds to when slider's touch event is being started
               // nbIos = slider.value.toInt()
            }

            override fun onStopTrackingTouch(slider: Slider) {
                nbIos = slider.value.toInt()
                // Responds to when slider's touch event is being stopped
            }
        })

                                    /* Flutter */
        flutter?.addOnSliderTouchListener(object : Slider.OnSliderTouchListener {
            override fun onStartTrackingTouch(slider: Slider) {
                // Responds to when slider's touch event is being started
               // nbFlut = slider.value.toInt()
            }

            override fun onStopTrackingTouch(slider: Slider) {
                nbFlut = slider.value.toInt()
                // Responds to when slider's touch event is being stopped
            }
        })
        if(arabic.isChecked)
        {
            language += " Arabic"
        }
        if(french.isChecked)
        {
            language += " French"
        }
        if(english.isChecked)
        {
            language += " English"
        }
        if(!arabic.isChecked && !french.isChecked && !english.isChecked)
            return  false

        if(music.isChecked)
        {
            hobbies += " Music"
        }
        if(sport.isChecked)
        {
            hobbies += " Sport"
        }
        if(games.isChecked)
        {
            hobbies += " Games"
        }
        if(!music.isChecked && !sport.isChecked && !games.isChecked)
            return  false

        var bundle :Bundle ?=intent.extras
       var fullname = bundle!!.getString("fullname")
       var email = bundle!!.getString("email")
       var age = bundle!!.getString("age")
        var gender = bundle!!.getString("gender")
        val intent = Intent(this,final_activity::class.java).apply {
            putExtra("fullname", fullname)
            putExtra("email", email)
            putExtra("age", age)
            putExtra("gender",gender)
            putExtra("android",nbAnd.toString())
            putExtra("ios",nbIos.toString())
            putExtra("flutter",nbFlut.toString())
            putExtra("Language",language)
            putExtra("hobbies",hobbies)
        }
        startActivity(intent)
        return true
    }
}