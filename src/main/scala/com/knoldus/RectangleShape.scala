package com.knoldus

/**
 * class RectangleShape extends abstract class Quadrilateral
 */
class RectangleShape extends Quadrilateral {
  /**
   * function calculateArea calculates area of the rectangle
   *
   * @param width  - first dimension
   * @param height - second dimension
   * @return - product of both dimensions
   */
  override def calculateArea(width: Double, height: Double): Double = width * height
}
