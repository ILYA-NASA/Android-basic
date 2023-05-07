//Напишите программу, которая работает с рассмотренными типами данных с помощью изменяемых и неизменяемых переменных.

const val DEFAULT_HEIGHT = 150
const val DEFAULT_WEIGHT = 40

fun main() {

//Создайте переменную firstName с типом String, которая ссылается на строку с вашим именем.
    val firstName = "Илья "

//Создайте переменную lastName с типом String, которая ссылается на строку с вашей фамилией.
    val lastName = "Насалевич"

//Создайте переменную height с типом Double, которая хранит ваш рост в метрах и изменяется.
    var height = 172.0

//Создайте переменную weight с типом Float, которая хранит ваш вес в килограммах.
    val weight = 77.7f

//Создайте переменную isChild с типом Boolean, которая хранит значение, указывающее, что вы ребёнок.
//Значение переменной должно вычисляться исходя из значений переменных height и weight.
//Считайте, что человек является ребёнком, если рост меньше 150 см или вес меньше 40 кг.
    var isChild = height < DEFAULT_HEIGHT || weight < DEFAULT_WEIGHT

//Создайте переменную info, которая хранит строку с информацией о вас.
// В строке должна быть вся информация, доступная из переменных firstName, lastName, height, weight, isChild.
// Используйте для этого строковые шаблоны.
    var info = "Hello!\n" +
            "My name is ${firstName + lastName}\n" +
            "My dimensions $height X $weight\n" +
            if (isChild) "and i'm child" else "and i'm not child"

//Выведите значение переменной info в консоль.
    println(info)

//Измените значение переменной height после вывода информации из info.
    height -= DEFAULT_HEIGHT

//Вновь вызовите вывод информации об info на экран, убедитесь, что в консоль вывелось обновлённое значение.
//    println(info)

//По желанию. Добейтесь, чтобы информация в переменной isChild обновилась.
    isChild = height < DEFAULT_HEIGHT || weight < DEFAULT_WEIGHT

//По желанию. Добейтесь, чтобы информация на экране согласно п. 9 обновилась.
    info = "Hello!\n" +
            "My name is ${firstName + lastName}\n" +
            "My dimensions $height X $weight\n" +
            if (isChild) "and i'm child" else "and i'm not child"
    println()
    println(info)

}