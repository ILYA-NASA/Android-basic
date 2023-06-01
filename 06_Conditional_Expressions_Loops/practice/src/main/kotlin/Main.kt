//Разработайте цикл и напишите программу, которая вычисляет n-е число из ряда Фибоначчи.

//1. Число n должно вводиться с клавиатуры. Вводимые символы должны проверяться на соответствие условию n > 0.
// В случае невыполнения условия программа должна указывать на ошибку ввода и предлагать ввести число до тех пор,
// пока не будет введено корректное значение.
//2. Вычислите нужный член последовательности с помощью формулы F(n) = F(n-1) + F(n-2) и цикла.
//3. Выведите рассчитанное значение в консоль. Убедитесь, что число рассчитано верно, проверив его по таблице чисел Фибоначчи.
// Поэкспериментируйте с разными n.

fun main() {
    println("Введите натуральное число")
    var inputNumber = readln().toInt()
    while (inputNumber <= 0) {
        println("Введите число, которое больше нуля")
        inputNumber = readln().toInt()
    }
    println("В последовательности Фибоначчи введенное число равно ${fibonacciCalculation(inputNumber)}")
}

fun fibonacciCalculation(n: Int): Int = if (n == 0 || n == 1) n
else fibonacciCalculation(n - 1) + fibonacciCalculation(n - 2)