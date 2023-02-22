fun main() {
   institute()
   println(fact("Emma",23))
   println(length("Becky"))
  trueself()
}
//1. Given a string “akirachix”. Write a function that prints out a string composed
//of the first, third and fourth characters of the string (2 points)

fun institute(){
   var institute = "akirachix"
   println("${institute[0]}${institute[2]}${institute[3]}")



}

//2.Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provided name and age respectively. (3 points)

fun fact(name: String ,age:Int):String {
   var fact  = ("Hi,my name is $name and iam $age years old")
   return fact
}

//3.Write a function that takes in a String and returns its length (2 points)
fun length(name: String): Int{
   return name.length
}
// //4. Write a function that takes in a name and prints out “That’s me!” when your
//   //name is passed to it, otherwise it prints out “I don’t know who that is” (3
//   //points)

fun trueself(){
   var name="Emmayo"
   if (name==name){
println("That is me")}
else name="I don't know who that is"
   println(name)
}






