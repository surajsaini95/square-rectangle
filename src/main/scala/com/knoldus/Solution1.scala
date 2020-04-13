package com.knoldus


object Solution1 extends App {

  val length = 11
  val breadth = 3
  val rectangle1: FourSidedShape = new Rectangle(length, breadth)
  val areaOfRectangle1 = rectangle1.getShapeArea

  val rectangle2: FourSidedShape = new Rectangle(length, breadth)
  val areaOfRectangle2 = rectangle2.getShapeArea

  val side = 5
  val square1: FourSidedShape = new Square(side)

  val areaOfSquare1 = square1.getShapeArea
  
    val square2: FourSidedShape = new Square(side)

  val areaOfSquare2 = square2.getShapeArea
}
