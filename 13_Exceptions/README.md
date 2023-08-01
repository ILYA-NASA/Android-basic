### Исключение — возникновение ошибки или непредвиденной ситуации.
Пример:  
● **IndexOutOfBoundsException** — исключение, которое возникает при попытке обращения
к элементу списка по несуществующему индексу  
● **StackOverflowError** — исключение, которое возникает при переполнении стека вызовов  

### Иерархия исключений 
![Throwable](https://github.com/ILYA-NASA/Android-basic/assets/99810114/4a5d9188-6231-4378-bad1-cd29d414c951)

### Способы обработки исключений
● Оператор try-catch-finally. Классический способ обработки исключений  
● Функция runCatching  

### Структура исключения  
● Название и тип исключения  
● Дополнительная информация (необязательная)  
● Последовательность вызовов — stack trace  

### :paperclip: [Приложение](https://github.com/ILYA-NASA/Android-basic/tree/master/13_Exceptions/wheel_sensor/src/main/kotlin), имитирующее [данные датчика колеса](https://github.com/ILYA-NASA/Android-basic/blob/master/13_Exceptions/wheel_sensor/TASK.md), с [кастомным](https://github.com/ILYA-NASA/Android-basic/blob/master/13_Exceptions/wheel_sensor/src/main/kotlin/TooLowPressure.kt) исключениям и его обработкой.  
