object zadanie8 {
  def removeZero(list: List[Int]): List[Int] = {
    def rec(acc: List[Int], list: List[Int]): List[Int] = {
      if (list.isEmpty){
        return acc
      }

      if(list.head == 0){
        rec(acc, list.tail)
      }else{
        rec(list.head :: acc, list.tail)
      }

    }
    rec(List(), list.reverse)
  }

  def main(args: Array[String]): Unit = {
    val numbersList = List(1, 6, 0, 6, 0, 8, 2, 0, 0)

    removeZero(numbersList).foreach(x => print(x))
  }
}
