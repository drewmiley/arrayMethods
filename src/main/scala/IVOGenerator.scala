object IVOGenerator {
  def noOptions(
                 text: String = "",
                 number: Double = 0,
                 bool: Boolean = false
               ): IVO =
    IVO(text = text, number = number, bool = bool)

  def optionProperties(
                        textOption: Option[String] = None,
                        numberOption: Option[Double] = None,
                        boolOption: Option[Boolean] = None
                      ): IVO =
    IVO(textOption = textOption, numberOption = numberOption, boolOption = boolOption)

  def optionObject(
                    text: String = "",
                    number: Double = 0,
                    bool: Boolean = false
                  ): Option[IVO] =
    Some(IVO(text = text, number = number, bool = bool))

  def optionObjectAndProperties(
                                 textOption: Option[String] = None,
                                 numberOption: Option[Double] = None,
                                 boolOption: Option[Boolean] = None
                               ): Option[IVO] =
    Some(IVO(textOption = textOption, numberOption = numberOption, boolOption = boolOption))
}
