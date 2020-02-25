package com.knoldus

object Constants {
  val width = 4
  val height = 6
}
object AreaCalculate extends App {
  val square = new SquareShape
  val rectangle = new RectangleShape

  val rectangleArea: Double = rectangle.calculateArea(Constants.width,Constants.height)
  println(rectangleArea)

  try {
    val squareArea = square.calculateArea(Constants.width,Constants.height)
    println(squareArea)
  } catch {
    case ex: Exception => println(ex.getMessage)
  }
}
