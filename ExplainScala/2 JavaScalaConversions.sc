import scala.collection.JavaConversions._

// System.getenv() gets a java.util.Map
val env = System.getenv()
// keyset in Java/Scala
val envKeysJava = env.keySet()
val envKeysScala = env.map(_._1)
// filter map first converts to scala
val containsMyName=env.filter(_._2.contains("gertjan"))
val scalaMapEnv = env.toMap

// converting back to java,
// if first converted to scala returns original java class
val javaMapEnv:java.util.Map[String, String] = scalaMapEnv
env.equals(javaMapEnv)
