import io.foo.ClassA

import io.foo.Implicits1._
import io.foo.Implicits2._

object Main {
  def main(args: Array[String]) = {
    val a = new ClassA()
    println(a.extMethod())
  }
}
