object ExampleLists {
  def noOptions: List[IVO] = List(
    IVO()
  )
  def optionProperties: List[IVO] = List(
    IVO()
  )
  def optionObject: List[Option[IVO]] = List(
    Some(IVO()),
    None
  )
  def optionObjectAndProperties: List[Option[IVO]] = List(
    Some(IVO()),
    None
  )
}
