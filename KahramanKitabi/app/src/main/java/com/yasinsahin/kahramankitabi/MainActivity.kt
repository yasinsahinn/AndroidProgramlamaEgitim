package com.yasinsahin.kahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var takimIsimleri=ArrayList<String>()
        takimIsimleri.add("Galatasaray")
        takimIsimleri.add("Fenerbahce")
        takimIsimleri.add("Besiktas")
        takimIsimleri.add("Trabzonspor")
        takimIsimleri.add("Bursaspor")

        /*val galataBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.galatasaray)
        val fenerbahceBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.fenerbahce)
        val besiktasBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.besiktas)
        val trabzonBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.trabzonspor)
        val bursaBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.bursaspor)

        var takimGorselleri=ArrayList<Bitmap>()
        takimGorselleri.add(galataBitmap)
        takimGorselleri.add(fenerbahceBitmap)
        takimGorselleri.add(besiktasBitmap)
        takimGorselleri.add(trabzonBitmap)
        takimGorselleri.add(bursaBitmap)*/

        val galatasarayDrawableId=R.drawable.galatasaray
        val besiktasDrawableId=R.drawable.besiktas
        val fenerbahceDrawableId=R.drawable.fenerbahce
        val trabzonsporDrawableId=R.drawable.trabzonspor
        val bursasporDrawableId=R.drawable.bursaspor

        var takimDrawableListesi=ArrayList<Int>()
        takimDrawableListesi.add(galatasarayDrawableId)
        takimDrawableListesi.add(besiktasDrawableId)
        takimDrawableListesi.add(fenerbahceDrawableId)
        takimDrawableListesi.add(trabzonsporDrawableId)
        takimDrawableListesi.add(bursasporDrawableId)




        //adapter
        val layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager
        val adapter=recyclerAdapter(takimIsimleri,takimDrawableListesi)
        recyclerView.adapter=adapter





    }
}