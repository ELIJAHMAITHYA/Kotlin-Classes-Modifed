fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {

        println("Name : $name \n Age: $age \n ")
        if (referrer != null) {
            println("  Likes to ${hobby} \n Has a referrer named ${referrer.name} who likes to ${referrer.hobby}")
        } else {
            println(" Doesnt have a refferer and Likes to play $hobby")
        }

    }
}
//Name: Amanda
//Age: 33
//Likes to play tennis. Doesn't have a referrer.
//
//Name: Atiqah
//Age: 28
//Likes to climb. Has a referrer named Amanda, who likes to play tennis.