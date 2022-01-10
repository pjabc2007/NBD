class Container[A](newValue : A){
  private val _value: A = newValue
  def getContent: A = _value
  def applyFunction(fun: A=>A): A = fun(_value)
}

object zadanie1{
  def main(args: Array[String]): Unit = {
    val container = new Container[Int](5)
    println(container.getContent)
    println(container.applyFunction(x => x+x))
  }
}
