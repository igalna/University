package worksheet

import scala.collection.immutable.Vector

object week3Scala {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(124); 
  println("Welcome to the Scala worksheet");$skip(27); val res$0 = 
  
	Forecast.forecast(100);System.out.println("""res0: String = """ + $show(res$0));$skip(23); val res$1 = 
	Forecast.forecast(80);System.out.println("""res1: String = """ + $show(res$1));$skip(22); val res$2 = 
	Forecast.forecast(0);System.out.println("""res2: String = """ + $show(res$2));$skip(23); val res$3 = 
	Forecast.forecast(43);System.out.println("""res3: String = """ + $show(res$3));$skip(23); val res$4 = 
	Forecast.forecast(20);System.out.println("""res4: String = """ + $show(res$4));$skip(50); 
	
	val sunnyData = Vector(100, 80, 50, 20, 0, 15);System.out.println("""sunnyData  : scala.collection.immutable.Vector[Int] = """ + $show(sunnyData ));$skip(59); val res$5 = 
 	for (i <- sunnyData) yield println(Forecast.forecast(i));System.out.println("""res5: scala.collection.immutable.Vector[Unit] = """ + $show(res$5));$skip(57); 
	val family1 = new Family("Mum", "Dad", "Dick", "Sally");System.out.println("""family1  : worksheet.Family = """ + $show(family1 ))}

}
