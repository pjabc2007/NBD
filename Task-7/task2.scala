object zadanie2 {
  val days = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def getDaysString(days: List[String]): String = {
    if(days.length == 1){
      return days.head
    }

    days.head + ", " + getDaysString(days.tail)
  }

  def getReverseDaysString(days: List[String]): String = {
    if(days.length == 1){
      return days.head
    }

    getReverseDaysString(days.tail) + ", " + days.head
  }

  def main(args: Array[String]): Unit = {
    println("a) "+getDaysString(days))
    println("b) "+getReverseDaysString(days))
  }
}
