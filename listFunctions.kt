// GATHERING A LIST OF VALUES
fun getListOfNumbers() : List<Int> {
  var myList = mutableListOf <Int> ()

  for(i in 1..7){
    println("Enter a number:")
    var Number = Integer.valueOf(readLine())
    myList.add(Number)
  }

 return myList
}


// FINDING THE MAX VALUE
fun findMax(maxList : List<Int>) : Int {
   var largestNumber = maxList[0]
  
   // The loop runs for every element in the list and compares it with the largest number. If the conditional is true then, the largest number is updated.

   for(j in maxList){
     if(j > largestNumber){
       largestNumber = j
     } 
   }

  return largestNumber
}


 // FINDING THE MIN VALUE
fun findMin(minList : List<Int>) : Int {
   var smallestNumber = minList[0]

   // The loop runs for every element in the list and compares it with the smallest number. If the conditional is true then, the smallest number is updated.

   for(k in minList){
     if(k < smallestNumber){
       smallestNumber = k
     } 
   }

  return smallestNumber
}


 // FINDING THE AVERAGE
fun findAverage(listAvg : List<Int>) : Int {
   var sum = 0

   for(l in listAvg){
     sum += l
   }

  return sum / listAvg.size
}


 // FINDING IF A LIST CONTAINS A VALUE
fun checkIfListContains(checkList : List<Int>, numToCheck : Int) : Boolean {
   
   for(m in checkList){
     if(m == numToCheck){
       return true
     }
   }

  return false
}


// MAIN FUNCTION
fun main() {
  
  // OUTPUT OF THE LIST
  var values = getListOfNumbers()
  println(values)
 
  // OUTPUT FOR THE MAX VALUE
  var largestValue = findMax(values)
  println("The largest number is $largestValue")

  // OUTPUT FOR THE MIN VALUE
  var smallestValue = findMin(values)
  println("The smallest number is $smallestValue")

  // OUTPUT OF THE AVERAGE
  var average = findAverage(values)
  println("The average is $average")

  // TO CHECK IF A VALUE CONTAINS
  println("Enter the number you want to check:")
  var numToFind = Integer.valueOf(readLine())
  
  var  containsValue = checkIfListContains(values, numToFind)

  if(containsValue == true){
    println("Number Found !!!!")
  } else {
    println("Number Not Found ???? WTF !!!")
  }

}


// ADDITIONAL CHALLENGES
// 1. Create a function that returns the difference between the largest and smallest number in the list.
// ANS: For the first prompt, use the logic from findMin() and findMax() to find the smallest and largest numbers. Then, return the difference between the two.

// 2. Create a function that takes in a list of numbers and returns a list with all the values squared.
// ANS: For the second prompt, create an empty list. Then, loop through each element of the list argument; inside the loop, add the value of the element multiplied by itself.
