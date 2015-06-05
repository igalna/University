package structural.poly

// standard PRODUCT type OR pattern

sealed trait A {
  def foo: String = "It's an A!"
}

// when you give a method behaviour, you have to use the override declaration
final case class B() extends A {
  override def foo: String = "It's a B!"
}

final case class C() extends A {
  override def foo: String = "It's a C!"
}