object HigherOrderFunction {

def getTime() = {
 println("in getTime() method")
 System.nanoTime
}


def hof(f: => Long)  {
 println("in hof() method")
 println ("the time in nano is " + f)

}

def main(arg: Array[String]){
  hof(getTime())   

}
}

