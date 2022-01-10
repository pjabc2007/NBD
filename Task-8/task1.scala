object zadanie1{
  def patternMatching(day: String): String = {
    val days = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek")
    val weekend = List("Sobota", "Niedziela")

    day match {
      case day if days contains day => "Praca"
      case day if weekend contains day => "Weekend"
      case _ => "Nie ma takiego dnia"
    }
  }

  def main(args: Array[String]): Unit = {
    println(patternMatching("Poniedzialek"))
    println(patternMatching("Sobota"))
    println(patternMatching("Monday"))
  }
}
