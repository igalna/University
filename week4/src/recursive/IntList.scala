package recursive


// a LinkedList containing integers
// representing the items as pairs
// so 1 link -> 2 link -> 3 link -> 4 link -> end
sealed trait IntList 
// end object to be used at the end of the LinkedList
final case object End extends IntList
// elements to be stored in the LinkedList
final case class Pair(item: Int, tail: IntList) extends IntList

object Test extends App {
  def sum(list: IntList): Int =
    list match {
      case End  => 0
      case Pair(hd, tl) => hd + sum(tl)
      
    }
  println(sum(Pair(1, Pair(2, Pair(3, End)))))
}