package structural.pm

sealed trait Aa
case class Ba() extends Aa
case class Ca() extends Aa

object PolySum {
  def f(a: A) =
    a match {
    case Ba() => ???
    case Ca() => ???
  }
}