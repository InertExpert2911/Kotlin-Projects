// CREATING A CLASS
class Calculator (val name : String){
  
  init{
    println("$name calculator")
  }

  // CALCULATOR'S FUNCTIONS
  // ADDITION
  fun add(num1 : Int, num2 : Int) : Int{
    return num1 + num2
  }

  // SUBTRACTION
  fun subtract(num1 : Int, num2 : Int) : Int{
    return num1 - num2
  }
  
  // MULTIPLCATION
  fun multiply(num1 : Int, num2 : Int) : Int{
    return num1 * num2
  }

  // DIVISION
  fun division(num1 : Int, num2 : Int) : Any{
    if(num1 == 0 || num2 == 0){
      return "Error! Dividing by zero is not allowed" 
    } else{
       return num1 / num2
    }
  }

  // POWER
   fun power(num1 : Int, num2 : Int) : Int{
     var result = 1
     for(i in 1..num2){
       result  *= num1
     }
     return result
   }

}

fun main() {

  val Cal = Calculator("Codey")

  println(Cal.add(10, 15))

  println(Cal.subtract(10, 15))

  println(Cal.multiply(10, 15))

  println(Cal.division(10, 15))

  println(Cal.power(2, 5))
}

// OPTIONAL CHALLENGES

// 1. To mimic a real-world calculator, we can format our output to also include the original calculation. 12 -> 5 + 7 = 12.

/* For the first task, we can utilize print() statements and String templates to add a line of code similar to this one to the top of each function:

print("$param1 + $param2 = ") 

*/

// 2. Having the code as is without any additional output, we can refactor some of the member functions to utilize a single expression syntax and shorten the lines of code that they span.

/* For the second task, if we choose to not add any print statements and instead keep the body of the first few member functions containing just a return, we can implement this shorter, more concise syntax:

fun add(a: Int, b: Int): Int = a + b

*/

// 3.We can add another member function to the class that you’d like your calculator to perform.

/* For the third task, we can add a member function that calculates the percent of an Integer, such as 50% of 20 which would return 10.

To do so, we’d need to accept the percent number in Int form and then convert it to decimal within the function:

var decimalForm = num * 0.01

Then, we’d multiply this result by the second parameter and return the answer. 

*/
