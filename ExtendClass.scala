class Father {

var lastname = ""
def myMethod() {
println ("this is a parent class")
}

}

class Child extends Father {

var firstname = "";

override def myMethod() {
println ("this is a child class");


}


def myMethod2(){
println("this is a child specific method");
}

}


object ExtendClass {
def main(arg: Array[String]){

var child1 = new Child();
child1.firstname = "John";
child1.lastname = "Smith";
println(child1.firstname + " " + child1.lastname);
child1.myMethod();
child1.myMethod2();
}
}

