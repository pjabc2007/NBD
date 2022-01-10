import scala.annotation.tailrec

object zadanie3 {
  val days = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def getDaysString(days: List[String]): String = {
    @tailrec def tailRec(acc: String, days: List[String]): String ={
      if(days.isEmpty){
        return acc.substring(0, acc.length() - 2)
      }
      tailRec(acc + days.head + ", ", days.tail)
    }

    tailRec("", days)
  }

  def main(args: Array[String]): Unit = {
    println(getDaysString(days))
  }
}
