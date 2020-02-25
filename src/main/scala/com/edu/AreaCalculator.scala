package com.edu

object AreaCalculator extends App {
  val rectangle : Rectangle = new Rectangle
  val square : Square = new Square
  val rectangleAsParent : Rectangle = new Square


  val areaOfRectangle = rectangle.calculateArea(4,6)
  val areaOfSquare = square.calculateArea(5,7)
  val testResult = rectangleAsParent.calculateArea(3,3)

  println(areaOfRectangle)
  println(areaOfSquare)
  println(testResult)


}
