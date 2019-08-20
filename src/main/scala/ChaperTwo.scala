object ChaperTwo {
  def main(args: Array[String]): Unit = {
    println(formatResult("absolute value", 10, abs))
    println(formatResult("fib", 10, fib))
  }

  def formatResult(funcName: String, input: Int, f: Int => Int): String = {
    val msg = "The %s of %d is %d"
    msg.format(funcName, input, f(input))
  }

  def abs(input: Int): Int = {
    if (input > 0) input
    else -input
  }

  def fib(num: Int): Int = {
    @annotation.tailrec
    def go(num: Int, prev: Int): Int =
      if (num <= 0) prev
      else go(num - 1, num + prev)

    go(num, 0)
  }

  def curry[A,B,C] (f: (A, B) => C) : A => (B => C) = {
    (a : A) => (b : B) => f(a, b)
  }

  def uncurry[A, B, C](f: A => B => C) : (A, B) => C = {
    (a, b) => f(a)(b)
  }

  def foldRight[A, B](l: List[A], z: => B)(f: (A, =>B) =>B): B =
    l match{
      case con
    }

  def exists(p: A => Boolean) : Boolean =
    foldRight
}
