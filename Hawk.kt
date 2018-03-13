package overflow404
class Hawk : Bird() {
    init {
        flyBehavior = Fly()
    }
 
    override fun display() {
        print("This is an hawk.\n")
        this.performFly()
    }
}
