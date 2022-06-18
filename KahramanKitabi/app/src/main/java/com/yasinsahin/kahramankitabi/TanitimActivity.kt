package com.yasinsahin.kahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tanitim.*

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)

        val intent= intent
        val secilenTakim=intent.getStringExtra("takimIsmi")
        textView3.text=secilenTakim

        val secilenTakimGorseli=intent.getIntExtra("takimGorseli",0)
        val bitmap=BitmapFactory.decodeResource(applicationContext.resources,secilenTakimGorseli)
        imageView.setImageBitmap(bitmap)



    /*val secilenTakimGorseli=SingletonClass.secilenTakimGorsel
        val secilenGorsel=secilenTakimGorseli.gorsel
        imageView.setImageBitmap(secilenGorsel)*/
    }
}