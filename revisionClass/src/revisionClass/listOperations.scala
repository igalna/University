package revisionClass

object listOperations extends App {
  
  // :: is the 'cons' operator, which constructs a list
  // the result of cons is to prepend an element onto a list
  // element :: list puts 'element' onto the front of 'list'
  val fruits = "apples" :: ("oranges" :: ("pears" :: Nil))
  val fruitList1 = List ("Mangoes", "Pine-apples")
  val fruitList2 = List("another fruit", "I do not know any more")
  
  val fruitList3 = ("more fruits ") :+ fruitList1
  //println(fruitList1.isEmpty)
  
  //println(fruits.head)
  //println(fruits.tail)
  
  val fruitList4 = fruits ::: fruitList1 ::: fruitList2
  println(fruitList4)
  
  
  
  fruitList4 match {
    case (h :: t) => {
      h + " is the head"
    }
  }
  //println(fruitList3)
  //println(fruits ::: fruitList1 ::: fruitList2)
}