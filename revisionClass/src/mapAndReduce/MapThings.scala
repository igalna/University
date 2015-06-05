package mapAndReduce

object MapThings extends App {

  val vec = Vector(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
  
  println(vec.map((x) => x * 11 + 10))
  
  vec.foreach(x => print(x * 11 + 10 + " "))
  println
  
  println(vec.reduce((x, y) => x + y))
  println(vec.reduce((x,y) => x * y))
  
  println(vec.fold(-1)((x, y) => x * y))
  
  println(vec.filter((x) => x < 3))
  println(vec.filter((x) => x % 3 == 0)
             .filter((x) => x % 5 == 0))
             
  def fub(x: Seq[Int]): Seq[Int] = {
    x.filter((x) => x % 3 == 0)
     .filter((x) => x % 5 ==0)
  }
  println(fub(vec))
  
  // sorting
  val l = List(1,2,53,6,643,52,31234,1,2414,2,53)
  println(l.sortWith((x,y) => x < y)) // sortwith takes a function and applies the function
  println(l.sortWith((x, y) => x > y))
  
  def prettyPrintList[T](l: Seq[T]): String = {
    l match {
      case hd :: tl => hd.toString() + ", " + prettyPrintList(tl)
      case hd => " --> End of Sequence"
    }
  }
  
  println(prettyPrintList(l))
  
  // sorts the list into reverse order
  println(vec.sortWith((x,y) => x > y))
  // returns a new vector in reversed order
  println(vec.reverse)
}