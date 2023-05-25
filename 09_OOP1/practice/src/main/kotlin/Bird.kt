class Bird(energy: Int, weight: Double, currentAge: Int, maxAge: Int, name: String) :
    Animal(energy, weight, currentAge, maxAge, name) {
    override fun move(message: String) {
        super.move("$name flying")
    }

    override fun giveOffspring(energy: Int, weight: Double, currentAge: Int, maxAge: Int, name: String): Bird {
        super.giveOffspring(energy, weight, currentAge, maxAge, name)
        return Bird(energy, weight, currentAge, maxAge, name)
    }
}