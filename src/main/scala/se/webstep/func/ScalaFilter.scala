object ScalaFilter extends App {

  val names = List("Arthur Dent", "Ford Prefect", "Zaphod Beeblebrox", "Marvin", "Trillian", "Slartibartfast")
  val longNames = names.filter(_.length > 12)
  println(longNames.mkString(", "))
  // Zaphod Beeblebrox, Slartibartfast

  val divisibleBy13 = (1 to 100).filter(_ % 13 == 0)
  println(divisibleBy13.mkString(", "))
  // 13, 26, 39, 52, 65, 78, 91
}