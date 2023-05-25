class Fish(energy: Int, weight: Int, currentAge: Int, maxAge: Int, name: String) :
    Animal(energy, weight, currentAge, maxAge, name) {
    override fun move(message: String) {
        super.move("$name floating")
    }

    override fun giveOffspring(energy: Int, weight: Int, currentAge: Int, maxAge: Int, name: String): Fish {
        super.giveOffspring(energy, weight, currentAge, maxAge, name)
        return Fish(energy, weight, currentAge, maxAge, name)
    }
}