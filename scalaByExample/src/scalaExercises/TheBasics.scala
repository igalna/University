package scalaExercises

object TheBasics extends App {
  
  def factorial(n: Int): Int =  // non-tail recursive factorial
     if (n == 0) 1 
     else n * factorial(n - 1)
  println(factorial(4))
  
  def factorialTR(n: Int) = {  // tail- recursive factorial
    def factHelper(n: Int, acc: Int): Int = {
      if (n <= 0) acc
      else factHelper(n-1, acc * n)
    }
    factHelper(n, 1)
  }
  println(factorialTR(4))
  
  def trFact(n: Int, acc: Int = 1): Int = { // stand alone tail recursive factorial
    if (n <= 0) acc
    else trFact(n-1, acc * n)
  }
  println(trFact(4))
  
  def sumF(f: Int => Int)(a: Int, b: Int): Int = {
    def sumFHelper(x: Int, y: Int): Int = {
      if (a > b) 0
      else (f(a) + sumF(f)(a + 1, b))
    }
    sumF(f)(a,b)
  }
  
  def sum(f: Int => Int)(a: Int, b: Int): Int = { // Tail Recursive Sum Function
    def iter(a: Int, result: Int): Int = {
       if (a > b) result
       else iter(a + 1, result + f(a) )
      }
      iter(a, 1)
   }
  
  def product (a: Int, b: Int): Int = { // 5.2.2 non tail recursive product function
    if (a > b) a
    else a * product(a + 1, b)
  }
  
  def productTailRecursive(f: Int => Int)(a: Int, b: Int) = { // 5.2.2 tail recursive product function
    def productHelper(n: Int, acc: Int): Int = {
      if (a > b) acc
      else (productHelper(n+1, acc * f(n)))
    }
    productHelper(a, 1)
  }
  
 def operate(f: Int => Int)  // 5.2.4 More general function which generalises sum and product
            (oper: (Int, Int) => Int)
            (a: Int, b: Int, init: Int): Int = {
    def iter(a: Int, result: Int): Int = {
      if (a > b) result
      else (iter(a + 1, oper(result, f(a))))
    }
    iter(a, init)
  }
 
 
}