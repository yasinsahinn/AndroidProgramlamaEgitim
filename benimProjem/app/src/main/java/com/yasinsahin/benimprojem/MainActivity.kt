package com.yasinsahin.benimprojem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.function.IntBinaryOperator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        classYapisi()
    }
  fun cikarma(x:Int,y:Int) : Int
  {
      return x-y

  }
    /*fun okey(view: View)
    {
        val cikarmaSonucu=cikarma(50,15)
        textView.text="Sonuc= ${cikarmaSonucu}"
    }*/

    fun classYapisi()
    {
        var takimlar=Takim("GALATASARAY",10,"G")
        textView.text="GÜRKAN ADAMDIR"


    }

}
