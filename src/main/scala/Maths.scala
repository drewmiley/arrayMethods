import helper.{ExampleLists, IVO}

import scala.concurrent.ExecutionContext

object Maths extends App {
  implicit val ec = ExecutionContext.global

  val numberList: List[Int] = List(34, 45354, 0, -15, 565)
  val max: Int = numberList.max
  val min: Int = numberList.min
  val sum: Int = numberList.sum

  val exampleListNoOption: List[IVO] = ExampleLists.noOptions
  val maxNoOption: IVO = exampleListNoOption maxBy (ivo => ivo.number)
  val minNoOption: IVO = exampleListNoOption minBy (ivo => ivo.number)

  val exampleListOptionProperties: List[IVO] = ExampleLists.optionProperties
  val maxOptionProperties: IVO = exampleListOptionProperties maxBy
    (ivo => ivo.numberOption.getOrElse(0.toDouble))
  val minOptionProperties: IVO = exampleListOptionProperties minBy
    (ivo => ivo.numberOption.getOrElse(0.toDouble))

  val exampleListOptionObject: List[Option[IVO]] = ExampleLists.optionObject
  val maxOptionObject: Option[IVO] = exampleListOptionObject maxBy
    (ivo => ivo.getOrElse(IVO()).number)
  val minOptionObject: Option[IVO] = exampleListOptionObject minBy
    (ivo => ivo.getOrElse(IVO()).number)

  val exampleListOptionObjectAndProperties: List[Option[IVO]] = ExampleLists.optionObjectAndProperties
  val maxOptionObjectAndProperties: Option[IVO] = exampleListOptionObjectAndProperties maxBy
    (ivo => ivo.getOrElse(IVO()).numberOption.getOrElse(0.toDouble))
  val minOptionObjectAndProperties: Option[IVO] = exampleListOptionObjectAndProperties minBy
    (ivo => ivo.getOrElse(IVO()).numberOption.getOrElse(0.toDouble))

  println("Maths")
}
