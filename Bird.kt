package overflow404
abstract class Bird {
    internal lateinit var flyBehavior: FlyBehavior
 
    fun performFly() {
        flyBehavior.doFly()
    }
 
    fun setFlyBehavior(flyBehavior: FlyBehavior) {
        this.flyBehavior = flyBehavior
    }
 
    fun eat() {}
    abstract fun display()
}
