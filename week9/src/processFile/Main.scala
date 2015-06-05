package processFile





object Main extends App {

  import akka.actor.ActorSystem
  import akka.actor.Props
  import akka.pattern.ask
  import akka.util.Timeout
  import scala.concurrent.ExecutionContext.Implicits.global
  
  import scala.concurrent.duration._
  
  val system = ActorSystem("system")
  val actor = system.actorOf(Props(new FileWordCounterActor("test")))
  
  implicit val timeout = Timeout(30 seconds)
  
  val future = actor ? StartProcessingFile()
  future.map { result => 
    println("Total number of words " + result)
    // shuts down the actor system
    system.shutdown()
  
  }
  
}