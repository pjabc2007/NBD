object zadanie6 {
  def printTuple(tuple3: (String, Int, Boolean)): Unit = {
    tuple3.productIterator.foreach(x => { println(x) })
  }

  def main(args: Array[String]): Unit = {
    val tuple3 = ("Porsche", 2019, false)
    printTuple(tuple3)
  }
}
