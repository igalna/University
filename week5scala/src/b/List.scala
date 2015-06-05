/*package b

// Generic Linked List
// of the parameter type [T]
sealed trait List[T] {
  def length: Int =
    this match {
      case EndOfList => 0
      case Node[T](hd, tl) => 1 + tl.length
    }
  
  def double: List[T] =
    this match {
      case EndOfList() => EndOfList
      case Node(hd, tl) => Node(hd * 2, tl.double)
  }
  
  def sum: T =
    this match {
      case EndOfList => 0
      case Node(hd, tl) => hd + tl.sum
  }

}
final case class EndOfList extends List[T]
final case class Node[T](head: Int, tail: List[T]) extends List[T]



object Test extends App {
  val l = Node(1, Node (2, Node (3, EndOfList())))
  println(l.sum)
  println(l.length)
  //println(l.double)
}*/