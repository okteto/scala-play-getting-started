name := "playdemo"
 
version := "1.0" 
      
lazy val `playdemo` = (project in file(".")).enablePlugins(PlayScala)

      
resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"
resolvers += "Artima Maven Repository" at "https://repo.artima.com/releases"

scalaVersion := "2.13.5"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.15"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"

fork in Test := false