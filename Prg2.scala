object Prg2 {
   def main(args: Array[String]) {
      println( "Sum Value : " + addInt(args(0).toInt,args(1).toInt) );
      println( "Product Value : " + prodInt(args(0).toInt,args(1).toInt) );

   }
   
   def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
   }

   def prodInt( a:Int, b:Int ) : Long = {
      var sum:Long = 0
      sum = a * b

      return sum
   }

}

