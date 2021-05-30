class FracPoint(r: Double = 0, i: Double = 0){
  def getReal: Double = r
  def getImaginary: Double = i
  def add(o: FracPoint): FracPoint = new FracPoint(r + o.getReal, i + o.getImaginary)
  def in: Boolean = r * r + i * i <= 8
  def turn: FracPoint = new FracPoint(r * r - i * i, 2 * r * i)
}