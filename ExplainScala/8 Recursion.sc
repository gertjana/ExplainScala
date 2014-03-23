//tail recursive summing of list
def sumList(list:List[Int]):Int = {
  @scala.annotation.tailrec
  def sumList_rec(xs:List[Int], result:Int):Int = {
    if (xs.isEmpty) result
    else sumList_rec(xs.tail, result + xs.head)
  }
  sumList_rec(list,0)
}
sumList(List(3,4,5))

//recursive fibonacci
def fibonacci(i: Int):Int = i match {
  case 0 => 0
  case 1 => 1
  case x => fibonacci(x-1) + fibonacci(x-2)
}
fibonacci(40)

//tail recursive fibonacci
def fibTailRec(i:Int):Int = {
  @scala.annotation.tailrec
  def fib_tail(n:Int, result:Int, next:Int):Int = n match {
    case 0 => result
    case _ => fib_tail(n-1, next, result+next)
  }
  fib_tail(i,0,1)
}
fibTailRec(40)