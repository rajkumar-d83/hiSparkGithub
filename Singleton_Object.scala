

object Singleton{
  def main(args:Array[String]){
    Singleton_Object.hello()         // No need to create object.
  }
}


object Singleton_Object{
  def hello(){
    println("Hello, This is Singleton Object")
  }
}
