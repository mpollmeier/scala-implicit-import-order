package io.foo

class ClassA

class ClassAExt1(a: ClassA) {
  def extMethod(): String = {
    "one"
  }
}

class ClassAExt2(a: ClassA) {
  def extMethod(): String = {
    "two"
  }
}

object Implicits1 {
  implicit def to1(a: ClassA): ClassAExt1 = {
    new ClassAExt1(a)
  }
}

object Implicits2 {
  implicit def to1(a: ClassA): ClassAExt2 = {
    new ClassAExt2(a)
  }
}
