trait Swimming {

def swim()
{
println ("Swimming-trait")
}
}

trait Walking {

def walk()
{println("Walking-trait")}
}

abstract class Bird {

//def flyMsg :String

def fly(){
println("bird class")
}
}

class Pigeon extends Bird with Swimming with Walking {

val flyMsg = "I am flying"
//override def swim() = println("Swimming")
override def walk() = println("Walking")
//override def fly() { println(flyMsg) }

}

object MyTrait {
def main(arg: Array[String]){

val v1 = new Pigeon;
v1.swim()
v1.walk()
v1.fly()

}
}

