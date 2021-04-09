fun main() {
//SQUARE PATTERN 
  // SQUARE VARIABLES
  val sqSide = 7
  val sqChar1 = "X  "
  val sqChar2 = "O  "
  
  // CREATING A SQUARE PATTERN
  for(i in 1..sqSide){ // 1..7
    for(j in 1..sqSide){ // 1..7 
      // print(sqChar1) // "X "
      
      // CREATING A CHECKER BOARD PATTERN
      if(i % 2 == 0 && j % 2 == 0){
        print(sqChar1)
      }else if(i % 2 == 1 && j % 2 == 1){
        print(sqChar1)
      }else{
        print(sqChar2)
      }
    } 
    println()
  }
  

// TRIANGLE PATTERN
  // TRIANGLE VARIABLES
  val triRows = 10
  var triCount = 0
  var triRowLen = triRows
  val triChar1 = "/  "
  val triChar2 = "   "
  
  // CREATING A TRIANGLE OUTINE PATTERN
/*  for(k in triRows downTo 1){
    while(triCount < triRowLen){
      triCount++
      print(triChar1)
    }
    println()
    triCount = 0
    triRowLen--
  }
*/

  //CREATING A TRIANGLE OUTLINE PATTERN
  for(k in triRows downTo 1){
    while(triCount < triRowLen){
      triCount++
      // print(triChar1)
      if(triCount != 1 && triCount != triRowLen && k != triRows){
         print(triChar2)
      } else{
        print(triChar1)
      }
    }
    println()
    triCount = 0
    triRowLen--
  }
}

// OPTIONAL CHALLENGES
// 1. Change the values of sqChar1, sqChar2, triChar1 and triChar2 to see how they affects the look of each shape.
// 2. Use different conditions within the if expressions of the square shape to explore what other patterns you can generate.
// 3. In the triangle outline code, instead of using an else to output triChar1, use a continue in the if block to skip the rest of the while loop code.
