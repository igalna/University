package Generics

sealed trait GenericLinkedList[T] {
  
  // Genericised Fold function
  def fold(end: T, f: (T, T) => T): T =
    this match {
      case EndOfList() => end
      case Pair(hd, tl) => f(hd, tl.fold(end, f))
  }
  
  // Genericised Map Function
  // we introduce the type 'U' as the map function may change the type of the input
  // for example from a int to a double
  def map[U](fn: T => U): GenericLinkedList[U] =
    this match {
      case EndOfList() => EndOfList[U]()
      case Pair(hd, tl) => Pair(fn(hd), tl.map(fn))
  }
  
  /*def sum =
    fold(0, (hd, tl) => hd + tl)*/
    
  /*def length: Int =
    fold[Int](0, (hd, tl) => 1 + tl)*/
    
  /*def product =
    fole(1, (hd, tl) => hd + tl)*/
}
  
// can't have a genericised Object, so switch it into a class
final case class EndOfList[T]() extends GenericLinkedList[T]
  
final case class Pair[T](head: T, tail: GenericLinkedList[T]) extends GenericLinkedList[T]

class Person
class Student() extends Person
class PGStudent() extends Student
class Academic() extends Person


object Main extends App {
  
  // type constrained GenericLinkedList
  def l:GenericLinkedList[Int] = Pair(1, Pair(2, Pair(3, Pair(4, EndOfList()))))
  println(l.map(_ * 2.5))
  println(l.map(_ + 1))
  
  println(l)
  println(Pair("asdb", EndOfList()))
  
  // this is allowed as it infers that the type of Pair is Person
  println(Pair(new Student(), Pair( new Person(), EndOfList())))
  // this doesn't work as Person is not a subclass of Student
  def p: Pair[Student] = Pair(new Student(), Pair(new PGStudent,  EndOfList()))
}