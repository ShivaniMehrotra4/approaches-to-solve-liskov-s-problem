package com.edu

/**
 * Square class extends Rectangle class
 */
class Square extends Rectangle {
  /**
   * calculateArea function calculates area of shape (either square or rectangle)
   * If length and breadth are not equal, area calculator function of super class Rectangle would be called.
   *
   * @param length  - length dimension
   * @param breadth - breadth dimension
   * @return area of quadrilateral ( square/rectangle )
   */
  override def calculateArea(length: Double, breadth: Double): Double = if (length == breadth) length * breadth else super.calculateArea(length, breadth)
}
