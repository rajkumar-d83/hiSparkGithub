object lambda_function {
  def main(args: Array[String]) = {
    val result1 = (a:Int, b:Int) => a+b        // Anonymous function by using => (rocket)
    val result2 = (_:Int)+(_:Int)              // Anonymous function by using _ (underscore) wild card
    println(result1(10,10))
    println(result2(10,10))
  }
}
