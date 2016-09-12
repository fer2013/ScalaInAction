package com.dt.scala.hello

object MapOperations {

  def main(args: Array[String]): Unit = {
    var map = Map("key1" -> 1, "key2" -> 2);
    for ((k, v) <- map) {
      println("key:" + k + ",value:" + v);
    }
    println("------------");
    for ((k, _) <- map) {
      println("key:" + k);
    }
  }
}