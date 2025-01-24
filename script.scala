//> using scala "2.13.16"
//> using dep "com.lihaoyi::os-lib:0.11.3"

//> using dep "com.lihaoyi::fansi:0.5.0"
//> using dep "org.typelevel::cats-core:2.12.0"
//> using dep "io.circe::circe-fs2:0.14.1"
//> using dep "io.chrisdavenport::log4cats-slf4j:1.1.1"
//> using toolkit typelevel:0.1.29

import io.chrisdavenport.log4cats.Logger
import io.chrisdavenport.log4cats.slf4j.Slf4jLogger

object Hello extends App {
  println("Hello World")
}
