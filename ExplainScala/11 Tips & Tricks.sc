// creating a companion object for a trait that extends that trait
// allows user of your code to either
// - extends their class with your trait
// - call the methods through the object
trait ATrait { def myFunction = { "Hello World" }}
object ATrait extends ATrait {}
class AClass extends ATrait {}
val myClass = new AClass
myClass.myFunction
ATrait.myFunction


//create a Type alias that corresponds to any type that has a close() method
type Closable = {def close():Unit}

// B is a subtype of Closable
def using[A, B <: Closable] (closable: B) (f: B => A) = {
  try { f(closable) }
  catch { case _:Throwable => /* swallow */ }
  finally {
    try { closable.close() }
    catch { case _:Throwable => /* swallow */ }
  }
}


using(getClass.getResourceAsStream("test.properties")) {stream =>
  val properties = new java.util.Properties()
  properties.load(stream)
}


//overloads vs default/named parameters

def
