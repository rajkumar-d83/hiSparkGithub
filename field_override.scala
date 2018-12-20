
class Vehicle{
     val  speed:Int = 60

}
class Bike extends Vehicle{
   override val speed:Int = 100     // Override keyword
    def show(){
        println(speed)
    }
} 
object field_override extends App {
        var b = new Bike()
        b.show()
}
