import helper.{ExampleLists, IVO}

import scala.concurrent.ExecutionContext

object Maths extends App {
  implicit val ec = ExecutionContext.global

  val numberList: List[Int] = List(34, 45354, 0, -15, 565)
  val max = numberList.max
  val min = numberList.min
  val sum = numberList.sum

  val exampleListNoOption: List[IVO] = ExampleLists.noOptions
  val maxNoOption = exampleListNoOption maxBy (ivo => ivo.number)
  val minNoOption = exampleListNoOption minBy (ivo => ivo.number)

  val exampleListOptionProperties: List[IVO] = ExampleLists.optionProperties
  val maxOptionProperties = exampleListOptionProperties maxBy
    (ivo => ivo.numberOption.getOrElse(0.toDouble))
  val minOptionProperties = exampleListOptionProperties minBy
    (ivo => ivo.numberOption.getOrElse(0.toDouble))

  val exampleListOptionObject: List[Option[IVO]] = ExampleLists.optionObject
  val maxOptionObject = exampleListOptionObject maxBy
    (ivo => ivo.getOrElse(IVO()).numberOption.getOrElse(0.toDouble))
  val minOptionObject = exampleListOptionObject minBy
    (ivo => ivo.getOrElse(IVO()).numberOption.getOrElse(0.toDouble))

  val exampleListOptionObjectAndProperties: List[Option[IVO]] = ExampleLists.optionObjectAndProperties
  val maxOptionObjectAndProperties = exampleListOptionObjectAndProperties maxBy
    (ivo => ivo.getOrElse(IVO()).numberOption.getOrElse(0.toDouble))
  val minOptionObjectAndProperties = exampleListOptionObjectAndProperties minBy
    (ivo => ivo.getOrElse(IVO()).numberOption.getOrElse(0.toDouble))

  println("Maths")
}
