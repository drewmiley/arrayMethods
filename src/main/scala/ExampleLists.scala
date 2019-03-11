object ExampleLists {
  def noOptions: List[IVO] = List(
    IVOGenerator.noOptions()
  )
  def optionProperties: List[IVO] = List(
    IVOGenerator.optionProperties()
  )
  def optionObject: List[Option[IVO]] = List(
    IVOGenerator.optionObject(),
    None
  )
  def optionObjectAndProperties: List[Option[IVO]] = List(
    IVOGenerator.optionObjectAndProperties(),
    None
  )
}
