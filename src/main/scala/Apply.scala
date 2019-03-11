import scala.concurrent.ExecutionContext

object Apply extends App {
  implicit val ec = ExecutionContext.global

  println("Apply")

  //  val exampleList: List[IVO] = ExampleLists.noOptions
  //  val exampleList: List[IVO] = ExampleLists.optionProperties
  //  val exampleList: List[Option[IVO]] = ExampleLists.optionObject
  //  val exampleList: List[Option[IVO]] = ExampleLists.optionObjectAndProperties

  //  val dsfdsf = exampleList.apply()
  //  val sdfdsf = exampleList.applyOrElse()
  //  val dfsdf = exampleList.orElse()
}
