import org.apache.spark._

object WordCount {

   def main(args: Array[String]) {
	   val conf = new SparkConf().setMaster("local[2]").setAppName("WordCount")
 
 //set the spark port number
 //conf.set("spark.ui.port","4042")
 
 //create spark context object
			   val sc = new SparkContext(conf)
 
//Check for sufficient arguments 
 if (args.length < 2) {
 println("Usage: spark-submit --class WordCount --master local <jar name>  <input> <output>")
 System.exit(1)
 }
 
 //Read file and create RDD
	   val rawData = sc.textFile(args(0),1)
 
 //val rawData = sc.textFile(args(0),2) // this will create 2 partitions
 
 //convert the lines into words using flatMap operation
			   val words = rawData.flatMap(line => line.split(" "))
 
 //count the individual words using map and reduceByKey operation
			   val wordCount = words.map(word => (word, 1)).reduceByKey(_ + _)
 
 //Save the result
 wordCount.saveAsTextFile(args(1))
			   //wordCount.foreach(println)
 //stop the spark context
			   sc.stop

     
   }  
   
}