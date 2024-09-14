fun main() {
    val ABC = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz"
    val stroka:String = readln()
    var count = 0
    for (i in 0 until ABC.length) {
        for (j in 0 until stroka.length) {
            if (stroka[j] == ABC[i]) {
                count += 1;
            }
        }

        if (count > 0 ) {
            println(message = ABC[i] + " - " + count)
            count = 0;
        }
    }
}