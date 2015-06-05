package Generics

object work {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet")}
}

case class Pair[T <: Comparable[T]](first: T, second: T) {
	def smaller = if (first.compareTo(second) < 0) first else second
}
