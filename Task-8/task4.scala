object zadanie4 {
  def function(value: Int, fun: Int=>Int): Int = fun(fun(fun(value)))

  def main(args: Array[String]): Unit = {
    println(function(2, x=>x+x))
  }
}
