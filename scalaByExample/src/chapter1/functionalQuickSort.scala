package chapter1

object functionalQuickSort extends App {
  
  def sort(xs: Array[Int]): Array[Int] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      Array.concat(
          sort (xs filter (pivot >)),
                xs filter (pivot ==),
          sort(xs filter (pivot <)))
    }
  }
    
  val numArray = Array(1, 3, 5, 7, 8, 9, 2, 4, 6, 8)
  //println(numArray.mkString(" "))
  //println(sort(numArray).mkString(" "))
  
  val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
  
  println(numList.filter(_ % 2 == 0))
  println(numArray.zip(numList).mkString(" "))
  println(numList.map(x => x - 1))
  println(numList.foldLeft(0)((x, y) => x + y))
  println(numList.foldRight(0)((x, y) => x - y))
  
  println(numList.map(x => x - 1).filter(_ % 2 != 0))
}

