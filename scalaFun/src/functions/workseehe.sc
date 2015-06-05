package functions

object workseehe {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val fruit = "Apples" :: "Oranges" ::
  						"Grapes" :: "Mangoes" ::
  						"Pears" :: "Pineapples" :: Nil
                                                  //> fruit  : List[String] = List(Apples, Oranges, Grapes, Mangoes, Pears, Pineap
                                                  //| ples)
  println(fruit.head)                             //> Apples
  println(fruit.tail.head)                        //> Oranges
  
  val numbers = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: 7 ::
  							8 :: 9 :: 10 :: Nil
                                                  //> numbers  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  
  
  object MatchTest1 extends App {
    def matchTest(x: Int): String = x match {
    	case 1 => "one"
    	case 2 => "two"
    	case _ => "many"
    }
    println(matchTest(3))
}

println(MatchTest1.matchTest(4))                  //> many
  
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