import kotlin.random.Random

//Разработайте консольную программу, имитирующую работу телефонного справочника.

//1. Введите число N с клавиатуры. Вводимые символы должны проверяться на соответствие условию N > 0.
fun main() {
    print("Введите натуральное число: ")
    var n = readln().toInt()
// В случае невыполнения условия программа должна указывать на ошибку ввода и предлагать ввести число до тех пор,
// пока не будет введено корректное значение.
    while (n <= 0) {
        print("Введите число > 0: ")
        n = readln().toInt()
    }
    val telephoneList = telephoneNumberGenerator(n)
    taskFilterTelephoneNumber(telephoneList)
    printUniqueTelephoneNumbers(telephoneList)
    printSumLengthTelNum(telephoneList)
    println()
    val telephoneMap = getPhoneBook(telephoneList.toSet() as MutableSet<String>)
//10. По желанию выведите содержимое Map, отсортированное по номерам телефона.
    println("\nСодержимое записной книжки (отсортированное по номерам телефонов):")
    for ((k, v) in telephoneMap.toSortedMap()) {
        println("Абонент: $v. Номер телефона: +$k")
    }
//11. По желанию выведите содержимое Map, отсортированное по имени абонента.
    println("\nСодержимое записной книжки (отсортированное по именам):")
    for ((k, v) in telephoneMap.toList().sortedBy { (_, value) -> value}.toMap()) {
        println("Абонент: $v. Номер телефона: +$k")
    }
}

//2. Введите следующие N телефонных номеров пользователей. Каждый номер должен представлять из себя строку.
//3. Сохраните введённые номера в список. Используйте для этого MutableList. Заносите в него значения с помощью цикла.
//4. Вынесите шаги 2 и 3 в функцию, которая принимает число N и возвращает список из N номеров телефонов,
// введённых с клавиатуры.
fun telephoneNumberGenerator(n: Int): MutableList<String> {
    val telephoneNumberList = mutableListOf<String>()
    repeat(n) {
        telephoneNumberList.add("+${Random.nextLong(10000000000, 99999999999)}")
    }
    println("\nСписок телефонных номеров:\n${telephoneNumberList.joinToString("\n")}")
    return telephoneNumberList
}

//5. Выведите в консоль только номера телефонов, начинающиеся с приставки +7.
// Для этого отфильтруйте список с помощью функции filter и распечатайте его.
fun taskFilterTelephoneNumber(numberList: MutableList<String>) =
    if (numberList.none { it.startsWith("+7") }) println("\nНомеров, которые начинаются на +7 НЕТ") else
        println("\nНомера, которые начинаются на +7:\n${numberList.filter { it.startsWith("+7") }.joinToString("\n")}")

//6. Выведите в консоль количество уникальных введённых номеров.
// Для этого преобразуйте список в множество c помощью функции toSet() и получите размер множества size.
fun printUniqueTelephoneNumbers(numberList: MutableList<String>) =
    println("\nУникальные телефонные номера (${numberList.size} шт):\n${numberList.toSet().joinToString("\n")}")

//7. Вычислите и распечатайте сумму длин всех номеров телефонов с помощью агрегирующей функции коллекции sumOf.
fun printSumLengthTelNum(numberList: MutableList<String>) =
    println("\nСумма длин номеров телефонов равна ${numberList.sumOf { it.length }}")

//8. Создайте изменяемое представление — MutableMap.
// Для каждого уникального номера из множества введите имя человека и заполните Map так,
// чтобы в качестве ключа выступал номер телефона, а в качестве значения — введённое с консоли имя человека.
//Пример работы:
//Введите имя человека с номером телефона +79110123456: Андрей
//Введите имя человека с номером телефона +79229876543: Олег
//По окончании ввода Map должно содержать записи:
//(key=+79110123456, value:Андрей)
//(key=+79229876543, value:Олег)
//9. Выведите содержимое Map в консоль в следующем виде:
//Абонент: Андрей. Номер телефона: +79110123456
//Абонент: Олег. Номер телефона: +79229876543
fun getPhoneBook(numberSet: MutableSet<String>): MutableMap<Long, String> {
    val phoneMap = mutableMapOf<Long, String>()
    numberSet.forEach {
        println("Введите имя человека с номером телефона $it:")
        phoneMap[it.toLong()] = readln()
    }
    return phoneMap
}