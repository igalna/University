package revisionClass

object estimateB extends App {

  def estimateB(a: Double, bMin: Double, bMax: Double, err: Double): Double = {
    val b = (bMin + bMax) / 2
    val r1 = (a + b) / a
    val r2 = a / b
    
    if ((Math.abs(r1 - r2)) < err) b
    else if (r1 < r2) estimateB(a, b, bMax, err)
    else estimateB(a, bMin, b, err)
  }
  
  val a = 10
  val b = estimateB(a, 0, a, .000000001)
  println("Estimate is " + (a/b))
  
}