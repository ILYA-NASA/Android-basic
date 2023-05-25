fun main() {
//    val cat = Animal(10, 5.5, 5, 20, "Musya")
//    cat.printInfo()
//    cat.eat()
//    cat.move()
//    cat.sleep()
//    cat.giveOffspring(currentAge = 1)
//
//    println()
//    val bird = Bird(30, 0.8, 1, 30, "Kesha")
//    bird.printInfo()
//    bird.move()
//
//    println()
//    val fish = Fish(50, 0.01, 0, 4, "Golden")
//    fish.printInfo()
//    fish.move()

//    println()
//    val dog = Dog(25, 10.0, 3, 15, "Ball")
//    dog.printInfo()
//    dog.move()
//    val dogOffspring = dog.giveOffspring(currentAge = 1)
//    dogOffspring.sleep()

    val natureReserveList = mutableListOf<NatureReserve>(
        NatureReserve().getBird(31, 0.1, 1, 30, "Kesha_01"),
        NatureReserve().getBird(32, 0.2, 2, 30, "Kesha_02"),
        NatureReserve().getBird(33, 0.3, 3, 30, "Kesha_03"),
        NatureReserve().getBird(34, 0.4, 4, 30, "Kesha_04"),
        NatureReserve().getBird(35, 0.5, 5, 30, "Kesha_05"),
        NatureReserve().getFish(51, 0.01, 1, 4, "Golden_01"),
        NatureReserve().getFish(52, 0.02, 2, 4, "Golden_02"),
        NatureReserve().getFish(53, 0.03, 3, 4, "Golden_03"),
        NatureReserve().getDog(21, 11.0, 1, 15, "Ball_01"),
        NatureReserve().getDog(22, 12.0, 2, 15, "Ball_02"),
        NatureReserve().getAnimal(10, 5.5, 1, 20, "Cat"),
        NatureReserve().getAnimal(11, 200.0, 2, 20, "Cow")
    )
    natureReserveList.forEach { it }
    NatureReserve().getAnimal(11, 200.0, 2, 20, "Cow").printInfo()

}