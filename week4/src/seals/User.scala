package seals

import java.util.Date

// sealed traits are sort of like final
// traits must appear in the same file
sealed trait Visitor{
  // using def allows you to declare things as either fields of methods
  
  def id: String // unique id assigned to each user
  def createdAt: Date // Date this user first visited the site
  
  // how long has the visitor been around
  def age: Long = new Date().getTime - createdAt.getTime
  
  
  
}

final case class Anonymous(id: String, createdAt: Date = new Date()) extends Visitor


final case class User(
    id: String,
    email: String,
    createdAt: Date = new Date()) extends Visitor


    
object Test {
  def main(args: Array[String]): Unit = {
    println(older(Anonymous("1"), User("2", "Fred@goo")))
  }
  
  def missingCase(v: Visitor) = 
    v match {
      case User(_,_,_) =>"Got a user"
  }
  
  def older(v1: Visitor, v2: Visitor): Boolean =
    v1.createdAt.before(v2.createdAt)
}