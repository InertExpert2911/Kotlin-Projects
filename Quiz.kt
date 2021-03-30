fun main() {
  val quizAnswer1 = 15
  var quizAnswer2 = 3
  val quizAnswer3 = "isosceles"
  val quizAnswer4 = 47

  var points = 0

  // QUESTIONS
  println("What is 75 / 5 ?")
  var studentAnswer1 = Integer.valueOf(readLine())

  println("What is the value of y in the equation: 6 * 2y = 36 ?")
  var studentAnswer2 = Integer.valueOf(readLine())

  println("What is the name of the triangle that has two eaual sides ?")
  var studentAnswer3 = readLine()

  println("Value of 8 * 6 - (3 - 2) ?")
  var studentAnswer4 = Integer.valueOf(readLine())

  // CHECKING ANSWERS_1
  if(studentAnswer1 == quizAnswer1){
    points += 25
  }
  
  // CHECKING ANSWERS_2
  if(studentAnswer2 == quizAnswer2){
    points += 25
  } else if (studentAnswer2 == quizAnswer2++ || studentAnswer2 == quizAnswer2--){
    points += 20
    println("The answer $studentAnswer2 is within 1 point of $quizAnswer2.")
  } else {
    points += 1
  }

  // CHECKING ANSWERS_3
  if(studentAnswer3 == quizAnswer3){
    points += 25
  } else if(studentAnswer3 == "equilateral"){
    points += 10
  } else{
    points += 1
  }

  // CHECKING ANSWERS_4
  if(studentAnswer4 == quizAnswer4){
    points += 35
  } else if(studentAnswer4 in 44..54){
    points += 20
  } else {
    points += 1
  }

  // GRADING 
  when(points){
    in 0..59 -> println("The student received an F.")
    in 60..69 -> println("The student received a D.")
    in 70..79 -> println("The student received a C.")
    in 80..89 -> println("The student received a B.")
    in 90..100 -> println("The student received a A.")
    in 101..110 -> println("The student received a A+.")
  }

}
