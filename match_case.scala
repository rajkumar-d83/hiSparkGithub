object match_case extends App{

  def search(T : Any): String ={
    T match {
      case "Int" => "Int"
      case "Float" => "Float"
      case "Double" => "Double"
      case _ => "Any Other"
      }
  }

  println(search("Float"))
  println(search("hi"))
}
