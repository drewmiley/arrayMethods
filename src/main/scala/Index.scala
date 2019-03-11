import helper.{ExampleLists, IVO}

import scala.concurrent.ExecutionContext

object Index extends App {
  implicit val ec = ExecutionContext.global

  val exampleListNoOption: List[IVO] = ExampleLists.noOptions

  val exampleListOptionProperties: List[IVO] = ExampleLists.optionProperties

  val exampleListOptionObject: List[Option[IVO]] = ExampleLists.optionObject

  val exampleListOptionObjectAndProperties: List[Option[IVO]] = ExampleLists.optionObjectAndProperties

  //  val edsdsf = exampleList.indexOf()
  //  val sdfdsf = exampleList.indexWhere()
  //  val sdfsd = exampleList.lastIndexOf()
  //  val dsfs = exampleList.lastIndexWhere()

  println("Index")
}
