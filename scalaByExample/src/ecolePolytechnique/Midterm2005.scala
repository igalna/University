package ecolePolytechnique

object Midterm2005 extends App {

  
  val nameList1 = List("Sam", "Steve", "Bob", "Egbert", "Bartholemew")
  val nameList2 = List("Roger", "Pete", "Clive")
  
  /*println(nameList1.zip(nameList2))
  
  println(nameList1.reverse)
  val nameList3 = nameList1.reverse ::: nameList2.reverse
  println(nameList3)
  
  println(nameList3.map(_.length))
  println(nameList3.map(_.length).reduce((x, y) => x + y))
  
  println(nameList3.sortBy { x => x.length }.map(_.length))
  println(nameList3.sortBy (x => x.length).map(_.length).reverse)*/
  
  val numList = List(1, 2, 5, 3, 88, 123, 93, 12, 54, -1, 566)
  
  println(numList)
  println(numList.zip(nameList2))
  println(nameList2.reverse.zipWithIndex)
  
  println(numList.map(x => x /2))
  println(numList.reduce((x, y) => x + y))
  println(numList.map(x => x / 2).reduce((x, y) => x + y))
  println(numList.reduce((x, y) => x + y) / 2)

}