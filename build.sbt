name := "sbt-ivy-publicationsbug"

version := "1.0"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq("org.apache.cassandra" % "cassandra-thrift" % "1.0.0" intransitive(),
                    "org.apache.thrift" % "libthrift" % "0.6.1" intransitive())
