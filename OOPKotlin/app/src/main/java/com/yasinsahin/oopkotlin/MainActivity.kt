package com.yasinsahin.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("-------Sınıflar------")
        val kullanici = Kullanici("Yasin",21)
        val digerKullanici = Kullanici("Sahin",44)

        println("-------Encapsulation------")

        val ahmet = Sanatci("Ahmet",25,"Muzisyen")
        println(ahmet.isim)
        //ahmet.isim="Ahmet2"
        println(ahmet.isim)

        println("------Inheritance------")

        val mehmet = OzelSanatci("Mehmet",26,"Ozel Muzisyen")

        mehmet.sarkiSoyle()

        println("-------Polymorphism-------")

        //Statik Polymorphism
        val islem = Islemler()
        println(islem.carpma())
        println(islem.carpma(2,3))
        println(islem.carpma(2,3,4))

        //Dinamik Polymorphism

        val kedi = hayvan()
        kedi.sesCikar()

        var barley = Kopek()
        barley.sesCikar()
        barley.kopekFonksiyonu()

        println("-------Abstraction & Interface-------")

        kullanici.insanFonksiyonu()
        var gitar = Gitar()
        gitar.marka="Gitar Markası"
        gitar.elektro = true
        gitar.bilgiFonksiyonu()
        println(gitar.oda)

        println("------Lambda Gösterimleri--------")

        yazdigimiYazdir("test")

        val yazdigimiYazdirLambda= {verilenString : String -> println(verilenString)}
        yazdigimiYazdirLambda("test3")

        val carpmaIslemiLambda = {a: Int,b : Int, c: Int -> (a*b*c)}
        println(carpmaIslemiLambda(3,4,5))

        val carpmaLambdaV2 : (Int,Int) -> Int = {a,b -> a*b}
        println(carpmaLambdaV2(4,5))
    }

    fun yazdigimiYazdir(string: String){
        println(string)
    }
}