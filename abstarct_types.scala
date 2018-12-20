

object abstarct_types extends App {

  abstract class Buffer {
    type T
    val element: T
  }

  abstract class SeqBuffer {
    type T
    val element: Seq[T]

    def length: Int = element.length
  }

  def newIntBuffer(el: Int) = new Buffer {
    type T = Int
    val element: Int = el
  }

  def newIntBuffer(el: Int*) = new SeqBuffer {
    type T = Int
    val element: Seq[Int] = el
  }

  println(newIntBuffer(5).element)
  println(newIntBuffer(1, 2, 3).element)
}