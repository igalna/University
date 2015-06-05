package revisionClass

/**
 * 
 * Accepts a list of Type Any and returns a flattened list
 * 
 */

object flatList extends App {
  def flatten (ls: List[Any]): List[Int] =
     ls match {
       case Nil => Nil
       case (x: Int) :: xs => x :: flatten(xs)
       case (x: List[Any]) :: xs => flatten(x) ++ flatten(xs)
       
  }

  var l: List[Any] = List()
  println(flatten(l))
  l = List(1,2,3)
  println(flatten(l))
  l = List(1,2, List(3,4,5), List(4,5,67, List()), 778, List())
  println(flatten(l))
  
}