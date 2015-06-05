package actors

import akka.actor.{Actor, ActorSystem, Props, ActorRef, ActorContext}

// actors are hierarchical, they spawn subprocesses
// you can pass messages, respond to messages

// you can create groups of processes, one processes spawning off subprocesses
// actors can send messages between and within the hierarchy
// the head node of the hierarhy is a "supervisor"
// the parent node is always a supervisor

// the supervisor has control over its child processes and decides on what to do in certain scenarios
// you define a supervision strategy to handle events
class HelloActor (name: String) extends Actor {
  
  override def receive = {
    case "hello" => println("Hello from " + name)
    case "goodbye" => println("Goodbye from " + name)
    case _ => println("I don't understand!")
  }
}


object Main extends App {
  
/*  println("Test")
  val sys = ActorSystem("x")*/
  
  val system = ActorSystem("HelloSystem")
  val helloActor = system.actorOf(Props(new HelloActor("Fred")), name = "helloactor")
  // exclamation mark is known as "tell"
  // the message is on the right hand side, the recipient is on the left hand side
  // using a question mark in the same place is known as "ask"
  // use it if at some point you expect a response
  helloActor ! "hello"
  helloActor ! "goodbye"
  
  //system.stop(helloActor)
  
}