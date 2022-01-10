object zadanie10 {
  def regenerateList(list: List[Double]): List[Double] = {
    list.filter(x => -5 <= x && x <= 12).map(x => x.abs)
  }

  def main(args: Array[String]): Unit = {
    val numbersList = List(22.48, -5, 11.99, 13, 2, 0, -5.01)

    regenerateList(numbersList).foreach(x => print(x+" "))
  }
}
