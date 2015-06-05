package revisionClass

sealed trait Expr

final case class Num(i: Int) extends Expr
final case class Plus(x: Expr, y: Expr) extends Expr
final case class Sub(x: Expr, y: Expr) extends Expr
final case class Mul(x: Expr, y: Expr) extends Expr
final case class Div(x: Expr, y: Expr) extends Expr

object Expr {
  def eval(n: Expr): Int = {
    n match {
      case Num(x) => x
      case Plus(x,y) => eval(x) + eval(y)
      case Sub(x,y) => eval(x) - eval(y)
      case Mul(x,y) => eval(x) * eval(y)
      case Div(x,y) => eval(x) / eval(y)
    }
  }
}
object Expression extends App {
  println(Expr.eval(Plus(Num(4), Sub(Num(5),Num(4)))))
}