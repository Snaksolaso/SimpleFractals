object Mandelbrot {
  val iterations = 10000
  def calcPix(c: FracPoint): Int = {
    var iter: Int = 0
    var z = c
    while(z.in && iter < iterations){
      z = z.turn.add(c)
      iter = iter + 1
    }
    iter
  }
}
