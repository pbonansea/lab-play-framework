name := "lab-play-framework"

version := "1.0-SNAPSHOT"

ebeanEnabled := false

libraryDependencies ++= Seq(
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "4.2.1.Final",
  "mysql" % "mysql-connector-java" % "5.1.18",
  cache,
//  "play" % "spring_2.9.1" % "1.0-SNAPSHOT",
  "org.springframework" % "spring-context" % "3.2.2.RELEASE",
  "javax.inject" % "javax.inject" % "1",
  "org.springframework.data" % "spring-data-jpa" % "1.3.2.RELEASE",
  "org.springframework" % "spring-expression" % "3.2.2.RELEASE",
  "org.mockito" % "mockito-core" % "1.9.5" % "test"	
)     

play.Project.playJavaSettings
