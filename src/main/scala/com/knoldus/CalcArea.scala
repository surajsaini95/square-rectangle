package com.knoldus

trait CalcArea {
  def calcArea(rectangle: Rectangle): Double = rectangle.width * rectangle.height

  def calcArea(square: Square): Double = square.width * square.height
}