package structural.pm

// pattern matching example

trait B

trait C

case class A(b: B, c: C)

// def accepts an A and returns a B or a C
object Poly {
  def foo(a: A) =
    a match {
        case A(b,c) => ???
  }
}

