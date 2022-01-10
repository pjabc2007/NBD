trait Maybe[A]

class No extends Maybe[Nothing]

class Yes[A](var value: A) extends Maybe[A]

object zadanie2 {
  def main(args: Array[String]): Unit = {
    val no = new No
    val yes = new Yes[Int](5)

    println(no.isInstanceOf[Maybe[_]])
    println(yes.isInstanceOf[Maybe[_]])
  }
}
