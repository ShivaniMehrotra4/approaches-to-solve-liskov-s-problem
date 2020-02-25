package com.edu

object Constants {
  val length = 4
  val breadth = 6
}

object AreaCalculator extends App {
  val rectangle: Rectangle = new Rectangle
  val square: Square = new Square
  val rectangleAsParent: Rectangle = new Square

  val areaOfRectangle = rectangle.calculateArea(Constants.length, Constants.breadth)
  val areaOfSquare = square.calculateArea(Constants.length, Constants.breadth)
  val testResult = rectangleAsParent.calculateArea(Constants.length, Constants.breadth)

}
