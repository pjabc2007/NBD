object zadanie9 {
  def regenerateList(list: List[Int]): List[Int] = {
    list.map(x => x + 1)
  }

  def main(args: Array[String]): Unit = {
    val numbersList = List(1, 6, 6, 8, 2)

    regenerateList(numbersList).foreach(x => print(x))
  }
}
