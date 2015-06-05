package Generics

// T <: upperbound
// T >: lowerbound
// T <% viewbound
// T : contextbound

// T <: upper >: lower
// T <: Comparable with Serializable with Cloneable
// T 


// +T covariance, can be T and any subclasses of it
// -T contravariance, can be T and any superclasses of it


//case class Pair[T <% Comparable[T]](first: T, second: T) {
  //def smaller = if (first.compareTo(second) < 0) first else second
  
/*class Person extends Friend[Person]
class Student() extends Person
class PGStudent() extends Student
class Academic() extends Person*/

/*case class Pair[T](first: T, second: T) {
  def replaceFirst[R >: T](newFirst: R) = {
  //def replaceFirst(newFirst: T) = {
    new Pair[R](newFirst, second)
  }
}*/

// is the Pair of Students a subclass of the Pair of Persons
// Pair[Student] subclass of Pair[Person]
// NO

// but suppose you do
// this is where co-variance comes in
//case class Pair[+T](first: T, second: T)

// -T goes the other way
trait Friend[-T] {
  def beFriend(someone: T) = ???
}

object Test extends App {
  
  //val t = Pair(new PGStudent(), new Student())
  //println(t)
  
  def makeFriendWith(s: Student, f: Friend[Student]): Unit = {
    f. beFriend(s)
  }
  
  val fred = new Student()
  val joan = new Person()
  
  //println(makeFriendWith(fred, joan))
  
  //println(t.replaceFirst(new Person()))
  
  //val p = new Pair("Sergio" , "G")
  //println(p.smaller)
    
  //new Pair(42, "String")
  
  //new Pair[Any, Any](42, "String")
  
  //def getMiddle[T](a: Array[T]) = a(a.length/2)
  
  //val a = Array(1,2,3)
  
  //getMiddle(a)
  
  //val s = Array("A", "B", "C")
  //getMiddle(s)
  
  //val p1 = new Pair(3, 4)
  //println(p1.replaceFirst(6))
}
