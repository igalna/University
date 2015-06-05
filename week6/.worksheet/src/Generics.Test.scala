package Generics
// T <: upperbound
// T >: lowerbound
// T <% viewbound
// T : contextbound

// +T covariance, can be T and any subclasses of it
// -T contravariance, can be T and any superclasses of it

object Test extends App {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(265); 
	val p = new Pair("Sergio" , "G");System.out.println("""p  : <error> = """ + $show(p ));$skip(20); 
	println(p.smaller);$skip(27); val res$0 = 
		
	new Pair(42, "String");System.out.println("""res0: <error> = """ + $show(res$0));$skip(36); val res$1 = 
	
	new Pair[Any, Any](42, "String");System.out.println("""res1: <error> = """ + $show(res$1));$skip(49); 
	
	def getMiddle[T](a: Array[T]) = a(a.length/2);System.out.println("""getMiddle: [T](a: Array[T])T""");$skip(24); 
	
	val a = Array(1,2,3);System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(16); val res$2 = 
	
	getMiddle(a);System.out.println("""res2: Int = """ + $show(res$2));$skip(32); 
	
	val s = Array("A", "B", "C");System.out.println("""s  : Array[String] = """ + $show(s ));$skip(14); val res$3 = 
	getMiddle(s);System.out.println("""res3: String = """ + $show(res$3))}
}
