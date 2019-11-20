

object MyImplicit {

def main(arg: Array[String]){
implicit class StringIncrement12(i:Int){
  def increment()
 {
  println("this is a implicit class")
 }
}

implicit class StringIncrement11(i:String){
  def increment()
 {
  println("this is a implicit class having String")
 }
}

 val result = 5.increment
 val result1 = "h".increment 
 //println(result)
}
}
