package mockExam

object Iteration extends App {
  def iterate[T](x: T)(f: T => T): Stream[T] = 
    x #:: iterate(f(x))(f)

  def iterated[T](f: T => T): Stream[T => T] =
    ((x : T) => x) #:: (iterated(f) map (_ andThen f))
}