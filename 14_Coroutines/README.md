## Синхронный подход
каждая функция, передающая данные, прежде чем приступить к своему выполнению, ожидает окончани я выполнения предыдущей  

Преимущества:  
● операции выполняются последовательно  
● легко читать, писать, поддерживать  

Недостатки:  
● блокировка программы во время долгих операций  
● трудности при проработке сложных сценариев  

## Асинхронный подход
результат выполнения функции доступен не сразу, а через некоторое время в виде некоторого асинхронного (нарушающего обычный порядок выполнения) вызова  

Реализации:  
● Потоки выполнения  
● Функции обратного вызова (Callback)  
● Обещание результата в будущем (Future, Promise)  
● Корутины (сопрограммы)  

### :one: Поток выполнения — последовательность инструкций, которая выполняется процессором.
Каждая программа работает, по крайней мере, в одном потоке: главном потоке, в котором
она запускается.  
Программно могут быть созданы дополнительные фоновые потоки.  

![Потоки1](https://github.com/ILYA-NASA/Android-basic/assets/99810114/4a033939-fc74-4ba8-a458-9094b3df70ee)

Особенности:  
● На создание нового потока необходимы ресурсы  
● На переключение между потоками необходимы ресурсы и время  
● Необходимость синхронизации потоков для доступа к общим
данным  
● Сложность управления потоками  

В клиентских приложениях как минимум 2 потока:  
● UI-поток — главный поток, который отвечает за отрисовку интерфейса  
● Background-поток — фоновый поток, который выполняет основную тяжеловесную работу  

### :two: Функция обратного вызова (Callback) — функция, которая передаётся в аргументы другой функции и вызывается после выполнения какого-то действия для возврата управления в основную программу.
Вызываемая функция выполняет свою работу, затем обращается к функции обратного вызова.  

Особенности:  
● Callback hell — большая вложенность функций обратного вызова  
● сложность в обработке ошибок  
● код выглядит не очень привлекательно  

### :three: Обещание результата в будущем - функция возвращает специальный объект, в который после выполнения долгой операции будет помещён результат или ошибка.  

Концепция реализуется с помощью специальных типов данных в зависимости от языка программирования:  
● тип Future в Java  
● тип Task в C#  
● тип Promise в JavaScript  

Основаны на функциях обратного вызова.  

### :four: Корутина — прерываемое вычисление :arrow_left:
● Выполнение может быть приостановлено и возобновлено  
● Хранит состояние в каждый момент времени  
● Может возвращать результат своей работы  

### :warning: Для того чтобы работать с корутинами, необходимо [подключить библиотеку](https://github.com/Kotlin/kotlinx.coroutines) 

Преимущества использования корутин:  
● вычисление, а не поток. Не требует дополнительных ресурсов  
● более эффективно используют существующие потоки  
● просто отменить  
● простой механизм обработки ошибок  
● код выглядит как синхронный  

Модификатор **suspend** означает, что функция может приостановить своё выполнение,
а затем продолжить с того места, где остановилась.

### CoroutineBuilder
● **runBlocking** — запускает корутину в текущем потоке и дожидается её выполнения.  
Связывает обычный код с прерываемым  
● **launch** — создаёт и запускает корутину на выполнение.  
Не дожидается окончания выполнения корутины и её результата  
● **async** — создаёт и запускает корутину на выполнение и дожидается результата  

### **CoroutineScope** — объект, который отслеживает выполняемые внутри него корутины.
● Все корутины выполняются внутри какого-нибудь **CoroutineScope**  
● Каждый **CoroutineScope** существует до тех пор, пока запущенные в нём корутины
не завершатся  
● Отмена **CoroutineScope** приводит к отмене всех корутин внутри него  
● Каждый **CoroutineBuilder** является функцией-расширением **CoroutineScope**  

### CoroutineContext — объект, который содержит в себе набор элементов, которые определяют поведение корутины:  
● **Job** — однозначно определяет корутину и управляет её жизненным циклом  
● **CoroutineDispatcher** — диспетчер, который предоставляет потоки для выполнения
корутины  
● **CoroutineName** — название корутины  
● **CoroutineExceptionHandler** — обработчик исключений  

#### CoroutineScope можно создать одним из следующих способов:
```kt
    val scope1 = CoroutineScope(Job() + Dispatchers.Default)
    val scope2 = CoroutineScope(Job())
    val scope3 = CoroutineScope(Dispatchers.Default)
```

### CoroutineDispatcher
● **Default** — предоставляет фоновый поток. Используется для ресурсоёмких задач. Чаще всего
количество потоков равно количеству ядер процессора  
● **IO** — предоставляет фоновый поток. Используется для задач ввода-вывода: загрузка данных
из сети, запись информации на диск или в базу данных и т. д. Количество потоков может
достигать 64  
● **Main** — предоставляет UI-поток. Используется для работы с пользовательским интерфейсом  
● **Unconfined** —диспетчер, который выполняет задачи на том потоке, на котором
был запущен  

### Job — объект, который идентифицирует и управляет выполнением корутины.

![image](https://github.com/ILYA-NASA/Android-basic/assets/99810114/6c7dbf96-f2b2-45a3-a138-0e13747f9a5a)

#### Каждый вызов функции launch возвращает объект Job, который однозначно описывает запущенную корутину.
Свойства **Job**:  
● **isActive**  
● **isCancelled**  
● **isCompleted** и др.  

Функции **Job**:  
● **start**  
● **cancel**  
● **join** и др.  

### Structured concurrency
● Каждая корутина может быть запущена только внутри какого-то **CoroutineScope**  
● Ни одна из запущенных корутин не будет потеряна и не вызовет утечку памяти  
● **CoroutineScope** не может быть завершён до тех пор, пока выполняются корутины
внутри него  
● **CoroutineScope** может быть отменён, при этом будут отменены все выполняемые
в нём корутины  
● Отмена корутины необязательно приводит к отмене всего **CoroutineScope**  

### :paperclip: [Программа](https://github.com/ILYA-NASA/Android-basic/tree/master/14_Coroutines/FibonacciCoroutines/src/main/kotlin), которая [вычисляет n-е число из ряда Фибоначчи](https://github.com/ILYA-NASA/Android-basic/blob/master/14_Coroutines/FibonacciCoroutines/TASK.md) с использованием корутин.
