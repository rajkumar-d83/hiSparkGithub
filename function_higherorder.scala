class function_higherorder {


}

object Calculator extends App {

  def sum(a: Int , b: Int) = { a + b}
  def diff(a: Int , b: Int) = { a - b}
  def multi(a: Int , b: Int) = { a * b}

  def calc(f: (Int,Int) =>Int ,a: Int, b :Int) = f(a,b)

 println(calc(sum,a=5,b=6))
  println(calc(multi,3,4))

}
