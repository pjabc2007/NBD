class KontoBankowe(kwota: Double){
  private var _stanKonta: Double = kwota
  def this() = this(0)
  def stanKonta: Double = this._stanKonta

  def wplata(kwota: Double): Unit = this._stanKonta += kwota

  def wyplata(kwota: Double): Unit ={
    if(this._stanKonta >= kwota){
      this._stanKonta -= kwota
    }else{
      println("Brak srodkow")
    }
  }
}

object zadanie2 {
  def main(args: Array[String]): Unit = {
    val empty = new KontoBankowe()
    val rich = new KontoBankowe(500)

    println("empty: "+empty.stanKonta)
    println("rich: "+ rich.stanKonta)

    empty.wplata(125)
    rich.wyplata(125)

    println("empty: "+empty.stanKonta)
    println("rich: "+ rich.stanKonta)
  }
}
