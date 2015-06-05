package traitsInheritace

sealed trait Shape {
  
  def sides: Int
  def perimeter: Double
  def area: Double
  
}

final case class Circle(rad: Int) extends Shape {
  
  def sides = 1
  def perimeter = 2 * (math.Pi * rad)
  def area = 2 * ((math.Pi * rad) * 2)
  
}

trait Rectangular extends Shape {
  
  def sides = 4
  def perimeter = (2 * width) + (2 * height)
  def area = width * height
  def width: Double
  def height: Double
  
}

final case class Square(x: Int) extends Rectangular {
  
  def height = x
  def width = x
  
}

final case class Rectangle(width: Int, height: Int)