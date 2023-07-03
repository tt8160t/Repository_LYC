open class Human(val name: String, val mana: Int = 0 ) {
    open fun attack() {
            println("$name use Fist Attack!")
    }
}

class Mage (name: String, mana: Int = 0 ) : Human(name, mana) {
    override fun attack() {
        println("$name use Fireball!")
    }
}

fun whethermana(name: String, mana: Int) :Human {
    return if (mana == 0) {
        Human(name, mana)
    } else{
        Mage(name, mana)
    }
}

fun main() {
    val human = Human("Tony")
    human.attack()
    val mage = Mage("Sally" )
    mage.attack()
    val bob = whethermana("Bob", 0)
    bob.attack()
}