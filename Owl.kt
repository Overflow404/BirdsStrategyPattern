package overflow404
class Owl : Bird() {
    init {
        flyBehavior = Fly()
    }
 
    override fun display() {
        print("This is an owl.\n")
        this.performFly()
    }
}
