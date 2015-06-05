package lotsAndLotsOfFoldLeft

object FoldLeft extends App {

  val l = List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21)
  
  // def sum(l: List[Int]): Int = l.foldLeft(0)((x,y) => x + y)
  def sum(l: List[Int]): Int = l.foldLeft(0)(_+_)
  println(sum(l))
  
  // find the product of a list of ints
  def product(l: List[Int]): Int = l.foldLeft(1)(_*_)
  println(product(l))
  
  // count how many elements there are in a list
  def count(l: List[Any]): Int = l.foldLeft(0)((x,_) => x + 1)
  println(count(l))
  println(l.length)
  
  val d = List[Double](1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21)
  
  // find the Average of a list of doubles
  def average(l: List[Double]): Double = (l.foldLeft(0.0)((x,y) => x+y)) / (l.foldLeft(0.0)((x,_) => x + 1))
  println(average(d))
  
  // Average using Pattern matching
  def averagePM(l: List[Double]): Double = {
    l match {
      case head :: tail => tail.foldLeft( (head,1.0) )((r,c) =>
                   ((r._1 + (c/r._2)) * r._2 / (r._2+1), r._2+1) )._1
      case Nil => 0
    }
  }
  println(averagePM(d))
  
  // pattern matching find last element
  def lastPM[A](l: List[A]): A = {
    l match {
      case hd :: Nil => hd
      case hd :: tl => lastPM(tl)
    }
  }
  
  // foldLeft to find the last element
  def last[A](l: List[A]): A = {
    l.foldLeft[A](l.head)((_, c) => c)
  }
  println(last(d))
  println(lastPM(d))
  
  // pattern matching penultimate
  def penultimatePM[A](l: List[A]): A = {
    l match {
      case (hd :: tl :: nil) => hd
      case (hd :: tl) => penultimatePM(tl)
    }
  }
  // foldLeft penultimate
  def penultimate[A](l: List[A]): A = {
    l.foldLeft((l.head, l.tail.head))((r, c) => (r._2, c))._1
  }
  println(penultimate(d))
  
}