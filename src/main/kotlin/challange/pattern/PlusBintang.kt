package challange.pattern

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