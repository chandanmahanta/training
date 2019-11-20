object HigherOrderFunction {

 def sqr(x:Int) = {
   x*x
 }
 
def add1 (x:Int)(y:Int) = {
  x+y
}

def calculateTax(sal:Int) = {
  sal-(sal*30/100)
}

def getTime() = {
 println("in getTime() method")
 System.nanoTime
}


def hof(f: Long)  {
 println("in hof() method")
 println ("the time in nano is " + f)

}

def main(arg: Array[String]){
 hof(getTime())   
val salaries = List(20000,30000,40000)
val pay = salaries.map(calculateTax)
println(pay)
val k = sqr(3)
println(k)
val m = add1(1)(2)
println(m)
}
}

