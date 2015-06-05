package comp

// case class
case class Person(firstName: String, lastName: String)

object Stormtrooper {
  
  def inspect(p: Person): String = 
    // match is like a case/switch statement
    p match {
      case Person("Luke", "Skywalker") => "Stop you rebel scum"
      case Person("Han", "Solo") => "Stop Solo"
      case Person(first, last) => s"Move Along, $first"
    
    }
  
}