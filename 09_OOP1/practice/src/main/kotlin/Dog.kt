class Dog(energy: Int, weight: Int, currentAge: Int, maxAge: Int, name: String) :
    Animal(energy, weight, currentAge, maxAge, name) {
    override fun move(message: String) {
        super.move("$name running")
    }

    override fun giveOffspring(energy: Int, weight: Int, currentAge: Int, maxAge: Int, name: String): Dog {
        super.giveOffspring(energy, weight, currentAge, maxAge, name)
        return Dog(energy, weight, currentAge, maxAge, name)
    }
}