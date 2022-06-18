package com.yasinsahin.oopkotlin

class Gitar : Enstruman,Dekorasyon {
    var marka : String? = null
    var elektro : Boolean? = null
    override var oda: String
        get() = "salon"
        set(value) {}

}