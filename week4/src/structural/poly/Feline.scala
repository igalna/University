package structural.poly


// Feline -> Lion, Tiger, Panther or Cat


// polymorphic version, fairly straight forward
// easy to extend the available class
// all you do is subclass and put in a dinner function
sealed trait Feline {
  def dinner: Food
}

final case class Lion() extends Feline {
  def dinner: Food = Antelope
}
final case class Tiger() extends Feline {
  def dinner: Food = TigerFood
}
final case class Panther() extends Feline {
  def dinner: Food = TigerFood
}
final case class Cat(favFood: String) extends Feline {
  def dinner: Food = CatFood(favFood)
}



sealed trait Food
final case object Antelope extends Food
final case object TigerFood extends Food
final case class CatFood(food: String) extends Food