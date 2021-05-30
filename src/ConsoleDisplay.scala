object ConsoleDisplay {
  val iterations: Int = 10000
  val shades: Array[String] = Array("░", "▒", "▓", "█")
  //This method is hot garbage and I like it that way.
  def pixIntArrToString(arr: Array[Array[Int]]): String = {
    val avg: Int = arr.fold(0)(_.asInstanceOf[Int]+ _.asInstanceOf[Array[Int]].fold(0)(_+_)).asInstanceOf[Int]/(arr.length*arr(0).length)
    arr.map( (a: Array[Int]) => a.map((x: Int) => shades(if (x > 6*iterations/avg || x == iterations){if (x == iterations) 3 else 2} else{if (x > 3*iterations/avg) 1 else 0}))).fold("")( (acc, a2) => acc + a2.asInstanceOf[Array[String]].fold("\n")((acc2: String, s: String) => acc2 + s)).asInstanceOf[String]
  }
}
