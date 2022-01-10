trait Maybe[+A]{
  def applyFunction[R](fun: A => R): Maybe[R]
}

class No extends Maybe[Nothing]{
  override def applyFunction[R](fun: Nothing => R): Maybe[R] = new No()
}

class Yes[A](var value: A) extends Maybe[A] {
  override def applyFunction[R](fun: A => R): Maybe[R] = new Yes(fun(value))
}

object zadanie3 {
  def main(args: Array[String]): Unit = {
    val no = new No
    val yes = new Yes[Int](5)

    println(no.applyFunction(x => x).isInstanceOf[Maybe[_]])
    println(yes.applyFunction(x => x+x).isInstanceOf[Maybe[_]])

    println(yes)
    println(yes.applyFunction(x => x+x))
  }
}
