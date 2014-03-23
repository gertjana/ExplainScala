val bagOfHolding = List(2, "Baz", false, "Bar")

//for
for(item <- bagOfHolding) {
  println(item)
}



// for with guard and yield
val strings = for (item <- bagOfHolding  if item.isInstanceOf[String]) yield item
// bagOfHolding.filter(_.isInstanceOf[String])


// another use of for
val upper = for {
  name <- Option(System.getenv("HOME"))
  trimmed <- Some(name.trim)
  upper <- Some(trimmed.toUpperCase) if trimmed.length != 0
} yield upper
println(upper getOrElse "")

