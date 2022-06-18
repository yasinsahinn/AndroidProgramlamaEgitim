package com.yasinsahin.kullaniciadisaklama

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var sharedPrefences:SharedPreferences
    var alinanKullaniciAdi:String ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPrefences=this.getSharedPreferences("com.yasinsahin.kullaniciadisaklama",
        Context.MODE_PRIVATE)
        alinanKullaniciAdi=sharedPrefences.getString("kullanici","")
        if (alinanKullaniciAdi!=null)
        {
            Toast.makeText( this, "Kaydedilen İsim ${alinanKullaniciAdi}",Toast.LENGTH_LONG).show()
        }

    }
    fun kaydet(view: View)
    {
        var kullaniciAdi=editTextTextPersonName.text.toString()
        if(kullaniciAdi=="")
        {
            Toast.makeText( this,"Lütfen kullanıcı adı giriniz", Toast.LENGTH_SHORT).show()
        }
        else
        {
            sharedPrefences.edit().putString("kullanici",kullaniciAdi).apply()
            textView.text="Kullanici adi: ${kullaniciAdi}"
        }

    }

    fun sil(view: View)
    {
        alinanKullaniciAdi= sharedPrefences.getString("kullanici","")
        if(alinanKullaniciAdi!=null)
        {
            textView.text="kullanici adi: "
            sharedPrefences.edit().remove("kullanici").apply()
        }

    }
}