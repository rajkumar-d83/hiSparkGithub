

class Arithmetic{
  def add(a:Int, b:Int){
    val add = a+b
    println("sum = "+add)
  }
}

object Ananomous_object{
  def main(args:Array[String]){
    new Arithmetic().add(10,10)

  }
}  
