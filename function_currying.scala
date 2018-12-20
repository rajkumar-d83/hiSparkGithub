object function_currying {

  def add(a:Int)(b:Int) = {
    a+b
  }
  def main(args: Array[String]) = {
    val result = add(10)(10)
    println("10 + 10 = "+result)
    val addIt = add(10)_
    println (addIt)
    val result2 = addIt(3)
    println("10 + 3 = "+result2)
  }
}
