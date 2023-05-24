fun main() {
    val cat = Animal(10, 5.5, 5, 20, "Musya")
    cat.printInfo()
    cat.eat()
    cat.move()
    cat.sleep()
    cat.giveOffspring(currentAge = 1)

    println()
    val bird = Bird(30, 0.8, 1, 30, "Kesha")
    bird.printInfo()
    bird.move()

    println()
    val fish = Fish(50, 0.01, 0, 4, "Golden")
    fish.printInfo()
    fish.move()

    println()
    val dog = Dog(25, 10.0, 3, 15, "Ball")
    dog.printInfo()
    dog.move()
}