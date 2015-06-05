package processFile

import akka.actor. { Actor , ActorRef, Props }

case class StartProcessingFile()

class FileWordCounterActor (fileName: String) extends Actor {
  
  private var running = false
  
  private var totalLines = 0;
  private var linesProcessed= 0;
  private var result = 0;
  
  private var fileSender: Option[ActorRef] = None
  
  def receive = {
    // when it receives the start message it starts
    case StartProcessingFile() => {
      if (running) {
        println("Already running")
      } else
        running = true
        fileSender = Some(sender) // save reference to parent process
        import scala.io.Source._
        fromFile(fileName).getLines().foreach {
          line => context.actorOf(Props(new WordCountActor())) ! ProcessStringMsg(line)
          totalLines += 1
      }
    }
    
    // if the actor sends back the number of words, we can add that to the number of words
    case StringProcessedMsg(words) => {
      result += words
      linesProcessed += 1
      if (linesProcessed == totalLines) { // finished
         fileSender.map( _ ! result) // send result to invoking process
      } 
    }
    // in the case of anything else an error message is printed
    case _ => println("Message not recognized")
    
  }
  
}