package week7

object Curry extends App {

/*  // example of currying in scala
  // function meth accepts a function which takes an int and returns an int
  // also accepts two ints
  def meth(fn: (Int => Int), a: Int, b: Int) = {
    
  }*/
  
  def cat1(s1: String, s2: String) = 
    s1 + s2
  println(cat1("fred", " Dodge"))
  
  // shows you can split apart the arguments
  def cat2(s1:String)(s2:String) = 
    s1 + s2
  println(cat2("fred")(" Dodge"))
  
  // partially applied function, pushes the parameters into a lambda
  def cat3(s1:String) = (s2:String) => s1 + s2
  // the function returned from cat1 is then called with the second argument "Dodge"
  println(cat3("fred")(" Dodge"))
  // the return type of cat3 called with only 1 parameter is a function with only 1 argument
  println(cat3("fred"))
  
  // val 1 is then the function returned from calling cat3 with "Hello"
  val l = cat3 ("Hello ")
  println(l("Betty"))
  println(l("Rita"))
  
  
  // curried version of cat1
  val cat1Curried = (cat1 _).curried
  // calling cat1Curried returns a function1
  println(cat1Curried("XXX "))
  // this then evaluates the function with "YYY"
  println(cat1Curried("XXX ")("YYY"))
}