import helper.{ExampleLists, IVO}

import scala.concurrent.ExecutionContext

object SimpleMisc extends App {
  implicit val ec = ExecutionContext.global

  val exampleListNoOption: List[IVO] = ExampleLists.noOptions

  val exampleListOptionProperties: List[IVO] = ExampleLists.optionProperties

  val exampleListOptionObject: List[Option[IVO]] = ExampleLists.optionObject

  val exampleListOptionObjectAndProperties: List[Option[IVO]] = ExampleLists.optionObjectAndProperties

  //  val sdfds = exampleList.init
  //  val sdfdsf = exampleList.head
  //  val dfgsdf = exampleList.isEmpty
  //  val sdfds = exampleList.tail

  println("SimpleMisc")
}
