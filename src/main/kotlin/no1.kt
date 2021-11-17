fun main () {
    //Deklarasi variable dan tioe datanya
    val belanja: Double = 625000.0;
    var member = true;
    var potMem = 5 / 100
    var pot = 10 / 100
    var disc15 = belanja * 15 / 100
    var disc5 = belanja * 5 / 100
    var disc10 = belanja * 10 / 100
    var aku =("pembeli 1 mendapat diskon 15% dari")



    if (member == true) {
        if (belanja >= 500000.0) {
            println("pembeli 1 mendapat diskon 15% dari $belanja jadi totalnya = $belanja - $disc15 = " + (belanja - disc15))
        } else {
            println("pembeli 1 mendapat diskon 5% dari $belanja jadi totalnya = $belanja - $disc5 = " + (belanja - disc5))
        }

    } else {
        if (belanja >= 500000.0) {
            println("pembeli 1 mendapat diskon 10% dari $belanja jadi totalnya = $belanja - $disc10 = "+ (belanja - disc10))
        } else {
            println("pembeli 1 mmembayar dengan total = "+ belanja)
        }
    }
}

