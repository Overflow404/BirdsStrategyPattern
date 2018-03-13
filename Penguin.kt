package overflow404
class Penguin : Bird() {
    init {
        flyBehavior = NoFly()
    }
 
    override fun display() {
        print("This is a penguin.\n")
        this.performFly()
    }
}
