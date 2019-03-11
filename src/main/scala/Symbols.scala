import scala.concurrent.ExecutionContext

object Symbols extends App {
  implicit val ec = ExecutionContext.global

  println("Symbols")

  //  val exampleList: List[IVO] = ExampleLists.noOptions
  //  val exampleList: List[IVO] = ExampleLists.optionProperties
  //  val exampleList: List[Option[IVO]] = ExampleLists.optionObject
  //  val exampleList: List[Option[IVO]] = ExampleLists.optionObjectAndProperties

  //  val blah = exampleList.++()
  //  val blah = exampleList.+:()
  //  val blahj = exampleList.::()
  //  val blaj = exampleList.:::()
  //  val sdfsd = exampleList.++:()
  //  val sdfsd = exampleList./:()
  //  val dsds = exampleList.:+()
  //  val dsfs = exampleList.:\()
  //  val edfgd = exampleList.->()
}
