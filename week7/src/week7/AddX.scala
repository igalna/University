package week7

// another version of a Curried function, showing a more useful way of applying Currying
object AddX extends App {

  // defines a general add Function which closes in on its argument
  def addX(i:Int) = (j:Int) => i + j
  
  def addOne = addX(1)
  def addTwo = addX(2)
  
  println(addOne(5))
  println(addTwo(7))
}