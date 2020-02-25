package com.knoldus


object Solution2 extends App with CalcArea {

  val length = 10
  val breadth = 2
  val rectangle = new Rectangle(length, breadth)
  val areaOfRectangle = calcArea(rectangle)

  val side = 3
  val square = new Square(side)
  val areaOfSquare = calcArea(square)

}
