fun main(args: Array<String>) {
    val hh: Array<String> = arrayOf("5","4","1","3", "/", "3", "3","-","33")
    //"-", "11")
    //"+", "22", "33")
    var aa = false
    var ll = 1
    var num1 = ""
    var num2 = ""
    var sigh = ""
    var res = 0
   for(gg in hh) {
       if (gg == "+" || gg == "-" || gg == "*" || gg == "/") {
           ll = ll + 1
           if(aa == false){
           sigh = gg
           }
           aa = !aa
       }else {
           if (ll == 1) {
               num1 = num1 + gg
           }else if(ll == 2){
               num2 = num2 + gg
           }else if(ll == 3){
               when(sigh){
                   "+" -> res = num1.toInt() + num2.toInt()
                   "-" -> res = num1.toInt() - num2.toInt()
                   "*" -> res = num1.toInt() * num2.toInt()
                   "/" -> res = num1.toInt() / num2.toInt()
               }
           }

       }

       }



           println(num1)
           println(num2)
           println(res)

       }
