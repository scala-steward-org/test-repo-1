//> using scala "2.13.16"
//> using dep "com.lihaoyi::os-lib:0.11.3"

//> using dep "com.lihaoyi::fansi:0.5.0"
//> using dep "org.typelevel::cats-core:2.12.0"
//> using dep "io.circe::circe-fs2:0.14.1"
//> using dep "org.typelevel::log4cats-slf4j:1.7.0"
//> using toolkit typelevel:0.1.29

import org.typelevel.log4cats.Logger
import org.typelevel.log4cats.slf4j.Slf4jLogger

object Hello extends App {
  println("Hello World")
}
