package b

// Implementation of a LinkedList in Scala, using traits objects and classes

sealed trait IntList {
  
  // map function accepts a function and applies the function to each element of the List
  def map(fn: Int => Int): IntList =
    this match {
      case EndOfList => EndOfList
      case Node(hd, tl) => Node(fn(hd), tl.map(fn))
  }
  // the functions for performing math on the IntList are now included in the sealed trait
 /* def length: Int =
    this match {
      case EndOfList => 0
      case Node(hd, tl) => 1 + tl.length
    }*/
  
/*  def double: IntList =
    this match {
      case EndOfList => EndOfList
      case Node(hd, tl) => Node(hd * 2, tl.double)
  }*/
  
 /* def sum: Int =
    this match {
      case EndOfList => 0
      case Node(hd, tl) => hd + tl.sum
  }*/
  
  // abstracting out the functionality of the functions
  // using what in java is called lambda expressions, but in scala are known as function literals
  // the parameter 'f' is a function literal that accepts two Ints and returns an Int
  // NOW Generecised with type parameter T
  // abstraction of type T
  // fold is one of the standard patterns in functional programing
  // the expression is folded from one side to the other
  
  def fold[T](end: T, f: (Int, T) => T): T =
    this match {
      case EndOfList => end
      case Node(hd, tl) => f(hd, tl.fold(end, f))
  }
  
  
  // length calls the abstraction
  // with two ints, the head and tail, and computes 1 + the tail
  def length: Int =
    fold[Int](0, (hd, tl) => 1 + tl)
    
  // sum calls the abstraction
  // with two ints, the head and the tail, and computes head + tail
  def sum: Int =
    fold[Int](0, (hd, tl) => hd + tl)
  
  
  // now that the abstraction method is parameterized, you have to add the type of each abstraction function call
  def double: IntList =
    fold[IntList](EndOfList, (hd, tl) => Node(hd * 2, tl))

}

// singleton EndOfList Object
final case object EndOfList extends IntList
// case class for nodes of the list
final case class Node(head: Int, tail: IntList) extends IntList



object Test extends App {
  val l = Node(1, Node (2, Node (3, EndOfList)))
  println(l.sum)
  println(l.length)
  println(l.double)
  println(l.map(x => x * 3))
  
  // sum uses recursion to go through a linked list and sum its elements
  // match statement tests if the recursion is at the end of the list
  // else if the case is a Node with a head and a tail, it sums the head of the node
  // and recursively calls sum on the tail
  
/*  
  def sum(list: IntList): Int =
    list match {
      case EndOfList => 0
      // uses the Case classes 'unApply' method to de-construct the fields in the case class
      case Node(hd,tl) => hd + sum(tl)
  }*/
  
  
  
  // localised import statement, the import on lasts until the end of the block
  // tailrec annotation makes sure that methods are tail recursive
  // so that they keep memory usage to a minimum
  import scala.annotation.tailrec
  
  @tailrec
  def sum(list: IntList, total: Int = 0): Int =
    list match {
      case EndOfList => total
      // uses the Case classes 'unApply' method to de-construct the fields in the case class
      case Node(hd, tl) => sum(tl, hd + total)
  }
 
  // length method calculates the length of the list.
  // uses the same recursion pattern as the sum method
  def length(list: IntList): Int = 
    list match {
      case EndOfList => 0
      case Node(hd, tl) => 1 + length(tl)
  }
    
    
  
}
    
