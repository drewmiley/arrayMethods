import helper.{ExampleLists, IVO}

import scala.concurrent.ExecutionContext

object Map extends App {
  implicit val ec = ExecutionContext.global

  // mapConserve()

  val exampleListNoOption: List[IVO] = ExampleLists.noOptions
  val forEachNoOption: Unit = exampleListNoOption.foreach(ivo => println(ivo.text))
  val mapNoOption: List[String] = exampleListNoOption map { ivo => ivo.text }
  val reverseMapNoOption: List[String] = exampleListNoOption reverseMap { ivo => ivo.text }

  val exampleListOptionProperties: List[IVO] = ExampleLists.optionProperties
  val forEachOptionProperties: Unit = exampleListOptionProperties
    .foreach(ivo => println(ivo.textOption.getOrElse("")))
  val mapOptionProperties: List[Option[String]] = exampleListOptionProperties map { ivo => ivo.textOption }
  val reverseMapOptionProperties: List[Option[String]] = exampleListOptionProperties reverseMap { ivo => ivo.textOption }

  val exampleListOptionObject: List[Option[IVO]] = ExampleLists.optionObject
  val forEachOptionObject: Unit = exampleListOptionObject
    .foreach(ivo => println(ivo.getOrElse(IVO()).text))
  val mapOptionObject: List[String] = exampleListOptionObject map
    { ivo => ivo.getOrElse(IVO()).text }
  val reverseMapOptionObject: List[String] = exampleListOptionObject reverseMap
    { ivo => ivo.getOrElse(IVO()).text }

  val exampleListOptionObjectAndProperties: List[Option[IVO]] = ExampleLists.optionObjectAndProperties
  val forEachOptionObjectAndProperties: Unit = exampleListOptionObjectAndProperties
    .foreach(ivo => println(ivo.getOrElse(IVO()).textOption.getOrElse("")))
  val mapOptionObjectAndProperties: List[Option[String]] = exampleListOptionObjectAndProperties map
    { ivo => ivo.getOrElse(IVO()).textOption }
  val reverseMapOptionObjectAndProperties: List[Option[String]] = exampleListOptionObjectAndProperties reverseMap
    { ivo => ivo.getOrElse(IVO()).textOption }

  println("Map")
}
