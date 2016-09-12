package com.dt.scala.hello

object ScalaAction {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var s = Array("a", "b");                        //> s  : Array[String] = Array(a, b)
  for (ele <- s) {
    println(ele);
    s
  }                                               //> a
                                                  //| b
}