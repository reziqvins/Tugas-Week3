fun main () {
    //Deklarasi variable dan tioe datanya
    val belanja: Double = 400000.0;
    var member = false;
    var potMem = 5 / 100
    var pot = 10 / 100
    var disc15 = belanja * 15 / 100
    var disc5 = belanja * 5 / 100
    var disc10 = belanja * 10 / 100

    if (member == true) {
        if (belanja >= 500000.0) {
            println("Total Belanja1 = " + (belanja - disc15))
        } else {
            println("total belanja2 =" + (belanja - disc5))
        }

    } else {
        if (belanja >= 500000.0) {
            println("total belanja3= " + (belanja - disc10))
        } else {
            println("total belanjja4= " + belanja)
        }
    }
}

