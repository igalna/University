/*package actors

import scala.actors.Actor

case class Greeting (who: String)

class GreetingActor extends Actor {
  
  def receive = {
    case Greeting(who) =>
      sender ! (s"Hello, $who! Thanks. ")
  }
}*/