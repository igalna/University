package mockExam

class Multiset {

  type Multiset = Int => Int

  def emptyMultiset: Multiset = { _ => 0 }
  def singleton(x: Int): Multiset = { y => if (y == x) 1 else 0 }

  def union (a: Multiset, b: Multiset): Multiset = {
    y => a(y) + b(y)
  }

}