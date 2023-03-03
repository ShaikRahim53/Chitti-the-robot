import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Calendar

fun main() {
    //!!!TRY TO RUN THIS PROGRAM AT MORNING FOR BETTER RELATED RESULTS
    val days:List<String> = listOf("sunday","monday","tuesday","wednesday","thursday","friday","saturday")
    //FOR CURRENT TIME
    val currentTime = LocalTime.now()
    val formatter = DateTimeFormatter.ofPattern("HH:mm:ss")
    val formatted = currentTime.format(formatter)
    //FOR CURRENT DAY
    val calendar = Calendar.getInstance()
    val day = days[calendar.get(Calendar.DAY_OF_WEEK)-1]
  val robot = Robot("chitti",day)
    robot.alarmRing(formatted,listOf("saturday","sunday"))
    //COFFEE
    val coffeeTypes:List<String> = listOf("Black","Brown")
    val sugarQuaForBlackCoffee = 4.5
    val sugarQuaForBrownCoffee = 5.2
    val coffeeType = coffeeTypes.random()
    if ( coffeeType == coffeeTypes[0] )
       robot.makeCoffee(coffeeType,sugarQuaForBlackCoffee)
    else
        robot.makeCoffee(coffeeType,sugarQuaForBrownCoffee)
    //WATER FOR BATHING
    val tempForNormalDays = 16.5
    val tempForOtherDays = 35.6
    if ( day == "saturday" || day == "sunday")
       robot.heatWater(tempForNormalDays,days[1])
    else
        robot.heatWater(tempForOtherDays,days[1])
    //PACK BAG
    val bookList = mutableMapOf( days[1] to listOf("Operating Systems notes","Environmental Science notes","Data Mining notes",
                                 "Design and Algorithm Analysis notes","Artificial Intelligence and Machine Learning class notes and Lab notes")
                                ,days[2] to listOf("Universal Human Values notes","Carrier Guidance training notes","Design and Algorithm Analysis notes"
                                ,"Artificial Intelligence and Machine Learning notes","Operating Systems class notes and Lab notes"),
                                 days[3] to listOf("Data Mining notes","Operating Systems notes",
                                 "Artificial Intelligence and Machine Learning notes","Design and Algorithm Analysis notes","Full-Stack Development class notes and Lab notes"),
                                 days[4] to listOf("Artificial Intelligence and Machine Learning notes","Data Mining class notes and Lab notes","Universal Human Values notes", "Design and Algorithm Analysis notes","Full-Stack Development notes"),
                                 days[5] to listOf("Universal Human Values notes","Technical Training Lab notes","Artificial Intelligence and Machine Learning notes",
                                 "Data Mining notes","Operating Systems notes"),
                                 days[6] to listOf("Data Mining notes","Carrier Guidance training notes","Environmental Science notes", "Operating Systems notes","Universal Human Values notes"))

    bookList[day]?.let { robot.packBag(it) }
    //COOK
    val brfItems = listOf("Dosa","Idly","Vada","Mysore Bonda","Upma","poori")
    val lunItems = listOf("Lady's Finger curry","Brinjal curry","Chicken curry","Daal curry","Egg curry","Cauliflower curry","Cabbage curry")
    robot.cook(brfItems,lunItems)
    //CLOTHES
    val clothes = listOf("WHITE T-SHIRT and BLACK JEANS","T-SHIRT with DENIM JACKET and BLUE JEANS","CHECKED SHIRT and DARK WASH JEANS","WHITE SHIRT and BROWN CHINOS","FLORAL SHIRT and DARK WASH JEANS","BASIC T-SHIRT with DENIM SHIRT and CLASSIC JEANS")
    robot.ironClothes(clothes.random())

}
