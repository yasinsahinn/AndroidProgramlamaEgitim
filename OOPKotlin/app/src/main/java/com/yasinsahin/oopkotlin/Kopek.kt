package com.yasinsahin.oopkotlin

class Kopek : hayvan() {
    fun kopekFonksiyonu(){
        super.sesCikar()

    }
    override fun sesCikar(){
        println("kopek sınıfı")
    }
}