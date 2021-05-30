object SimpleFractals {def main(args: Array[String]): Unit ={println(ConsoleDisplay.pixIntArrToString(FracScale.getDisplayFracPointArray(90, 20).map(_.map(Mandelbrot.calcPix(_)))))}}
