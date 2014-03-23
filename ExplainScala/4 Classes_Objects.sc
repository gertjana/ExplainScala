
// class
class Person(firstName:String, lastName:String) {
  private var occupation:String = "Unemployed";

  def worksAsA(work:String):Person = {
    occupation = work
    this
  }
  override def toString = s"${firstName} ${lastName} (${occupation}})"
}
// objects are singletons (similar to java's static)
// When there is a class with the same name it's called it's companion object
object Person {
  def apply(firstName:String, lastName:String):Person = {
    new Person(firstName, lastName)
  }
}
// instantiates class by constructor
val me = new Person(firstName="Gertjan", lastName="Assies")
me.worksAsA("Scala Developer")
me

// Uses apply method in companion object
val meToo = Person("Gertjan", "Assies")

// Case classes
case class Book(title:String, author:String, published:Long)
val pis = Book("Programming in Scala", "Martin Odersky", 2010)
val sfti = Book("Scala for the Impatient", "Cay Horstmann", 2012)
val title = sfti.title
sfti match {
  case Book(_, _, 2012) => println("Book is from 2012")
  case Book(_, author, _) if author.contains("Odersky") => println("Book is from Odersky")
  case _ => println("Don't now this book")
}
 //default and named parameters
case class Circle(centerX:Int, centerY:Int, radius:Float=10.0f)

val aCircle = Circle(6,7)
val anotherCircle= Circle(centerY=5, radius=3.0f, centerX=6)





