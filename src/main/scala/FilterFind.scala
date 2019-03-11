import helper.{ExampleLists, IVO}

import scala.concurrent.ExecutionContext

object FilterFind extends App {
  implicit val ec = ExecutionContext.global

  val exampleListNoOption: List[IVO] = ExampleLists.noOptions
  val filterNoOption: List[IVO] = exampleListNoOption filter {ivo => ivo.number > 0}
  val filterNotNoOption: List[IVO] = exampleListNoOption filterNot {ivo => ivo.number > 0}
  val findNoOption: Option[IVO] = exampleListNoOption find {ivo => ivo.number > 0}
  val forallNoOption: Boolean = exampleListNoOption forall {ivo => ivo.number > 0}
  val existsNoOption: Boolean = exampleListNoOption exists {ivo => ivo.number > 0}
  val countNoOption: Int = exampleListNoOption count {ivo => ivo.number > 0}
  val containsNoOption: Boolean = exampleListNoOption contains {IVO()}

  val exampleListOptionProperties: List[IVO] = ExampleLists.optionProperties

  val exampleListOptionObject: List[Option[IVO]] = ExampleLists.optionObject

  val exampleListOptionObjectAndProperties: List[Option[IVO]] = ExampleLists.optionObjectAndProperties

  println("FilterFind")
}
