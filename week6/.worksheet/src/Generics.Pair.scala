package Generics
// T <: upperbound
// T >: lowerbound
// T <% viewbound
// T : contextbound

// +T covariance, can be T and any subclasses of it
// -T contravariance, can be T and any superclasses of it


case class Pair[T <: Comparable[T]](first: T, second: T) {
	def smaller = if (first.compareTo(second) < 0) first else second
}

val p = new Pair("Sergio" , "G")
println(p.smaller)
	
new Pair(42, "String")

new Pair[Any, Any](42, "String")

def getMiddle[T](a: Array[T]) = a(a.length/2)

val a = Array(1,2,3)

getMiddle(a)

val s = Array("A", "B", "C")
getMiddle(s)
