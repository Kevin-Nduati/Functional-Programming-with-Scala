// POLYMORPHIC FUNCTIONS: ABSTRACTING OVER TYPES


// So far we yhave only defined monomorphic functions, or functions that operate on only one type of data
// For example, abs and factorial are specific to arguments on type int
// Often, and especially when writing HOFs, we want to write code that works for any type given, this is a polymorphic functions


// The following function returns the first index in an array where the key occurs, or -1 if it's not found

// This ia a monomorphic function
def findFirst(ss: Array[String], key: String): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
        // if n is past the end of the array, return -1, indicating the key does not exist in the array
        if (n >= ss.length) -1
        else if (ss(n) == key) n // extracts the nth element of the array ss
        else loop(n + 1)

    loop(0) // start the loop at the first element of the array
}

// The code above will look almost identical if we are searching for a String in an Array[String], an int in array[Int]
// We can write the function more generally for any type A by accepting a function to use for testing a particular A value


// instead of hardcoding String, take a type A as a parameter. And instead of hardcoding an equality check for a given key,
// take a function with which to test each element of the array
def findFirst1[A](as: Array[A], p: A => Boolean): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
        if (n >= as.length) -1
        else if (p(as(n))) n // if the function p matches the current element, we've found a match and we return its index in the array
        else loop(n + 1)

    loop(0)
}
