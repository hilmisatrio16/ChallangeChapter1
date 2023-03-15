package challange.pattern

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