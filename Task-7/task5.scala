object zadanie5 {
  def main(args: Array[String]): Unit = {
    val firstMap = Map("Mleko" -> 3, "Chleb" -> 5, "Cola" -> 7, "Mango" -> 6)
    val secondMap = firstMap.map({
      case (name, price) => (name, price * 0.9)
    })

    println("Pierwsza cena mleka: " + firstMap("Mleko") + "zl")
    println("Obnizona cena mleka: " + secondMap("Mleko") + "zl")
  }
}
