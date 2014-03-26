
// be careful when creating a DSL
// especially when using symbols
// see Dispatch library
import dispatch._
import java.io.File
import scala.concurrent.ExecutionContext.global


val req = :/("localhost", 8080) / "path"
val xml = <message/>
Http(req << xml.toString())
// <<? Map("foo", "bar"))

val xmlFile = new File("/tmp/test.xml")
Http(req <<< (xmlFile)) // <:< Map("Content-Type", "application/xml"))

// keep it readable
def mergeMap[A, B](maps: List[Map[A, B]])(f: (B, B) => B): Map[A, B] =
  (Map[A, B]() /: (for (map <- maps; kv <- map) yield kv)) { (a, kv) =>
    a + (if (a.contains(kv._1)) kv._1 -> f(a(kv._1), kv._2) else kv)
  }