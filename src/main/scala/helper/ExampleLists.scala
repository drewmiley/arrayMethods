package helper

object ExampleLists {
  def noOptions: List[IVO] = List(
    IVOGenerator.noOptions("aaaaaaa", 50, true),
    IVOGenerator.noOptions("bbbb", -10, true),
    IVOGenerator.noOptions("abcdef", 13.4, false),
    IVOGenerator.noOptions("Bobble", 12, false),
    IVOGenerator.noOptions("t-rex", 6, true)
  )
  def optionProperties: List[IVO] = List(
    IVOGenerator.optionProperties(),
    IVOGenerator.optionProperties(Some("aaaaaaaa"), Some(50), Some(true)),
    IVOGenerator.optionProperties(None, Some(50), Some(true)),
    IVOGenerator.optionProperties(Some("aaaaaaaa"), None, Some(true)),
    IVOGenerator.optionProperties(Some("aaaaaaaa"), Some(50), None),
    IVOGenerator.optionProperties(Some("bbbb"), Some(-10), Some(true)),
    IVOGenerator.optionProperties(None, Some(-10), Some(true)),
    IVOGenerator.optionProperties(Some("bbbb"), None, Some(true)),
    IVOGenerator.optionProperties(Some("bbbb"), Some(-10), None),
    IVOGenerator.optionProperties(Some("abcdef"), Some(13.4), Some(false)),
    IVOGenerator.optionProperties(Some("abcdef"), Some(13.4), None),
    IVOGenerator.optionProperties(Some("abcdef"), None, Some(false)),
    IVOGenerator.optionProperties(None, Some(13.4), Some(false)),
    IVOGenerator.optionProperties(Some("Bobble"), Some(12), Some(false)),
    IVOGenerator.optionProperties(Some("Bobble"), None, Some(false)),
    IVOGenerator.optionProperties(None, Some(12), Some(false)),
    IVOGenerator.optionProperties(Some("Bobble"), Some(12), None),
    IVOGenerator.optionProperties(Some("t-rex"), Some(6), Some(true)),
    IVOGenerator.optionProperties(Some("t-rex"), Some(6), None),
    IVOGenerator.optionProperties(None, Some(6), Some(true)),
    IVOGenerator.optionProperties(Some("t-rex"), None, Some(true))
  )
  def optionObject: List[Option[IVO]] = List(
    IVOGenerator.optionObject(),
    IVOGenerator.optionObject("aaaaaaa", 50, true),
    None,
    IVOGenerator.optionObject("bbbb", -10, true),
    None,
    None,
    IVOGenerator.optionObject("abcdef", 13.4, false),
    IVOGenerator.optionObject("Bobble", 12, false),
    IVOGenerator.optionObject("t-rex", 6, true),
    None,
    None
  )
  def optionObjectAndProperties: List[Option[IVO]] = List(
    IVOGenerator.optionObjectAndProperties(),
    IVOGenerator.optionObjectAndProperties(Some("aaaaaaaa"), Some(50), Some(true)),
    IVOGenerator.optionObjectAndProperties(None, Some(50), Some(true)),
    IVOGenerator.optionObjectAndProperties(Some("aaaaaaaa"), None, Some(true)),
    None,
    IVOGenerator.optionObjectAndProperties(Some("aaaaaaaa"), Some(50), None),
    IVOGenerator.optionObjectAndProperties(Some("bbbb"), Some(-10), Some(true)),
    IVOGenerator.optionObjectAndProperties(None, Some(-10), Some(true)),
    IVOGenerator.optionObjectAndProperties(Some("bbbb"), None, Some(true)),
    IVOGenerator.optionObjectAndProperties(Some("bbbb"), Some(-10), None),
    IVOGenerator.optionObjectAndProperties(Some("abcdef"), Some(13.4), Some(false)),
    None,
    None,
    IVOGenerator.optionObjectAndProperties(Some("abcdef"), Some(13.4), None),
    IVOGenerator.optionObjectAndProperties(Some("abcdef"), None, Some(false)),
    IVOGenerator.optionObjectAndProperties(None, Some(13.4), Some(false)),
    None,
    IVOGenerator.optionObjectAndProperties(Some("Bobble"), Some(12), Some(false)),
    IVOGenerator.optionObjectAndProperties(Some("Bobble"), None, Some(false)),
    None,
    IVOGenerator.optionObjectAndProperties(None, Some(12), Some(false)),
    IVOGenerator.optionObjectAndProperties(Some("Bobble"), Some(12), None),
    None,
    IVOGenerator.optionObjectAndProperties(Some("t-rex"), Some(6), Some(true)),
    IVOGenerator.optionObjectAndProperties(Some("t-rex"), Some(6), None),
    IVOGenerator.optionObjectAndProperties(None, Some(6), Some(true)),
    None,
    None,
    IVOGenerator.optionObjectAndProperties(Some("t-rex"), None, Some(true)),
    IVOGenerator.optionObjectAndProperties(),
    None
  )
}
