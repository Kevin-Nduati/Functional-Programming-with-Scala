package exercises


// write as recursive function to get the nth fibonacci number. The first two fibonacci numbers are 0 and 1
// The nth number is always the sum of the previous two. Also use a local tail-recursive function
object exercise_2_1 {
  def fib(n: Int): Int =
    var acc = 1
    var i = n
    while i > 0 do {acc *= i; i -= 1}
    acc
  
}
