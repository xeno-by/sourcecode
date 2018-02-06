addSbtPlugin("com.eed3si9n" % "sbt-doge" % "0.1.5")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.18")
addSbtPlugin("com.typesafe.sbt" % "sbt-osgi" % "0.8.0")
addSbtPlugin("org.scala-native" % "sbt-crossproject" % "0.2.0")
addSbtPlugin("org.scala-native" % "sbt-scalajs-crossproject" % "0.2.0")
resolvers += "Sonatype staging" at "https://oss.sonatype.org/content/repositories/staging"
addSbtPlugin("com.github.xenoby" %% "sbt-scala-native" % "0.3.6-20-g0afae98f36" exclude("org.scala-native", "sbt-crossproject"))
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")
