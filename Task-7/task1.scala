object zadanie1{
  val days = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def getDaysString(days: List[String]): String = {
    var string = ""

    for (day <- days){
      string += day + ", "
    }

    string.substring(0, string.length() - 2)
  }

  def getDaysStartsWithPString(days: List[String]): String = {
    var string = ""

    for (day <- days){
      if(day.startsWith("P"))
        string += day + ", "
    }

    string.substring(0, string.length() - 2)
  }

  def getDaysStringWhile(days: List[String]): String = {
    var i = 0
    var string = ""

    while(i < days.length){
      string += days(i) + ", "
      i += 1
    }

    string.substring(0, string.length() - 2)
  }

  def main(args: Array[String]): Unit = {
    println("a) "+getDaysString(days))
    println("b) "+getDaysStartsWithPString(days))
    println("c) "+getDaysStringWhile(days))
  }
}
