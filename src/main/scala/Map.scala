import helper.{ExampleLists, IVO}

import scala.concurrent.ExecutionContext

object Map extends App {
  implicit val ec = ExecutionContext.global

  val exampleListNoOption: List[IVO] = ExampleLists.noOptions

  val exampleListOptionProperties: List[IVO] = ExampleLists.optionProperties

  val exampleListOptionObject: List[Option[IVO]] = ExampleLists.optionObject

  val exampleListOptionObjectAndProperties: List[Option[IVO]] = ExampleLists.optionObjectAndProperties

  println("Map")

  //  val dsfdsfg = exampleList.foreach()
  //  val dsfds = exampleList.map()
  //  val dfsdf = exampleList.mapConserve()
  //  val edfgd = exampleList.reverseMap()
}
