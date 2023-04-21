import io.foo.ClassA

import io.foo.Implicits1._
import io.foo.Implicits2._

import io.foo.B._
import io.foo.A._

@main def main() = {
  val a = new ClassA()
  a.extMethod()

  val s = "a"
  val c = s.foo
  println("")
}
