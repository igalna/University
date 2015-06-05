package worksheet

import scala.collection.immutable.Vector

// family class takes variable argument length
case class Family(args: String*) {
  
  def familySize(): Int = {
    var counter: Int = 0
    for (i <- new Vector(args)) yield counter +=1
  }
}