open class NatureReserve {
    fun getBird(energy: Int, weight: Int, currentAge: Int, maxAge: Int, name: String) =
        Bird(energy, weight,currentAge, maxAge, name)
    fun getFish(energy: Int, weight: Int, currentAge: Int, maxAge: Int, name: String) =
        Fish(energy, weight,currentAge, maxAge, name)
    fun getDog(energy: Int, weight: Int, currentAge: Int, maxAge: Int, name: String) =
        Dog(energy, weight,currentAge, maxAge, name)
    fun getAnimal(energy: Int, weight: Int, currentAge: Int, maxAge: Int, name: String) =
        Animal(energy, weight,currentAge, maxAge, name)
}