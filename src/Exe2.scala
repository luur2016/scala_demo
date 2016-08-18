
object Exe2 {
  def main(args: Array[String]): Unit = {
    val stuScore = Map("xiaozhang"->86,"xiaoli"->90)
    for((k,v)<-stuScore){
      println(k)
      println(v) 
    }
    
    val stuScore2 = scala.collection.mutable.Map("xiaozhang"->86,"xiaoli"->90)
    stuScore2("xiaoliu")=80
    for((k,v)<-stuScore2){
      println(k)
      println(v) 
    }
    
    stuScore2 += ("xiaozhangliang"->86,"xiaolizi"->90)
    println("size------>"+stuScore2.size)
    for((k,v)<-stuScore2){
      println(k)
      println(v) 
    }
    
    import scala.io.Source
    val source = Source.fromFile("src/test.txt","UTF-8")
    val lines = source.getLines()
    for(line <- lines)
      println(line)
    
    val source2 = Source.fromFile("src/test.txt","UTF-8")
    val allInline = source2.mkString
    println(allInline)
    
    import java.io.PrintWriter;
    val out = new PrintWriter("src/test.txt","UTF-8")
    out.append("88888888888888888888888")
    out.close();
  }
}