package com.dt.scala.hello

import scala.io.Source

object FileOps {
  def main(args: Array[String]): Unit = {
    var file = Source.fromFile("F:\\opt\\logs\\Debug.log")
    for(line <- file.getLines()){
      println(line);
    }
  }
}