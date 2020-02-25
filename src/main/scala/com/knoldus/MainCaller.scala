package com.knoldus

object MainCaller extends App {
  val square = new SquareShape
  val rectangle = new RectangleShape

  val rectangleArea: Double = rectangle.calculateArea(4,6)
  println(rectangleArea)

  try {
    val squareArea = square.calculateArea(2, 4)
    println(squareArea)
  }catch {
    case ex : Exception => println(ex.getMessage)
  }
}
