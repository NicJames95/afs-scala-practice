val radius:Any = 10
val typeOfRadius = radius match{
  case radius:Int => "Integer"
  case radius:String => "String"
  case radius:Double => "Double"
  case _ => "Any"
}