import scala.math.BigInt
import MyModule.abs

object Exe1 {
  def main(args: Array[String]): Unit = {
    val rst = "hello"(4)
    println(rst)
    BigInt("1234567890")
    val count = BigInt("1234567890") * BigInt("1234567890") * BigInt("1234567890")
    println(count)
    
    val x = -1;
    val rst2 = if(x > 0) 1 else -1
    println(rst2)
    
    val y = if(x > 0 ) "this is a test"
    println(y)
    
    println(123)
//    val name = readLine
//    println(name)
    
    for(i <- 1 to 10){
      println(i);
    }
    
    val s = "this is a test"
    for(i <- 0 until s.length())
      println(s(i))
      
    for(ch <- s)
      println(ch)
    
    println(decorate("123"))  
    println(decorate("123","{","}"))  
    println(decorate(str="123",right="{",left="}"))
    println(sum(1,2,3,4,5))
  } 
  
  def fac(n:Int)={
    var r = 1
    for(i <- 1 to n) r= r*1
    r
  }
  
  def decorate (str:String,left:String="[",right:String="]")={
    left + str + right
  }
  
  def sum (args:Int*)={
    var result = 0
    for(i<-args) result += i
    result
  }
}