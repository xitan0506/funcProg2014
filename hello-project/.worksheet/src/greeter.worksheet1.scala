package greeter

object worksheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(12); 
  val x = 1;System.out.println("""x  : Int = """ + $show(x ));$skip(47); 
  def increase(x : Int) : Int = {
  	x + 1
  };System.out.println("""increase: (x: Int)Int""");$skip(14); val res$0 = 
  increase(x);System.out.println("""res0: Int = """ + $show(res$0));$skip(22); 
  val y = increase(x);System.out.println("""y  : Int = """ + $show(y ))}
  
}
