package challange.pattern

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