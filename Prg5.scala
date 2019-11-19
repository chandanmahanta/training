import scala.io.Source

object Prg5 {
   def main(args: Array[String]) {
      println("Following is the content read:" )

      Source.fromFile("custs.txt" ).foreach { 
         print	 
      }
	println("\t")      	

   }
}

