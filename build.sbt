val tapirVersion  = "0.9.0"
val http4sVersion = "0.21.0-M2"

lazy val root = (project in file("."))
  .settings(
    name := "tapir-http4s-todo-mvc",
    version := "0.1",
    scalaVersion := "2.13.0",
    libraryDependencies ++=
      Seq(
        "com.softwaremill.tapir" %% "tapir-core"                     % tapirVersion,
        "com.softwaremill.tapir" %% "tapir-http4s-server"            % tapirVersion,
        "com.softwaremill.tapir" %% "tapir-json-circe"               % tapirVersion,
        "org.http4s"             %% "http4s-dsl"                     % http4sVersion,
        "org.http4s"             %% "http4s-server"                  % http4sVersion,
        "ch.qos.logback"         % "logback-classic"                 % "1.2.3",
        "org.webjars"            % "swagger-ui"                      % "3.23.2",
        "com.softwaremill.tapir" %% "tapir-openapi-docs"             % tapirVersion,
        "com.softwaremill.tapir" %% "tapir-openapi-circe-yaml"       % tapirVersion,
        "com.softwaremill.sttp"  %% "async-http-client-backend-cats" % "1.6.4" % Test,
        "com.softwaremill.tapir" %% "tapir-sttp-client"              % tapirVersion % Test,
        "org.scalatest"          %% "scalatest"                      % "3.0.8" % Test
      ),
  )
