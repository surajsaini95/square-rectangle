package com.knoldus


object Solution1 extends App {

  val length = 10
  val breadth = 2
  val rectangle: FourSidedShape = new Rectangle(length, breadth)
  val areaOfRectangle = rectangle.getShapeArea

  val side = 3
  val square: FourSidedShape = new Square(side)

  val areaOfSquare = square.getShapeArea
}
