//                  Traversable
//                      |
//                   Iterable
//                /     |     \
//              Map    Seq    Set

//List (Seq)
val list = List(1,2,3,4,5,6)
val list2 = 5 ::list
//lists are combined from a head and a tail
list2.head
list2.tail
list2 ::: list
list2.distinct
list.reverse
//shuffle list
import scala.util.Random
Random.shuffle(list)
//map list
list.map(item => item * 2)
//filter list
list.filter(_ %2 == 0)
//fold list (aggregate)
list.foldLeft(0)((result, item) => result + item)
//other notation
(0 /: list)(_*_)
 //ranges
val range = (1 to 6).toList
(1 to 100 by 3).foldRight(0)(_+_)
//Map
val map = Map(1 -> "one", 2 -> "two", 3 -> "three")
map(2)
map.toList
val keys = map.map(_._1)
val values = map.map(_._2)
 //Set
val set = Set("Hello", "World")
val set2 = set + "Goodbye"
val set4 = Set(1, 1, 1)
//tuples
val tuple = (1, "Foo", true, "Bar")
//Looping
val bagOfHolding = List(2, "Baz", false, "Bar")
//foreach
bagOfHolding.foreach(println(_))


