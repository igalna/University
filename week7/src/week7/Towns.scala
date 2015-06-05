package week7

object Towns extends App {

  // maps some towns to their counties
    val townsAndCounties = Map(
      "Essex" -> "Chelmsford",
      "Yorkshire" -> "Leeds",
      "Lancashire" -> "Manchester",
      "Devon" -> "Exeter"
    )
    println("Towns in counties:")
    // uses the get method to retrieve the town for some counties
    // gets the value based on passing the key.
    // you get "something" because there is something in the box
    // because the map data structure in scala is wrapped to avoid nullPointerExceptions
    println("Essex" + townsAndCounties.get("Essex"))
    println("Yorkshire" + townsAndCounties.get("Yorkshire"))
    // when you try to get a value for a key not in the map, you get "none"
    // because you have "nothing" in the box
    println("Kent" + townsAndCounties.get("Kent"))
    // uses getOrElse to wrap a return value with a default return "oops"
    // same as the optional type in Java
    println("Kent" + townsAndCounties.get("Kent").getOrElse(" oops"))
}