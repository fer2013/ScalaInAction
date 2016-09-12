package com.dt.scala.hello

import java.io.File

object HelloScala {
  /**
   * 0、main方法
   */
  def main(args: Array[String]) {
    println("hello scala");
    for (arg <- args) {
      println(arg);
    }
    // doWhile();
    //    readFiles();
  }
  /**
   * 1、从控制台输入
   */
  def doWhile() {
    var line = "";
    do {
      print("请输入：");
      line = readLine();
      println(line);
    } while (line != "")
  }
  /**
   * 2、读取当前文件
   */
  def readFiles() {
    var files = new File(".").listFiles();
    for (file <- files) {
      println(file);
    }
  }
  // 3、在main方法前执行
  var i = 0;
  println(i);
}