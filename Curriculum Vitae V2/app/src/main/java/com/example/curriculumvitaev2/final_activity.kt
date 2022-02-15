package com.example.curriculumvitaev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class final_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        var bundle :Bundle ?=intent.extras
        var fullname = bundle!!.getString("fullname")
        var email = bundle!!.getString("email")
        var age = bundle!!.getString("age")
        var gender = bundle!!.getString("gender")
        var android = bundle!!.getString("android")
        var ios = bundle!!.getString("ios")
        var flutter = bundle!!.getString("flutter")
        var Language = bundle!!.getString("Language")
        var hobbies = bundle!!.getString("hobbies")
        val tname : TextView = findViewById(R.id.tname)
        tname.setText("Name : "+fullname)
        val temail : TextView = findViewById(R.id.tfemail)
        temail.setText("Email : "+email)
        val tfage : TextView = findViewById(R.id.tfage)
        tfage.setText("Age : "+age)
        val tfgender : TextView = findViewById(R.id.tfgender)
        tfgender.setText("Gender : "+gender)
        val tfandroid : TextView = findViewById(R.id.tfandroid)
        tfandroid.setText("Android : "+android)
        val tfios : TextView = findViewById(R.id.tfios)
        tfios.setText("ios : "+ios)
        val tflutter : TextView = findViewById(R.id.tflutter)
        tflutter.setText("flutter : "+flutter)
        val tflan : TextView = findViewById(R.id.tflan)
        tflan.setText("languages : "+Language)
        val tfhobbies : TextView = findViewById(R.id.tfhobbies)
        tfhobbies.setText("hobbies : "+hobbies)
    }
}