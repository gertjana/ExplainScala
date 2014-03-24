//implicit conversions
implicit def strToInt(x: String) = x.toInt

val x = "123"
val y:Int = "123"




//a generic add class
def add_doesnotcompile[T](a:T, b:T):T = {
  a + b
}

def add[T](a:T, b:T)(implicit num:Numeric[T]) = {
  num.plus(a,b)
}
add[Int](1,2)
add[Float](0.3f, 0.5f)
//add[String]("Hello", "World")


//spray uses implicits to convert between objects and for instance json