package week7

//write a continue statement because Scala does not have one
object CallByName extends App {
  
  // while(condition)
  //  body of loop
  
  // has two sets of arguments
  // in Scala if you have two sets of arguments
  // we can represent a function which can take two arguments with two different sets of brackets
  // the first set of arguments represents the condition
  // the second set of arguments represents the body
  def continue(conditional: => Boolean)(body: => Unit) {
    // call by name is signified by putting the colon in the first argument
    // conditional is then evaluated every time the loop goes round
    // re evaluating every time
    if (conditional) {
      body
      continue(conditional)(body)
    }
    
  }
  
  var count = 0
  continue(count < 5 ) {
    println(s"value of count is  $count")
    count += 1
  }
  
/*  
  // in either call by value or call by reference
  // a method call will evaluate the Actual value of the parameters
  def a = 3
  def b = 5
  
  def meth(x: Int, y: Int) = ???
  // meth(a,b) is called with 3 and 5
  meth(a,b)*/
}