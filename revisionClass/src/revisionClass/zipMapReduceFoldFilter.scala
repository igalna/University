package revisionClass

object zipDemo extends App {

  val left = Vector ("a", "b", "c", "d")
  val right = Vector ("q", "r", "s", "t")
  val left2 = Vector ("u", "v")
  
  // zips elements in the left vector to for pairs with elements in the right vector
  //println(left zip right)
  
  
  val leftList = List(1, 2, 3, 4, 5, 6)
  val rightList = List(4,5,6)
  //println(leftList zip rightList)
  
  
  // fold takes items from one side of a list and performs the function on each successive element
  // in this case it takes x and adds it to y
  // '0' is the accumulator
  println(leftList.foldLeft(0)((x, y) => x + y))
  
  println(leftList.foldLeft(0) (_ + _)/ leftList.foldLeft(0)((x, y) => x + 1))
  
  //println(leftList)
  
  // map takes each element in the list and performs the function on that element
  
  println(leftList.map(x => x * x))
  
  // in fold we give the starter value, in this case '0'
  // reduce does not require the started value, it takes the first element of the list as the starter value
  //println(leftList.reduce((x, y) => x * y))
  
  // filter filters the list and returns a list with the values that meet the filter condition 
  //println(leftList.filter(_ < 3))
  
  val reduceList = leftList.filter(_ < 3).reduce(_ + _)
  
  val aMap = Map(1 -> 2)
  
  val result = List()
  
  // for comprehension can be used to break down the actions of the map, reduce etc
  // to a more procedural way of doing it
  //for { item <- leftList
  //   if item % 2 == 0 
  //     
  //} yield println(item)
  
  
  val listOfChars = List("H", "e", "l", "l", "o")
  println(listOfChars.foldLeft("")((x, y) => x + y))
  //println(listOfChars.foldRight("Starting Point ")((x, y) => x + y))
  
  
  // tuple d n and s are assigned to the elements on the right
  // can be used to return things with multiple return types, like a fraction with a numerator and denominator
  var (d, n, s) = (1.1, 12, "Hi")
  var x = (1.1, 12, "Hi")
  
  //println(x._1)
  //println(x._2)
  //println(x._3)
  
  //println(d, n, s) // prints 1.1, 12, Hi
  
}