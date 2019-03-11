import scala.concurrent.ExecutionContext

object FlatMap extends App {
  implicit val ec = ExecutionContext.global

  println("FlatMap")

  //  val exampleList: List[IVO] = ExampleLists.noOptions
  //  val exampleList: List[IVO] = ExampleLists.optionProperties
  //  val exampleList: List[Option[IVO]] = ExampleLists.optionObject
  //  val exampleList: List[Option[IVO]] = ExampleLists.optionObjectAndProperties

  //  val dfsd = exampleList.flatMap()
  //  val dfsd = exampleList.flatten
}
