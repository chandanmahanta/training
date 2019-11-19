import java.io._


class Employee(val empid_p: String, val empname_p: String, val add_p:String, val city_p:String, val zip_p:Long) {

   def this() {
    this("2001","ABC","xyz","Mumbai",400001)
    println("This is a secondary constructor");
   }	
   println("You are creating a new employee in your database");	
	
   var empid: String = empid_p
   var empname: String = empname_p
   var address: String = add_p
   var city: String = city_p
   var zipcode: Long = zip_p
   

   def display() {
      println ("Employee details as under:")
      println ("Emp id : " + empid);
      println ("Emp Name : " + empname);
      println ("Emp address is : " + address);
      println ("City : " + city);
      println ("Zip Code : " + zipcode);
      //println ("Age : " + age);
      
   }

   def write_emp(){
      val writer = new FileWriter("/home/training/itc2.txt",true)
      writer.write(empid + ',' + empname+','+address+','+city+','+zipcode+"\n")
      println("Record created in the file")
      writer.close()
    }

   def emp_match(){

	empid match {
		case "2001" => println("Employee id is matched")
		case _ => println("Employee id not matched")	
	}
   }	

}

object EmpDetail {
   def main(args: Array[String]) {
      print("Please enter your input as Emp ID : " )
      val empid = scala.io.StdIn.readLine()
      
      print("Please enter your input as Emp Name : " )
      val empname = scala.io.StdIn.readLine()

      print("Please enter your input as Address : " )
      val empadd = scala.io.StdIn.readLine()

      print("Please enter your input as City : " )
      val empcity = scala.io.StdIn.readLine()

      print("Please enter your input as Zipcode : " )
      val empzip = scala.io.StdIn.readLine()
       
      val emp1 = new Employee(empid.toString, empname.toString, empadd.toString, empcity.toString, empzip.toLong);


      // Display the entire employee detail
      emp1.display();
      emp1.write_emp();
      //emp1.emp_match();
      //val emp2 = new Employee();
      //emp2.display(); 	
      //emp2.write_emp();
	//emp2.emp_match();
   }
}


