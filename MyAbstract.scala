abstract class Person{
def greet()
{
  println("Person");
} 
}


class Student extends Person{
/*
override def greet(){
println("Student")
 }
*/
 }

object MyAbstract {

def main(arg: Array[String]){
var s=new Student()
//var p = new Person 
s.greet()

}

}
