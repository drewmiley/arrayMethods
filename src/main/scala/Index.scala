import helper.{ExampleLists, IVO}

import scala.concurrent.ExecutionContext

object Index extends App {
  implicit val ec = ExecutionContext.global

  val exampleListNoOption: List[IVO] = ExampleLists.noOptions
  val indexOfNoOption: Int = exampleListNoOption indexOf {ExampleLists.noOptions(2)}
  val lastIndexOfNoOption: Int = exampleListNoOption lastIndexOf {ExampleLists.noOptions(3)}
  val indexWhereNoOption: Int = exampleListNoOption indexWhere {ivo => ivo.number > 0}
  val lastIndexWhereNoOption: Int = exampleListNoOption lastIndexWhere {ivo => ivo.number > 0}

  val exampleListOptionProperties: List[IVO] = ExampleLists.optionProperties

  val exampleListOptionObject: List[Option[IVO]] = ExampleLists.optionObject

  val exampleListOptionObjectAndProperties: List[Option[IVO]] = ExampleLists.optionObjectAndProperties

  println("Index")
}
