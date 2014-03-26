val loadedXml = scala.xml.XML.loadFile("/tmp/test.xml")

val xml = <foo id="1"><bar>bar</bar><baz>{5+6}</baz></foo>

val id = xml \ "@id"
val allBars = xml \\ "bar"
val baz = xml \  "baz"
val children = xml \ "_"
baz.text


val namespacedXml = <root xmlns:a="/schema/a" xmlns:b="/schema/b">
                      <a:foo></a:foo>
                      <b:foo></b:foo>
                    </root>
namespacedXml \ "foo"
namespacedXml \ "foo" filter (_.namespace == "/schema/a")
namespacedXml \ "{/schema/a}foo"

