
fun main() {
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

interface Pola {
    fun gambarPola()
}

class PiramidaBintang(private var ukuran : Int) : Pola {

    override fun gambarPola() {
        for(i in 1..ukuran){
            for(j in 1..ukuran - i){
                print(" ")
            }
            for(z in 1 until i * 2){
                print("*")
            }
            println()
        }
    }
}
class PiramidaTerbalikBintang(private var ukuran : Int) : Pola {
    override fun gambarPola() {
        for(i in 1..ukuran){
            var k = 0
            for(z in 1 until i) {
                print(" ")
                k++
            }
            for(j in 1 until (ukuran - k) * 2){
                print("*")
            }

            println()
        }
    }
}
class BelahKetupatBintang(private var ukuran : Int) : Pola {
    override fun gambarPola() {
        for (i in 1 until ukuran * 2){
            if (i <= ukuran){
                for(j in 1..ukuran-i){
                    print(" ")
                }
                for(z in 1 until i*2){
                    print("*")
                }
                println()
            }else{
                var k = 0
                for(z in 1 .. i - ukuran) {
                    print(" ")
                    k++
                }
                for(j in 1 until (ukuran - k) * 2){
                    print("*")
                }
                println()
            }
        }
    }
}

class PlusBintang(private var ukuran : Int) : Pola {
    override fun gambarPola() {
        for(i in 0 until  ukuran){
            for (j in 0 until ukuran){
                if(i == ukuran /2 || j == ukuran/2){
                    print("* ")
                }else{
                    print("  ")
                }
            }
            println()
        }
    }
}

class SegitigaSikuSikuBintang(private var ukuran : Int) : Pola {
    override fun gambarPola() {
        for (i in 1..ukuran){
            for (j in 1..i){
                print("*")
            }
            println()
        }
    }
}

class XBintang(private var ukuran : Int) : Pola {
    override fun gambarPola() {
        for(i in 1..ukuran){
            for (j in 1..ukuran){
                //j+i == (n+1)
                if(i == j || (j + i) == (ukuran + 1)){
                    print("*")
                }else{
                    print(" ")
                }
            }
            println()
        }
    }
}