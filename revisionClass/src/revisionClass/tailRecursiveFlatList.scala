package revisionClass

/**
 * 
 * Tail Recursive, uses a Helper function to flatten a List of Type Any
 * 
 */

object tailRecursiveFlatList extends App {

    def flatten (ls: List[Any]): List[Int] = {
    /* ls match {
       case Nil => Nil
       case (x: Int) :: xs => x :: flatten(xs)
       case (x: List[Any]) :: xs => flatten(x) ++ flatten(xs)
    }*/
    
      /*
       * 
       * Helper Function keeps an accumulator of the Ints already added to the flattened list
       * 
       */
      def flattenHelper(ls: List[Any], acc: List[Int]): List[Int] = 
        ls match {
          case Nil => acc
          case (x: Int) :: xs => x :: flattenHelper(xs, acc)
          case (x: List[Any]) :: xs => flattenHelper(x, flattenHelper(xs, acc))
        }
      flattenHelper(ls, Nil)
    }
    
    
  var l: List[Any] = List()
  println(flatten(l))
  l = List(1,2,3)
  println(flatten(l))
  l = List(1,2, List(3,4,5), List(4,5,67, List()), 778, List())
}