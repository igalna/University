package week7


// uses lazy evaluation, which means that whenever you encounter something, you evaluate it
object Lazy extends App {

  // expensive value, requires a method to run to get the value
  // resource must be an int, it calls meth() which does some expensive calculation to get the value
  // ideally we only want to initialise the resource when we actually use it.
  // adding the "lazy" to the declaration does exactly this
  lazy val  resource: Int = meth()
  
  def meth(): Int = {
    println("Doing something expensive")
    0
  }
}