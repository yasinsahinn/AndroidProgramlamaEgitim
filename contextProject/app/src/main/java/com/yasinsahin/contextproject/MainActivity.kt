package com.yasinsahin.contextproject

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Toast.makeText( this,"hoşgeldiniz", Toast.LENGTH_SHORT).show()
    }

    fun calistir(view:View)
    {
        val uyariMesaji=AlertDialog.Builder(this@MainActivity)
        uyariMesaji.setTitle("şifre hatalı")
        uyariMesaji.setPositiveButton("Evet",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText( this,"şifre doğru" ,Toast.LENGTH_LONG).show()
        })

        uyariMesaji.setNegativeButton("hayır"){dialogInterface, i->
            Toast.makeText( this,"şifre yanlışş", Toast.LENGTH_LONG).show()
        }
        uyariMesaji.show()





    }
}