class Companion_Object( a :String, b : String)  {

  var x= 5
  def printmsg(){
    println("Hello, " + a +  "-" + b)

  }
  printmsg()
}


object Companion_Object extends App {

  def apply(a: String, b: String): Companion_Object = new Companion_Object(a: String, b: String)

  val Text1 = new Companion_Object("Hi", "text1")
  val Text2 = new Companion_Object("Hello", "text2")
  //println(x)
}

