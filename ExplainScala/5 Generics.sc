class Stack[T] {
  var elems: List[T] = Nil
  def push(x: T) { elems = x :: elems }
  def top: T = elems.head
  def pop { elems = elems.tail }
}

val s = new Stack[String]()
s.push("Hello World")
s.top



Type





