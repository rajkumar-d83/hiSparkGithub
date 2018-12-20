/*
* A trait is like an interface with a partial implementation.
* In scala, trait is a collection of abstract and non-abstract methods.
* You can create trait that can have all abstract methods or some abstract and some non-abstract methods.
A variable that is declared either by using val or var keyword in a trait get internally implemented in
the class that implements the trait. Any variable which is declared by using val or var but not initialized is
considered abstract.*/

/*
You can also define method in trait as like in abstract class. I.e. you can treat trait as abstract class also.
In scala, trait is almost same as abstract class except that it can't have constructor.
You can't extend multiple abstract classes but can extend multiple traits.
*/

trait Printable{
  def print()            //Abstract class

  def printnonabstract(): Unit ={     //Non Abstarct Classß
    println("This is print2 - non abstract methods")

  }
}
trait Showable{
  def show()
}

class A1 extends Printable{
  def print(){
    println("Hello A1")
  }
}
/*
If a class extends a trait but does not implement the members declared in that trait,
 it must be declared abstract.
*/

abstract class A2 extends Printable{    // Must declared as abstract class
  def print2(){
    println("Hello A2")
  }
}

class A3 extends Printable with Showable{
  def print(){
    println("This is printable")
  }
  def show(){
    println("This is showable")
  }
}

object trait_examples {
  def main(args:Array[String]) {
    val a = new A1()
    a.print()

   // val b = new A2()  abstarct class cannot be instantiated
    //b.print2()

    val c = new A3()
    c.print()
    c.show()
  }
}
