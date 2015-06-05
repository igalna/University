package processFile

case class ProcessStringMsg (str: String)
case class StringProcessedMsg (words : Integer)

import akka.actor.Actor


class WordCountActor extends Actor {
  
  override def preStart = {
    println("")
  }
  
  // takes a line and counts up the words
  override def receive = {
    case ProcessStringMsg(str) => {
      // counts the number of words in the line
      val wordsInLine = str.split(" ").length
      // sender is the ActorRef of the actor who sent the message
      sender ! StringProcessedMsg(wordsInLine)
    }
    case _ => println("Error: message not recognized")
  }
  
  override def postStop = {
    
  }
}