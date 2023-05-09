object Factorial {
  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int = 
        if (n <= 0) acc
        else go(n-1, n*acc)

    go(n, 1)
  }
}

// We are defining a recursive helper function inside the body of the factorial function. Such a helper function is called go or loop by convention
// Scala detects this sort of self-recursion and compiles it to the same sort of bytecode as would be emitted for a while loop, so long as the recursive call is in tail position
// A call is said to be in tail position if the caller does nothjing other than return the value of the recursive call.
