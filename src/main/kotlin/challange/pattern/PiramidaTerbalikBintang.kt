package challange.pattern

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