package structural.pm


// Feline -> Lion, Tiger, Panther or Cat


// pattern matching
sealed trait Feline {
  def dinner: Food = 
    this match {
    case Lion() => Antelope
    case Tiger() => TigerFood
    case Panther() => TigerFood
    case Cat(favFood) => CatFood(favFood)
  }
}

// 3. Use an external object to do the matching
object Diner {
  def dinner(feline: Feline): Food =
    feline match {
      case Lion() => Antelope
      case Tiger() => TigerFood
      case Panther() => TigerFood
      case Cat(favFood) => CatFood(favFood)
  }  
}

final case class Lion() extends Feline
final case class Tiger() extends Feline
final case class Panther() extends Feline
final case class Cat(favFood: String) extends Feline



sealed trait Food
final case object Antelope extends Food
final case object TigerFood extends Food
final case class CatFood(food: String) extends Food

// 1. polymorphism
// 2. pattern matching on the base trait

// 3. Use an external object to do the matching
//    using an external object allows you to move the decision outside the classes involved


//                           Add new Method              Add new Data
// Object Orientated:         change existing code        existing code is unchanged
// Functional Program:        existing code unchanged     change existing code

