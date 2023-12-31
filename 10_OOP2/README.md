### Абстрагировать — значит объединить только существенные и главные признаки (саму суть) и отбросить всё незначительное.
### Абстракция — это результат абстрагирования, теоретическое обобщение, результат выделения существенных признаков.

Примеры абстракции на примере языков программирования:  
● Языки машинных кодов  
● Языки ассемблера  
● Языки программирования высокого уровня и компиляторы  
● Виртуальные машины и языки ещё более высокого уровня  
Каждая новая более сложная абстракция базируется на предыдущей.  
### ❗Это позволяет решать более сложные задачи, т.к. решение простых задач уже абстрагировано.  

В качестве абстракции можно рассматривать:  
● функцию  
● класс  
● модуль  
● любой другой компонент программы  
● всю программу целиком  

Уровни абстракции:  
● Количество уровней абстракции напрямую влияет на сложность программы  
● Уровни позволяют просто расширять и изменять программу, поскольку
они не зависят от деталей реализации  
● **Преждевременное абстрагирование = преждевременное усложнение программы** :warning:

### Абстракция в ООП — это описание объекта с использованием только тех его характеристик, которые с достаточной точностью его представляют.
В ООП по большей части работа происходит именно с абстракциями, а не с конкретными объектами.  

### Абстрактный класс — базовый, родительский класс, который не предполагает создания экземпляров.
Он может содержать абстрактные поля и методы, а также обычные поля и методы. Если класс
наследуется от абстрактного, то он должен реализовать абстрактные члены абстрактного класса,
либо сам должен быть абстрактным.  
### Абстрактная функция — функция, которая не имеет тела. 
Такая функция может быть объявлена только в абстрактном классе и обязательно должна быть реализована ниже в иерархии.
### Абстрактное поле — поле, которое не имеет значения. 
Оно может быть объявлено только в абстрактном классе и обязательно должно быть определено ниже в иерархии.  

Абстрактные классы, методы и поля помечаются модификатором **abstract**

```kt
abstract class BankCard {
    abstract val balance: Double
    abstract val purchase: Double

    abstract fun addMoney(money: Double)
    abstract fun toPay(money: Double)
}
```

### :paperclip: Особенности работы с абстрактными классами [на практике](https://github.com/ILYA-NASA/Android-basic/tree/master/10_OOP2/untitled/src/main/kotlin) в виде [иерархии классов банковских карт](https://github.com/ILYA-NASA/Android-basic/blob/master/10_OOP2/untitled/TASK.md).
