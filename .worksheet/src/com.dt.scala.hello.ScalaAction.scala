package com.dt.scala.hello

object ScalaAction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(93); 
  println("Welcome to the Scala worksheet");$skip(27); 
  var s = Array("a", "b");System.out.println("""s  : Array[String] = """ + $show(s ));$skip(47); ;
  for (ele <- s) {
    println(ele);
    s
  }}
}
