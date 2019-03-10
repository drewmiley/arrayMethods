import scala.concurrent.ExecutionContext

object Main extends App {
  implicit val ec = ExecutionContext.global

  println("Hello")
}