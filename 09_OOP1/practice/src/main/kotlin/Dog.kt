class Dog(energy: Int, weight: Double, currentAge: Int, maxAge: Int, name: String) :
    Animal(energy, weight, currentAge, maxAge, name) {
    override fun move() {
        super.move()
        println("Its running")
    }
}