package challange.pattern

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