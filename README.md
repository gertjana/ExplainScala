ExplainScala
============

Bunch of worksheets explaining some basic scala concepts

Used in a Scala workshop presentated at SDL


Intellij:
* install sbt
* install scala plugin in intellij
* add sbt-plugin to projects/plugins.sbt (or global one ~/.sbt/[version]/plugins)
    `addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")`
* clone project
* from commandline run "sbt gen-idea"
* Open the project in Intellij

Eclipse:
* install sbt
* in scala plugin in eclipse
* add sbt-plugin to projects/plugins.sbt (or global one ~/.sbt/[version]/plugins)
    `addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.4.0")`
* clone project
* from commandline run "sbt eclipse"
* Import project into eclipse


