object Listing_2_1 {
  def abs(n: Int): Int = // abs takes an integer and returns an integer
    if (n < 0) -n 
    else n
  
  // this is a private method that can only be called by other members of this object
  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def main(args: Array[String]): Unit =
    println(formatAbs(-42))

  
}

// 

