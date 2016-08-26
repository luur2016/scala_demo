import scala.beans.BeanProperty
import MyModule.abs

object FirstClass {
  def main(args: Array[String]): Unit = {
    val xs:List[Int] = List(1,2,3,4,5)
    val ex1 = List.dropWhile(xs, (x:Int) => x<4)
  }
}