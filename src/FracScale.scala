object FracScale {
  var rl: Double = -2.1
  var rr: Double = .75
  var it: Double = 1.1
  var ib: Double = -1.1
  def getDisplayFracPointArray(x: Int, y: Int): Array[Array[FracPoint]] = {
    val arr: Array[Array[FracPoint]] = Array.ofDim[FracPoint](y, x)
    val xsf: Double = (rr - rl)/x
    val ysf: Double = (it - ib)/y
    for( i <- 0 to (x-1); j <- 0 to (y-1)){
      arr(j)(i) = new FracPoint(i * xsf + rl, it - j * ysf )
    }
    arr
  }
}
