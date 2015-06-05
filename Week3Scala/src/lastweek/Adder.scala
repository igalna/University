package lastweek

class Adder(amount: Int) {
  // naming the method "apply" allows you to use a Functional type syntax
  def apply(in: Int) = in + amount
}