trait Maybe[+A]{
  def applyFunction[R](fun: A => R): Maybe[R]
  def getOrElse[B >: A](getValue: B): B
}

class No extends Maybe[Nothing]{
  override def applyFunction[R](fun: Nothing => R): Maybe[R] = new No()

  override def getOrElse[B >: Nothing](getValue: B): B = getValue
}

class Yes[A](var value: A) extends Maybe[A] {
  override def applyFunction[R](fun: A => R): Maybe[R] = new Yes(fun(value))

  override def getOrElse[B >: A](getValue: B): A = value
}

object zadanie4 {
  def main(args: Array[String]): Unit = {
    val no = new No
    val yes = new Yes[Int](5)

    println(no.getOrElse(10))
    println(yes.getOrElse(10))
  }
}
