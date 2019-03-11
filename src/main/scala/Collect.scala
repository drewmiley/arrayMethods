import scala.concurrent.ExecutionContext

object Collect extends App {
  implicit val ec = ExecutionContext.global

  println("Collect")

  //  val exampleList: List[IVO] = ExampleLists.noOptions
  //  val exampleList: List[IVO] = ExampleLists.optionProperties
  //  val exampleList: List[Option[IVO]] = ExampleLists.optionObject
  //  val exampleList: List[Option[IVO]] = ExampleLists.optionObjectAndProperties

  //  val blajh = exampleList.collect()
  //  val dsfdsf = exampleList.collectFirst()
}
