package com.knoldus

object Constants {
  val width = 4
  val height = 6
}

object AreaCalculate extends App {
  val square = new SquareShape
  val rectangle = new RectangleShape

  val rectangleArea: Double = rectangle.calculateArea(Constants.width, Constants.height)

  try {
    val squareArea: Double = square.calculateArea(Constants.width, Constants.height)
  } catch {
    case ex: Exception => ex.getMessage
  }
}
