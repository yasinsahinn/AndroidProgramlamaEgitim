package com.yasinsahin.oopkotlin

open class Sanatci (isim: String,yas: Int, meslek: String){ //kalıtım alabilmek icin

    //Encapsulation

    var isim : String? = isim
        private set
        get

    var yas: Int? = yas
        private set
        get
    private var meslek : String? = meslek

}