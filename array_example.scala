class array_example {

  var arr = Array(1,2,3,4,5)      // Creating single dimensional array
  arr.foreach((element:Int)=>println(element))       // Iterating by using foreach loop


  var arr2: Array[Array[Int]] = Array.ofDim[Int](2,2)          // Creating multidimensional array
  arr2(1)(0) = 15                          // Assigning value
  def show(){
    for(i<- 0 to 1){                       // Traversing elements by using loop
      for(j<- 0 to 1){
        print(" "+arr2(i)(j))
      }
      println()
    }
    println("Third Element = "+ arr2(1)(1))        // Accessing elements by using index
  }

}

object ArrayObject {
  def main(args:Array[String]){
   val xx = new array_example()
    xx.show()

  }
}
