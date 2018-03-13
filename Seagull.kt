package overflow404
class Seagull : Bird() {
    init {
        flyBehavior = Fly()
    }
 
    override fun display() {
        print("This is a seagull.\n")
        this.performFly()
    }
}
