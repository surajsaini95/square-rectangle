package com.knoldus

trait FourSidedShape {

  var height: Double
  var width: Double

  def getShapeArea: Double = height * width
}
