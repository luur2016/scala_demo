import scala.beans.BeanProperty
import MyModule.abs

class FirstClass {

  private var name="";
  private var age = 0;
  
  def this(name:String){
    this()
    this.name = name
  }
  
  def this(name:String,age:Int){
    this()
    this.name = name
    this.age = age
  }
  
  def main(args: Array[String]): Unit = {
//    val f = new FirstClass("haha",27)
//    println(f.name)
    println(abs(-30))
  } 
}