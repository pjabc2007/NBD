class Person(imie: String, nazwisko: String){
  private val _podatek = 0.0
  def podatek: Double = _podatek
}

trait Student extends Person {
  override def podatek = 0.0
}

trait Pracownik extends Person {
  private var _pensja = 0.0
  def pensja: Double = _pensja
  def pensja_=(newValue: Double): Unit = {
    _pensja = newValue
  }
  override def podatek: Double = pensja * 0.2
}

trait Nauczyciel extends Pracownik{
  override def podatek: Double = pensja * 0.1
}

object zadanie5 {
  def main(args: Array[String]): Unit = {
    val person1 = new Person("Przemek", "Maciejewski") with Student
    println("Podatek Student: "+person1.podatek)
    val person2 = new Person("Mateusz", "Maciejewski") with Pracownik
    person2.pensja = 10000
    println("Podatek Pracownik: "+person2.podatek)
    val person3 = new Person("Stanislaw", "Maciejewski") with Nauczyciel
    person3.pensja = 10000
    println("Podatek Nauczyciel: "+person3.podatek)

    val person4 = new Person("Przemek", "Maciejewski") with Student with Pracownik
    person4.pensja = 10000
    println("Podatek Student/Pracownik: "+person4.podatek)
    val person5 = new Person("Przemek", "Maciejewski") with Pracownik with Student
    person5.pensja = 10000
    println("Podatek Pracownik/Student: "+person5.podatek)
  }
}
