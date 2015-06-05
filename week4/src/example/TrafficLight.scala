package example

//sealed trait TrafficLight {
//  def next: TrafficLight
//}
//
//// Polymorphism
//final case object Red extends TrafficLight {
//  def next: TrafficLight = Green
//}
//final case object Green extends TrafficLight {
//  def next: TrafficLight = Amber
//}
//final case object Amber extends TrafficLight {
//  def next: TrafficLight = Red
//}

// PatternMatching
sealed trait TrafficLight {
  def next: TrafficLight =
    this match {
      case Red => Green
      case Green => Amber
      case Amber => Red
  }
}

// external object
object Light {
  def next(t: TrafficLight): TrafficLight = {
    t match {
      case Red => Green
      case Green => Amber
      case Amber => Red
    }
  }
}

final case object Red extends TrafficLight
final case object Green extends TrafficLight
final case object Amber extends TrafficLight

// using poly and then pattern matching
// implement a method next
// which returns the next TrafficLight in the sequence
// Red -> Green -> Amber -> Red

// should the method be inside or outside the class?

