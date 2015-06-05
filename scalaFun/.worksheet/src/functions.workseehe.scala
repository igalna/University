package functions

object workseehe {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 
  println("Welcome to the Scala worksheet");$skip(114); 
  
  val fruit = "Apples" :: "Oranges" ::
  						"Grapes" :: "Mangoes" ::
  						"Pears" :: "Pineapples" :: Nil;System.out.println("""fruit  : List[String] = """ + $show(fruit ));$skip(22); 
  println(fruit.head);$skip(27); 
  println(fruit.tail.head);$skip(83); 
  
  val numbers = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: 7 ::
  							8 :: 9 :: 10 :: Nil
  
  
  object MatchTest1 extends App {
    def matchTest(x: Int): String = x match {
    	case 1 => "one"
    	case 2 => "two"
    	case _ => "many"
    }
    println(matchTest(3))
};System.out.println("""numbers  : List[Int] = """ + $show(numbers ));$skip(218); 

println(MatchTest1.matchTest(4))}
  
/* obejct listFunctions {
 
	  def isort(xs: List[A]): List[A] =
	  	xs match {
	  		case List() => List()
	  		case x :: xs1 => insert(x, isort(xs1))
	  }
	  
	  def insert(x: A, xs List[A]): List[A] =
	  	xs match {
	  		case List() => List(x)
	  		case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
	  	}
  	}
  	*/
}
