fun main(args: Array<String>) {
    val hh: Array<String> = arrayOf("1", "3", "2", "4", "+", "4", "-", "3", "3", "*", "5", "8", "0", "-", "4", "5", "/", "4")
    val jj = mutableListOf<String>()
    val pp = mutableListOf<String>()
    val oo = mutableListOf<String>()
    var sigh1 = ""
    var l = ""
    var num1 = 0
    var nn = 0

    var num2 = 0
    pp.add("")
    for (gg in hh) {
        if (gg == "+" || gg == "-" || gg == "*" || gg == "/") {
            pp.add(gg)
            jj.add("|")
        } else {
            jj.add(gg)
        }


    }
    jj.add("|")
    for (kk in jj) {
        if (kk != "|") {
            l = l + kk
        } else {
            oo.add(l)
            l = ""
        }
    }
    for (aa in oo.indices){

        // if(aa % 2 == 0){
           num2 = oo[aa].toInt()
           sigh1 = pp[aa]
           when(sigh1){
               "+" -> num1 = num1 + num2
               "-" -> num1 = num1 - num2
               "*" -> num1 = num1 * num2
               "/" -> num1 = num1 / num2
               "" -> num1 = num1 + num2
           }

           num2 = 0
        nn = nn + 1

    }



}




















