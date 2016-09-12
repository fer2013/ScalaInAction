package com.dt.scala.hello

object ArrayOperations {
  def main(args: Array[String]): Unit = {
    var array = Array(1, 2, 3, 4);
    for (i <- 0 until array.length) {
      println(array(i));
    }
    println("----------------------");
    for(ele <- array){
      println(ele);
    }
  }
}