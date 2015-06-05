package algebraic

// Algebraic data types

// if Aa is Ba or Ca

// Is-A pattern
// also known as a SUM type
sealed trait Aa {}

final case class Ba() extends Aa
final case class Ca() extends Aa

/*
                      AND                     OR
  IS-a pattern        cake pattern            SUM TYPE
  
  HAS-a pattern       PRODUCT TYPE            'has-a-or' pattern
  

*/



// Aaa is a Baa and Caa

trait Baa
trait Caa

// when you have multiple inheritance you can do what you like with traits
// multiple inheritance is allowed with traits
// use the 'with' keyword to extend from multiple traits
// cake pattern
// mixes in the functionality of multiple things with another thing, like making a cake
trait Aaa extends Baa with Caa


// 'has-a-or' pattern
// A has-a B or-a C
// we push it into two bits
// A has-a d of type D, where D is B or C

trait Ax {
  def d: D
}

sealed trait D
final case class Bx() extends D
final case class Cx() extends D


// A is a D or E -> D has a B and E has a C

sealed trait Axx
final case class Dx(b: Baa) extends Axx
final case class Ex(c: Caa) extends Axx