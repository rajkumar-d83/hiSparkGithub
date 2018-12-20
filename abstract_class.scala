class abstract_class {
  abstract class Bike{
    def run1()               // Abstract method
    def run2()
  }

  class Hero extends Bike{        // Not implemented in this class
    def runHero(){
      println("Running fine...")
    }

    def run1(){
      println("Running good but few problems...")
    }
    def run2(){}

  }

  object MainObject{
    def main(args: Array[String]){
      val h = new Hero()
      h.runHero()
    }
  }

}
