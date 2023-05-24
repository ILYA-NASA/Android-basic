class Bird(energy: Int, weight: Double, currentAge: Int, maxAge: Int, name: String) :
    Animal(energy, weight, currentAge, maxAge, name) {
    override fun move() {
        super.move()
        println("Its flying")
    }

    override fun giveOffspring(energy: Int, weight: Double, currentAge: Int, maxAge: Int, name: String) {
        super.giveOffspring(energy, weight, currentAge, maxAge, name)
    }
}