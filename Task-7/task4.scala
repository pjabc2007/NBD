object zadanie4 {
  val days = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def getDaysLeftString(days: List[String]): String = {
    val string = days.foldLeft("") {
      (acc, day) => acc + day + ", "
    }

    string.substring(0, string.length() - 2)
  }

  def getDaysRightString(days: List[String]): String = {
    val string = days.foldRight("") {
      (acc, day) => acc + ", " + day
    }

    string.substring(0, string.length() - 2)
  }

  def getDaysWithPString(days: List[String]): String = {
    val string = days.filter(p => p.startsWith("P")).foldLeft("") {
      (acc, day) => acc + day + ", "
    }

    string.substring(0, string.length() - 2)
  }

  def main(args: Array[String]): Unit = {
    println(getDaysLeftString(days))
    println(getDaysRightString(days))
    println(getDaysWithPString(days))
  }
}
