//a generic add class
def add1[T](a:T, b:T):T = {
  a + b
}



def add[T](a:T, b:T)(implicit num:Numeric[T]) = {
  num.plus(a,b)
}
add[Int](1,2)
add[Float](0.3f, 0.5f)
//add[String]("Hello", "World")


