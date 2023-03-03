class Robot(private val name:String, private val day:String ) {

    fun alarmRing(time: String, dayAlarmNotRing:List<String>){
        if ( dayAlarmNotRing[0] == day || dayAlarmNotRing[1] == day) {
            println("Alarm will not ring, because it's $day..Weekend")
            println(">")
            println(">")
        }
        else{
            println("Today is $day.")
            println("Hey, it's $time AM...Wake Up")
            println(">")
            println(">")
        }
    }
    fun makeCoffee(coffeeType:String,sugarQuantity:Double){
           println("$coffeeType coffee ready..")
           println("Have a sip..")
           println("Sugar Quantity is $sugarQuantity gms")
           println(">")
           println(">")


    }
    fun heatWater(temperature:Double,dayOfNotBathing:String){
          if ( dayOfNotBathing == day) {
              println("Today is $day. It's not bathing day for you..relax")
              println(">")
              println(">")
          }
         else{
              println("Go for a bath buddy.")
              println("Water temperature is $temperature degree celsius")
              println(">")
              println(">")
         }
    }
    fun packBag(books:List<String>){
            println("As today is $day, as per schedule i packed your bag with books : ")
        for(book in books) {
            println(book)
        }
        println(">")
        println(">")

    }
    fun cook(breakfastItems:List<String>,lunchItems:List<String>){
         val bfItem = breakfastItems.random()
         val lunItem = lunchItems.random()
         println("Breakfast is ready for you..")
         println("Have a tasty \"$bfItem\" ")
         println("And for lunch, i prepared \"$lunItem\" for you..Have it!!")
         println(">")
         println(">")
    }
    fun ironClothes(clothes:String){
            println("Clothes are ironed..")
            println("Today try this $clothes.")
            println(">")
            println("Hurry up!!...If you do things slow, you will be late for today classes..")
            println("Have a good day!!")
            println("SIGNING OFF....$name THE ROBOT")
    }



}


