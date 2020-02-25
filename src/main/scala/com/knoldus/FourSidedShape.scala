package com.knoldus

trait FourSidedShape {

  var height: Double
  var width: Double

  def shapeArea: Double = height * width
}
