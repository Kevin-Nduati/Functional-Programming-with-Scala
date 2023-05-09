// def isSorted[A] (as: Array[A], ordered: (A, A) => Boolean): Boolean =
//     as.sorted === as

def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean =
    @annotation.tailrec
    def go(n: Int): Boolean =
      if n >= as.length-1 then true
      else if gt(as(n), as(n+1)) then false
      else go(n+1)

    go(0)

val ascendingOrder: (Int, Int) => Boolean = (a, b) => a <= b
val array = Array(3,2)

isSorted(array, ascendingOrder)