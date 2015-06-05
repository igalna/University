package algebraic

//case class A(b: B, c: C)

trait B {}

trait C {}

// the Has-A pattern
// A has-a B, A has-a C
// also known as a PRODUCT type
trait A {
  def b: B
  def c: C
}