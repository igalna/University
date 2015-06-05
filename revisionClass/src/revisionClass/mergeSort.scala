package revisionClass

/**
 * 
 * Splits a list in two
 * then recursively call the algorithm on the sublists
 * then merge both sublists back together
 * 
 * merge takes two sorted lists and glues them back together
 * comparator function is required
 * return => a single List
 * 
 */

object mergeSort extends App {

  def merge[T](aList: List[T], bList: List[T]) ( cmp: (T,T) => Boolean): List[T] =
    (aList, bList) match {
    // if the first list is empty then it will be the other one
    case (Nil, _) => bList
    // if the second list is Nil it will be the first one
    case (_,Nil) => aList
    case (x :: xs, y :: ys) => 
      if (cmp(x, y)) x :: merge(xs, bList)(cmp)
      else y :: merge(aList, ys)(cmp)
    
    
  }
  
  
  val l1 = List(1, 4, 7, 10)
  val l2 = List(2,3,5,7,12,16)
  println(merge(l1, l2) ((x,y) => x <= y))
  // List(1, 2, 3, 4, 5, 7, 7, 10, 12, 16)
}