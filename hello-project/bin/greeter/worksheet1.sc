package greeter

object worksheet1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val x = 1                                       //> x  : Int = 1
  def increase(x : Int) : Int = {
  	x + 1
  }                                               //> increase: (x: Int)Int
  increase(x)                                     //> res0: Int = 2
  val y = increase(x)                             //> y  : Int = 2
  
}