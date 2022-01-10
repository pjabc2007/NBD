object zadanie7 {
  def show(x: Option[Int]): String = x match {
    case Some(p) => "Price: " + p
    case None => "There is no such product"
  }

  def main(args: Array[String]): Unit = {
    val firstMap = Map("Mleko" -> 3, "Chleb" -> 5, "Cola" -> 7, "Mango" -> 6)

    println("Mango " + show(firstMap.get("Mango")))
    println("Beer " + show(firstMap.get("Beer")))
  }
}
