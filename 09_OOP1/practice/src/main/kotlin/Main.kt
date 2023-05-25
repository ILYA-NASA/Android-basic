fun main() {
    val natureReserve: NatureReserve = NatureReserve()
    val birdsList = mutableListOf<Animal>(
        natureReserve.getBird(31, 1, 1, 30, "Bird_01"),
        natureReserve.getBird(32, 2, 2, 30, "Bird_02"),
        natureReserve.getBird(33, 3, 3, 30, "Bird_03"),
        natureReserve.getBird(34, 4, 4, 30, "Bird_04"),
        natureReserve.getBird(35, 5, 5, 30, "Bird_05")
    )
    val fishList = mutableListOf<Animal>(
        natureReserve.getFish(51, 1, 1, 4, "Fish_01"),
        natureReserve.getFish(52, 2, 2, 4, "Fish_02"),
        natureReserve.getFish(53, 3, 3, 4, "Fish_03"),
    )
    val dogList = mutableListOf<Animal>(
        natureReserve.getDog(21, 11, 1, 15, "Dog_01"),
        natureReserve.getDog(22, 12, 2, 15, "Dog_02"),
    )
    val anyAnimalList = mutableListOf<Animal>(
        natureReserve.getAnimal(10, 5, 1, 20, "Cat"),
        natureReserve.getAnimal(11, 200, 2, 20, "Cow")
    )
    println("Input N")
    val n = readln().toInt()

//    birdsList.forEach { it.printInfo() }
//    fishList.forEach { it.printInfo() }
//    dogList.forEach { it.printInfo() }

    repeat(n) {
        anyAnimalList.forEach {
            it.sleep()
            println()
            it.eat()
            println()
            it.move()
            println()
            it.printInfo()
            println()
            it.giveOffspring(currentAge = 1)
            println()
        }
    }
}