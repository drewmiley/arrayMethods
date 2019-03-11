import helper.{ExampleLists, IVO}

import scala.concurrent.ExecutionContext

object Apply extends App {
  implicit val ec = ExecutionContext.global
  // applyOrElse()

  val exampleListNoOption: List[IVO] = ExampleLists.noOptions
  val applyNoOption: IVO = exampleListNoOption.apply(1)

  val exampleListOptionProperties: List[IVO] = ExampleLists.optionProperties
  val applyOptionProperties: IVO = exampleListOptionProperties.apply(1)

  val exampleListOptionObject: List[Option[IVO]] = ExampleLists.optionObject
  val applyOptionObject: Option[IVO] = exampleListOptionObject.apply(1)

  val exampleListOptionObjectAndProperties: List[Option[IVO]] = ExampleLists.optionObjectAndProperties
  val applyOptionObjectAndProperties: Option[IVO] = exampleListOptionObjectAndProperties.apply(1)

  val noneList: Option[List[IVO]] = None
  val orElse: Option[List[Object]] = noneList.orElse(Some(List(IVO())))

  println("Apply")
}
