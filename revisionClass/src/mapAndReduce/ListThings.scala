package mapAndReduce

object ListThings extends App {

  val nums = List(1,2,3,4)
  val moreNums = List(5,6,7,8)
  val wordSeq = Seq("Hello", "World", "Snuggles", "Batman", "Ebe")
  val wordSeq2 = Seq("World", "Snuggles")
  
  
  //println(nums :: moreNums) // adds an element to the begining of a list, eg the List nums is added as the first element of the List moreNums List(List(1,2,3,4),5,6,7,8)
  //println(nums ::: moreNums) // adds the elements of the first List to the second List(1,2,3,4,5,6,7,8)
  
  
  def printList(x: List[Int]): String = {
    x match {
      case x :: xs => x.toString() + " " + printList(xs)
      case _ => ""
    }
  }
  
  println(printList(nums.reverse.sortWith((x,y) => x < y) ::: moreNums.reverse))
  
  println((1 to 5).map(x => x*x))
  // find the factorial of a number using reduce
  println((1 to 6).reduce((x,y) => x*y))
  
  
  val cList = nums ::: moreNums
  println(cList)
  println(cList ::: cList)
  println(cList contains 5)
  println((1 to 101) filter((x) => x % 3 == 0)
                     filter((x) => x % 5 == 0)
                     map((x) => x * 2))
                     
                     
  // accepts two sequences of type A and returns their intersection
  def intersector[A](a: Seq[A], b: Seq[A]): Seq[A] ={
    a intersect b
  }
  println(intersector(wordSeq, wordSeq2))
  println(intersector(cList, (1 to 5)))
  
  // displays all the elements of the list as a string separated by ", "
  println(cList mkString(", "))
  
  // partitions a list into two separate lists by a predicate
  println((1 to 20) partition(x => x % 2 ==0)_2)
  
  // groups the sequence into vectors depending on whether they satisfy the predicate
  val mapx = ((1 to 20) groupBy(x => x % 2 ==0))
  println(mapx(true))
  
  
  println(nums :+ 10)
  println(10 +: nums)
  
  println(cList flatten (1 to 5)
  
  /*def fact(x: Int): Int = {
    if (x == 0) x
    else x * fact(x-1)
  }
  
  def factTR(x: Int, acc: Int = 1): Int = {
    if (x == 0) acc
    else factTR(x-1, x * acc)
  }
  
  println(fact(5))
  println(factTR(5))*/
}