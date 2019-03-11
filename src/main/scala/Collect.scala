import scala.concurrent.ExecutionContext

object Collect extends App {
  implicit val ec = ExecutionContext.global

  println("Collect")

  //  val exampleList: List[helper.IVO] = ExampleLists.noOptions
  //  val exampleList: List[helper.IVO] = ExampleLists.optionProperties
  //  val exampleList: List[Option[helper.IVO]] = ExampleLists.optionObject
  //  val exampleList: List[Option[helper.IVO]] = ExampleLists.optionObjectAndProperties

  //  val blajh = exampleList.collect()
  //  val dsfdsf = exampleList.collectFirst()
}
