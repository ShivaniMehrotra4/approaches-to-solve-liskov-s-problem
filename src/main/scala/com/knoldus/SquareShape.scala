package com.knoldus

/**
 * class SquareShape extends abstract class Quadrilateral
 */
class SquareShape extends Quadrilateral {
  /**
   * function calculateArea calculates area of the square
   *
   * @param width  - first dimension
   * @param height - second dimension
   * @return - product of both dimensions if same otherwise throws exception
   */
  override def calculateArea(width: Double, height: Double): Double = if (width == height) width * height else throw new Exception("Dimensions should be same.")
}
