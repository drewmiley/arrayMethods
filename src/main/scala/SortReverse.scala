import helper.{ExampleLists, IVO}

import scala.concurrent.ExecutionContext

object SortReverse extends App {
  implicit val ec = ExecutionContext.global

  // reverse_:::()

  val strings: List[String] = List("fgd", "", "aaaaaaa", "dfgdfgdgdfgd", "hgjhgh")
  val sorted: List[String] = strings.sorted

  val exampleListNoOption: List[IVO] = ExampleLists.noOptions
  val reverseNoOption: List[IVO] = exampleListNoOption.reverse
  val sortByNoOption = exampleListNoOption sortBy (ivo => ivo.number)
  val sortWithNoOption = exampleListNoOption sortWith ((a, b) => a.number - b.number > 0)

  val exampleListOptionProperties: List[IVO] = ExampleLists.optionProperties
  val reverseOptionProperties: List[IVO] = exampleListOptionProperties.reverse
  val sortByOptionProperties: List[IVO] = exampleListOptionProperties sortBy
    (ivo => ivo.numberOption.getOrElse(0.toDouble))
  val sortWithOptionProperties: List[IVO] = exampleListOptionProperties sortWith
    ((a, b) => a.numberOption.getOrElse(0.toDouble) - b.numberOption.getOrElse(0.toDouble) > 0)

  val exampleListOptionObject: List[Option[IVO]] = ExampleLists.optionObject
  val reverseOptionObject: List[Option[IVO]] = exampleListOptionObject.reverse
  val sortByOptionObject: List[Option[IVO]] = exampleListOptionObject sortBy
    (ivo => ivo.getOrElse(IVO()).number)
  val sortWithOptionObject: List[Option[IVO]] = exampleListOptionObject sortWith
    ((a, b) => a.getOrElse(IVO()).number - b.getOrElse(IVO()).number > 0)

  val exampleListOptionObjectAndProperties: List[Option[IVO]] = ExampleLists.optionObjectAndProperties
  val reverseOptionObjectAndProperties: List[Option[IVO]] = exampleListOptionObjectAndProperties.reverse
  val sortByOptionObjectAndProperties: List[Option[IVO]] = exampleListOptionObjectAndProperties sortBy
    (ivo => ivo.getOrElse(IVO()).numberOption.getOrElse(0.toDouble))
  val sortWithOptionObjectAndProperties: List[Option[IVO]] = exampleListOptionObjectAndProperties sortWith
    ((a, b) => a.getOrElse(IVO()).numberOption.getOrElse(0.toDouble) -
      b.getOrElse(IVO()).numberOption.getOrElse(0.toDouble) > 0)

  println("SortReverse")
}
