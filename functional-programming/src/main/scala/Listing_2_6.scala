// Implement a function that checks whether an array[A] is sorted according to a given comparison function

def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean =
    @annotation.tailrec
    def go(n: Int): Boolean =
      if n >= as.length-1 then true
      else if gt(as(n), as(n+1)) then false
      else go(n+1)

    go(0)


