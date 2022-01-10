case class Osoba(var imie: String, var nazwisko: String)

object zadanie3 {

  def patternMatch(osoba: Osoba): String = {
    osoba match {
      case Osoba("Przemek", "Maciejewski") => "Dzien dobry, Przemek!"
      case Osoba("Mateusz", _) => "Witaj, Mateusz!"
      case _ => "Czesc!"
    }
  }

  def main(args: Array[String]): Unit = {
    val person1 = new Osoba("Przemek", "Maciejewski")
    val person2 = new Osoba("Mateusz", "Maciejewski")
    val person3 = new Osoba("Stanislaw", "Maciejewski")

    println(patternMatch(person1))
    println(patternMatch(person2))
    println(patternMatch(person3))
  }
}
