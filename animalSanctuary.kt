fun main() {
 
// PREPARING FOR THE DAY
  //Responsibities
  var responsibilities = listOf("feed the chimps", "play a random game", "conduct a health check on Foxie")
   
 // Variables to keep track of time
  var responsibilitiesComplete = 0
  var timeSpent = 0
  val totalShiftTime = 4 // Our shift has 4 hours (hour lenght)

// Maps
var foxiesHealthCheck = mutableMapOf <String, Any?>()
 
 // FOR IMMUTABLE COLLECTIONS
 //*************************************************************************************************************
 // var foxiesHealthCheck : Map<String, Any?> = mapOf()
 //*************************************************************************************************************
 
 // FOR MUTABLE COLLECTIONS
 //*************************************************************************************************************
 // var foxiesHealthCheck  = mutableMapOf <String, Any?>()
 //*************************************************************************************************************

var chimpsHaveEaten = mutableMapOf("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)
    
// FEDDING THE CHIMPS
 println("First , ${responsibilities[0]}") // First task.
 
 // Update Map
 println("Feeding Bonnie....")
 chimpsHaveEaten["Bonnie"] = true

 println("Fedding Jubilee....")
 chimpsHaveEaten["Jubilee"] = true

 println("Feeding Frodo")
 chimpsHaveEaten["Frodo"] = true

 println("Fedding Foxie")
 chimpsHaveEaten["Foxie"] = true
 
 // Time spent in feeding all chimps
 timeSpent++
 responsibilitiesComplete++
 
 println("All chimps have now been fed! \n You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

// PLAYING A RANDOM GAME
println("Next, ${responsibilities[1]}") // Second task

 // Games
 var games = mutableSetOf("tug-of-war with a blanket", "catch and throw", "number game")
 var randomGame = games.random()

 println(randomGame)

 // Update time and responsibilities
 timeSpent++
 responsibilitiesComplete++

 println("Each chimp has now played a game of $randomGame! /n You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

// CONDUCTION A HEALTH CHECK
 println("Next, ${responsibilities[2]}") // Third task

 // Update the foxiesHealthCheck Map
 foxiesHealthCheck.put("temperature", 37.2)
 foxiesHealthCheck.put("mood", "happy")

 println("Foxie has a temperature of ${foxiesHealthCheck ["temperature"]} and is feeling ${foxiesHealthCheck ["mood"]}.")

 // Update time spent
 timeSpent++
 responsibilitiesComplete++

 println("You've now completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

// WRAPPING UP

 // Check if we have completed all the tasks
 if(timeSpent <= totalShiftTime){
   println("Congratulations, You have completed your job.")
 } else if(timeSpent >= totalShiftTime){
   println("All responsibilites are complete and you did overtime.")
 } else{
   println("Responsibilities are not done and you took extra time")
 }

// OPTIONAL TASKS
 // A chimp’s average body temperature is 32.7 degrees Celsius. Anything higher than that should be notified to the vet. Add this logic to the program.

 /* if(foxiesHealthCheck ["temperature"] > 32.7){
    println("Notify the vet")
 } 
 */

// Optimize parts of your program as you see fit. For example, how can we improve upon and avoid the repetitive use of responsibilities.size?

/* sizeOfResponsibilities = responsibilities.size
 I CAN STORE THE SIZE IN A VARIABLE AND USE IT AS NEEDED.
*/

// Add an additional responsibility to the list and adjust the project as needed.

/* An additional responsibility can be to take the chimps for a walk in the forest and have them explore their surroundings.
*/
}
