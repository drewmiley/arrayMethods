import scala.concurrent.ExecutionContext

object Apply extends App {
  implicit val ec = ExecutionContext.global

  println("Apply")

  //  val exampleList: List[helper.IVO] = ExampleLists.noOptions
  //  val exampleList: List[helper.IVO] = ExampleLists.optionProperties
  //  val exampleList: List[Option[helper.IVO]] = ExampleLists.optionObject
  //  val exampleList: List[Option[helper.IVO]] = ExampleLists.optionObjectAndProperties

  //  val dsfdsf = exampleList.apply()
  //  val sdfdsf = exampleList.applyOrElse()
  //  val dfsdf = exampleList.orElse()
}
