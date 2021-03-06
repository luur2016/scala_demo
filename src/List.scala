sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head:A,tail:List[A]) extends List[A]

object List {
  def sum(ints:List[Int]):Int= ints match{
    case Nil => 0
    case Cons(x,xs)=>x+sum(xs)
  }
  
  def product(ds:List[Double]):Double=ds match{
    case Nil => 1.0
    case Cons(0.0,_) => 0.0
    case Cons(x,xs) => x * product(xs)
  }
  
  def apply[A](as:A*):List[A]={
    if(as.isEmpty) Nil
    else Cons(as.head,apply(as.tail:_*))
  }
  
  def tail[A](ds:List[A]):List[A] =ds match {
    case Nil =>sys.error("tail of empty list")
    case Cons(_,t)=>t
  }
  
  def setHead[A](h:A,ds:List[A]):List[A] =ds match{
    case Nil =>sys.error("tail of empty list")
    case Cons(_,t) => Cons(h,t)
  }

  def drop[A](l: List[A], n: Int): List[A] =
    if (n <= 0) l
    else l match {
      case Nil => Nil
      case Cons(_, t) => drop(t, n - 1)
   }
  
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] =
    l match {
      case Cons(h,t) if f(h) => dropWhile(t, f)
      case _ => l
    }

  def init[A](l: List[A]): List[A] =
    l match {
      case Nil => sys.error("init of empty list")
      case Cons(_, Nil) => Nil
      case Cons(h, t) => Cons(h, init(t))
    }
  
  def foldRight[A,B](as:List[A],z:B)(f:(A,B)=>B):B=
    as match{
      case Nil => z
      case Cons(x,xs)=>f(x,foldRight(xs,z)(f))
    }
}