import challange.pattern.*

fun main(args: Array<String>) {

    //inisialisasi objek

    val polaPiramidaBintang = PiramidaBintang(8)
    polaPiramidaBintang.gambarPola()
    println()
    val polaPiramidaTerbalik = PiramidaTerbalikBintang(8)
    polaPiramidaTerbalik.gambarPola()
    println()
    val polaBelahKetupat = BelahKetupatBintang(8)
    polaBelahKetupat.gambarPola()
    println()
    val plusBintang = PlusBintang(9)
    plusBintang.gambarPola()
    println()
    val segitigaSikuSikuBintang = SegitigaSikuSikuBintang(8)
    segitigaSikuSikuBintang.gambarPola()
    println()
    val xBintang = XBintang(15)
    xBintang.gambarPola()

}


