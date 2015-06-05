package worksheet

import scala.collection.immutable.Vector

object week3Scala {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
	Forecast.forecast(100)                    //> res0: String = Sunny
	Forecast.forecast(80)                     //> res1: String = Mostly Sunny
	Forecast.forecast(0)                      //> res2: String = Cloudy
	Forecast.forecast(43)                     //> res3: String = Unknown
	Forecast.forecast(20)                     //> res4: String = Mostly Sunny
	
	val sunnyData = Vector(100, 80, 50, 20, 0, 15)
                                                  //> sunnyData  : scala.collection.immutable.Vector[Int] = Vector(100, 80, 50, 20
                                                  //| , 0, 15)
 	for (i <- sunnyData) yield println(Forecast.forecast(i))
                                                  //> Sunny
                                                  //| Mostly Sunny
                                                  //| Partly Sunny
                                                  //| Mostly Sunny
                                                  //| Cloudy
                                                  //| Unknown
                                                  //| res5: scala.collection.immutable.Vector[Unit] = Vector((), (), (), (), (), (
                                                  //| ))
	val family1 = new Family("Mum", "Dad", "Dick", "Sally")
                                                  //> family1  : worksheet.Family = Family(WrappedArray(Mum, Dad, Dick, Sally))

}