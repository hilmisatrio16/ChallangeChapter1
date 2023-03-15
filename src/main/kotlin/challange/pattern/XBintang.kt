package challange.pattern

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