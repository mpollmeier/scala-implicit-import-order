package io.foo

class ClassA { }

class ClassAExt1(a: ClassA) {
  def extMethod(): String = {
    print("1")
    "abc"
  }
}

class ClassAExt2(a: ClassA) {
  def extMethod(): Int = {
    print("2")
    2
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

class Ext(val x:String) extends AnyVal { def foo:String = x + "foo"}
trait FooConv {
  final implicit def toFoo(x:String):Ext = new Ext(x)
  //extension (x: String) {
  //  def foo(): String = x + "foo"
  //}
}
object A extends FooConv {
}
object B extends FooConv {
}
