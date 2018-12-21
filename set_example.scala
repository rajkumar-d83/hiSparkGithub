
import scala.collection.JavaConverters._
import scala.collection.immutable._
object set_example{
  def main(args:Array[String]){
    var games = Set("Cricket", "Football", "Hocky", "Golf")
    val alphabet = Set("A","B","C","D","E")
    val mergeSet = games ++ alphabet            // Merging two sets
    println("Elements in games set: "+games.size)   // Return size of collection
    println("Elements in alphabet set: "+alphabet.size)
    println("Elements in mergeSet: "+mergeSet.size)
    println(mergeSet)

    games += "Racing1"               // Adding new element
    println(games)
    games += "Cricket1"              // Adding new element, it does not allow duplicacy.
    println(games)
    games -= "Golf1"             // Removing element

    for(game <- games){
      println(game)
    }

    println ("  print for each....")
    games.foreach((element:String)=> println(element))

    val xx :SortedSet[String] = SortedSet("apple","orange")
    //implicit val xx: Ordering[String] =  Ordering[String].reverse
   // SortedSet(Set("Zebra","apple","orange"))(xx)

    xx.foreach((element:String)=> println(element))

    val numbers: SortedSet[Int] = SortedSet(5,8,1,2,9,6,4,7,2)
    numbers.foreach((element:Int)=> println(element))

  }
}