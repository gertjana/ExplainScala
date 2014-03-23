case class Book(title:String, author:String, published:Long)
val pis = Book("Programming in Scala", "Martin Odersky", 2010)
val sfti = Book("Scala for the Impatient", "Cay Horstmann", 2012)
//pattern matching on case classes
sfti match {
  case Book(_, _, 2012) => println("Book is from 2012")
  case Book(_, author, _) if author.contains("Odersky") => println("Book is from Odersky")
  case _ => println("Don't now this book")
}

//matching on values/types
val list = List(1, "Foo", true, "Bar", Nil, Map())
for (item <- list) {
  item match {
    case 1 => println("Its a one!")
    case x:String => println(s"${x} is a string")
    case x:Boolean => {
      print("computer says: ")
      if (x) println("yes") else println("no")
    }
    case _:Seq[Any] => println("Some kind of Sequence")
    case Nil => println("Empty List")
    case _ => println("I don't know what this is")
  }
}

//Option
val property = Option(System.getenv("HOME"))
val nonExistingProperty = Option(System.getenv("Foo"))

property match {
  case Some(x) => println(x)
  case None => println("env var not found")
}

//Exception handling
try {
  4/0
} catch {
  case e :ArithmeticException => println(e.getMessage)
  case _ :Exception => {} //ignore
}

