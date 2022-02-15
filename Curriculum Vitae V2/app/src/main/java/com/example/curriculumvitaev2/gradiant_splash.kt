package com.example.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class gradiant_splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gradiant_splash)
        var iv = findViewById<ImageView>(R.id.iv_note)
        iv.alpha = 0f
        iv.animate().setDuration(3000).alpha(1f).withEndAction {
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
        /* iv_note.alpha = 0f
         iv_note.animate().setDuration(1500).alpha(1f).withEndAction {
             val i = Intent(this,MainActivity::class.java)
             startActivity(i)
             overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
             finish()
         }*/
    }
}