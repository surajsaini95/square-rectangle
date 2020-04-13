package com.knoldus


object Solution1 extends App {

  val length = 11
  val breadth = 3
  val rectangle: FourSidedShape = new Rectangle(length, breadth)
  val areaOfRectangle = rectangle.getShapeArea

  val side = 5
  val square: FourSidedShape = new Square(side)

  val areaOfSquare = square.getShapeArea
}
