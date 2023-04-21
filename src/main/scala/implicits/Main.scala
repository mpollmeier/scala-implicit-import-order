package implicits

/** the import further down wins - swap them around to change results */
import Implicits1._
import Implicits2._
/** n.b. if we swap the implicits for extension methods, the behaviour is as expected, i.e. we get a compiler error re ambiguous implicits. I.e. quite likely this is a case of 'dont use implicits' */

import scala.language.implicitConversions


object Main {
  def main(args: Array[String]) = {
    val a = new ClassA()
    println(a.extMethod)
  }
}

class ClassA

class ClassAExt1(a: ClassA) {
  def extMethod: String = "one"
}

class ClassAExt2(a: ClassA) {
  def extMethod: String = "two"
}

object Implicits1 {
  implicit def to(a: ClassA): ClassAExt1 =
    new ClassAExt1(a)
}

object Implicits2 {
  implicit def to(a: ClassA): ClassAExt2 =
    new ClassAExt2(a)
}
