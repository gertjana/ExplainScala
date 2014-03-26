val a:Int = 1 //immutable
//a = 2
var b = 4 //mutable, use sparingly
val c = a + 4
val d = a.+(4)
val e = 1 + 2

//definitions, java vs scala syntax
def divide(a:Double, b:Double):Double = {
  if (b == 0) {
    return a;
  } else {
    return a / b;
  }
}
def add(a:Double, b:Double):Double        = a + b
def substract(a:Double, b:Double):Double  = a - b
def multiply(a:Double, b:Double):Double   = a * b
add(3,4)
substract(4,2)
multiply(5,7)
divide(5,4)
// operation as function
def operation(a:Double, b:Double, f:(Double,Double) => Double) = {
  f(a,b)
}
operation(2,3, add)
operation(2,3, substract)
operation(2,3, multiply)
operation(2,3, divide)

//all operator are methods
//call by name/value
def currentTime = System.currentTimeMillis()
def time(currentTime: => Long):Long = { //call by name
//def time(currentTime: Long):Long = { //call by value
  val one = currentTime
  Thread.sleep(56)
  val two = currentTime
  two - one
}
time(currentTime)

// ??? is Nothing (Bottom type)
def notYetImplemented = ???

val date = new java.util.Date()
d.##

