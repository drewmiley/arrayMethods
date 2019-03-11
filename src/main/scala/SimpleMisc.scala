import helper.{ExampleLists, IVO}

import scala.concurrent.ExecutionContext

object SimpleMisc extends App {
  implicit val ec = ExecutionContext.global

  val exampleListNoOption: List[IVO] = ExampleLists.noOptions
  val initNoOption: List[IVO] = exampleListNoOption.init
  val headNoOption: IVO = exampleListNoOption.head
  val tailNoOption: List[IVO] = exampleListNoOption.tail
  val isEmptyNoOption: Boolean = exampleListNoOption.isEmpty

  val exampleListOptionProperties: List[IVO] = ExampleLists.optionProperties
  val initOptionProperties: List[IVO] = exampleListOptionProperties.init
  val headOptionProperties: IVO = exampleListOptionProperties.head
  val tailOptionProperties: List[IVO] = exampleListOptionProperties.tail
  val isEmptyOptionProperties: Boolean = exampleListOptionProperties.isEmpty

  val exampleListOptionObject: List[Option[IVO]] = ExampleLists.optionObject
  val initOptionObject: List[Option[IVO]] = exampleListOptionObject.init
  val headOptionObject: Option[IVO] = exampleListOptionObject.head
  val tailOptionObject: List[Option[IVO]] = exampleListOptionObject.tail
  val isEmptyOptionObject: Boolean = exampleListOptionObject.isEmpty

  val exampleListOptionObjectAndProperties: List[Option[IVO]] = ExampleLists.optionObjectAndProperties
  val initOptionObjectAndProperties: List[Option[IVO]] = exampleListOptionObjectAndProperties.init
  val headOptionObjectAndProperties: Option[IVO] = exampleListOptionObjectAndProperties.head
  val tailOptionObjectAndProperties: List[Option[IVO]] = exampleListOptionObjectAndProperties.tail
  val isEmptyOptionObjectAndProperties: Boolean = exampleListOptionObjectAndProperties.isEmpty

  println("SimpleMisc")
}
