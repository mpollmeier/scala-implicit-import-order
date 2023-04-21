package extensionmethod

/** if we import both, the compiler fails for ambiguous implicits, which is the expected behaviour */
import Extensions1._
// import Extensions2._

object Main {
  def main(args: Array[String]) = {
    val a = new ClassA()
    println(a.extMethod)
  }
}

class ClassA

object Extensions1 {
  extension (a: ClassA) {
    def extMethod: String = "one"
  }
}

object Extensions2 {
  extension (a: ClassA) {
    def extMethod: String = "two"
  }
}
