
open class Person(age: Int, name: String){

    val applePrice = 10

    init {
        println("My name is $name")
        println("My age is $age")
    }

    open fun walk(){
        println("Walking is good for your health!")
    }

}

class CodingTeacher(age: Int, name: String): Person(age, name){
    fun teachMaths(){
        println("I am a coding teacher and I teach code!")
        println("The price of an apple is $${(applePrice * .10).toInt()}")
    }
}

class BusinessMan(age: Int, name: String): Person(age, name){
    fun doBusiness(){
        println("I am a business man and I love to do business!")
        println("The price of an apple is $applePrice")

    }

    override fun walk() {
        super.walk()
        println("I added code to this walk() function.")
    }
}

fun main(){

    val teacher = CodingTeacher(27, "Allan")
    teacher.teachMaths()

    println("(\n ---")

    val business = BusinessMan(34, "Juma")
    business.doBusiness()

    business.walk()
}