package mapAndReduce

object CurryingFunctions extends App {

  val a = "Hello"
  val b = " World!"
  
  def strCat(x: String, y: String): String = {
    x + y
  }
  println(strCat(a, b))

  def strCatCurr(x: String = "Nope")(y: String) = {
    x + y
  }
  println(strCatCurr()(b))
  println(strCatCurr()(a))

  val concatTwirly = strCatCurr("Twirly")(_)
  println(concatTwirly(" Whirly"))
  
  // adding things with currying
  def add(x: Int)(y: Int) = {
    x + y
  }
  println(add(3)(4))
  
  val add3 = add(3)(_)
  println(add3(5))

}