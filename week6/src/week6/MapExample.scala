package week6

object MapExample extends App {
  val v = Vector(1, 12, 3, 14)
  val v1 = Vector("Asd", "BBC")
  println(v.map(x => x * x))
  
  // for statement example using standard java notations
  for (x <- v)
    println(x)
  for (x <- Range(0,10))
    println(x)
    
  // functional style foreach statement
  // infers that the function takes the same type as the vetor
  // because of strong typing 
  v.foreach(n => println("> " + n))
  
  
  // toVector turns the string into a Vector of characters
  // the foreach statement then performs the function over each character in the duck value
  //val duck = "Duck".toVector
  //duck.foreach(n => println("n> " + n))
  
  // foreach can also be applied to Range
  Range(0, 10).foreach(n => println("n > " + n))
    
  // sorted uses a type bound
  // also uses implicit, which provides a mechanism to cast to change between types
  // put as a general rule, to change from one type to another
  // also used to bring in some function, like mixing in a trait
  // in this sense there is an implicit ordering based on the type
  println(v.sorted)
  // sort with gives us a function and returns a boolean
  // determines whether the element on the left is less than the element on the right
  // reversing the order of the sorted Vector
  println(v.sortWith((i,j) => j < i))
  
  // suppose we wanted to sum the items in the Vector v
  // we could take a procedural approach
  var sum = 0
  v.foreach(x => sum += x)
  println(sum)
  
  // we want to be able to use functional programming
  // we can use the reduce function
  // there are a number of them,
  // they all take two operands and return a single operand
  println(v.reduce((sum, n) => sum + n))
      
  val duck = "Duck".toVector
  println(duck)
  println(duck.reduce((s, n) => s))
  
  
  // for comprehensions are a sort of suped up for statement
  // combine a generator a filter and some definitions
  // suppose we want to extract a vertor from some list
  val v2 = Vector(1,2,3,4,5,6,7,8,9,10,11,12,13)
  val vec = Vector(1,2,3,4,5,6,7,8,9,10, 12, 13, 14, 17, 19)
  // suppose we want to extract just the numbers that are even and greater than 5
  
  // we could use for comprehension
  def evenGt5(v: Vector[Int]): Vector[Int] = {
    var result = Vector[Int]()
    // we have to pull apart the vector
    // 'i' is part of 'v'
    for {
      i <- v2
      // two conditions are set on 'i'
      // filtering the elements
      if i % 2 == 0
      if i > 5
    } result = result :+ i
    result
  }
  
  // uses the yield version of the for comprehension
  def evenGt4(v: Vector[Int]):Vector[Int] = {
    //val result = 
    // you can remove the result value as the yield is just the result anyway
    for {
      i <- v2
      // adding a def to a def which runs the function to find if a number is odd
      isOdd = (i % 2 == 0)
      if isOdd
      if i > 4
    } yield //i
    // you can also yield a block
    // we are filtering the vector and returning the values from the block
    // this takes each 'i' from 'v', doubles it and adds 3 
    {
      val u = i * 2
      u + 3
    }
    
    //result
  }
  
  println(evenGt5(v))
  println(evenGt4(v))
  
  // there are a number of other standard functions to apply to Vectors
  println(vec.sum)
  println(vec.max)
  println(vec.take(2))
  println(vec.contains(19))
  println(vec.head)
  println(vec.tail)
  // if you look at the Sequence type, the super class of Vector
  // there are a number of other standard functions
      
}