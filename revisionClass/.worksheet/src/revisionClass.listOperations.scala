package revisionClass

object listOperations extends App {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(102); 

	println("Welcome to the Scala worksheet");$skip(238); 
  
  // :: is the 'cons' operatpr, which constructs a list
  // the resut of cons is to prepend an element onto a list
  // element :: list puts 'element' onto the front of 'list'
	val fruits = "apples" :: ("oranges" :: ("pears" :: Nil));System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(17); 
	println(fruits)}
}
