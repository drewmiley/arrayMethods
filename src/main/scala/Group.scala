import scala.concurrent.ExecutionContext

object Group extends App {
  implicit val ec = ExecutionContext.global

  println("Group")

  //  val exampleList: List[IVO] = ExampleLists.noOptions
  //  val exampleList: List[IVO] = ExampleLists.optionProperties
  //  val exampleList: List[Option[IVO]] = ExampleLists.optionObject
  //  val exampleList: List[Option[IVO]] = ExampleLists.optionObjectAndProperties

  //  val dfds = exampleList.groupBy()
  //  val dfds = exampleList.grouped()
}
