package com.knoldus


object Solution1 extends App{

  val rectangle : FourSidedShape = new Rectangle(10,2)
  println(rectangle.shapeArea)

  val square : FourSidedShape =new Square(5)
  println(square.shapeArea)
}
