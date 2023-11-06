### Fragment — это часть интерфейса, которая встраивается в activity, имеет свой жизненный цикл, разметку и может быть переиспользована.  

Плюсы использования Fragment:  
● Возможность разделения экрана на несколько частей  
● Возможность переиспользовать код фрагмента в других
[activity](https://github.com/ILYA-NASA/Android-basic/blob/master/16_HelloAndroid/README.md#activity)  или fragment  
● Более гибкое управление по сравнению с activity

![image](https://github.com/ILYA-NASA/Android-basic/assets/99810114/4bc7ab5c-37e3-4fca-8d65-d797868c8acf)

### FragmentManager — класс, который отвечает за добавление, удаление и переключение фрагментов.
### FragmentTransaction — класс, который описывает процесс перехода между фрагментами.
### [AndroidX Navigation](https://developer.android.google.cn/reference/kotlin/androidx/navigation/package-summary) — офциальная библиотека Google, рекомендованная к использованию во всех проектах.

## :arrow_down: Переход от кастомных решений к библиотеке NavigationX 
Для интегрирации библиотеки AndroidX Navigation в проект требуется выполнить следующие шаги: 

### Шаг 1. Подключить библиотеку AndroidX
Для этого в файле build.gradle уровня приложения необходимо добавить зависимости и синхронизировать проект:
```xml
implementation "androidx.navigation:navigation-fragment-ktx:2.7.5"
implementation "androidx.navigation:navigation-ui-ktx:2.5.3"
``` 
Актуальный номер версии библиотеки и дополнительную информацию о её подключении можно узнать [по ссылке](https://developer.android.com/guide/navigation/get-started#Set-up).

### Шаг 2. Создать граф переходов
Граф переходов (navigation graph) — это файл ресурсов, в котором описываются все необходимые экраны и переходы между ними для создания навигации по приложению.   
Android Studio генерирует этот файл при создании нового проекта с помощью шаблонов. Если проект уже существует, то этот файл необходимо создать вручную.  
Файл такого типа нужно расположить внутри папки res в подпапке navigation.   
  
_Кликните правой кнопкой мыши на каталоге res вашего проекта и выберите пункты New → Android Resource Directory._  
![image](https://github.com/ILYA-NASA/Android-basic/assets/99810114/f8bac899-e6ee-4f7d-b0b4-df23cb834050)

_В появившемся окне из выпадающего списка выберите пункт navigation._
![image](https://github.com/ILYA-NASA/Android-basic/assets/99810114/d194ae0b-8d52-46aa-a358-3b001aad5bcc)

_В каталоге res появится одноимённая папка. Кликните правой кнопкой мыши на папке navigation и выберите пункты New → Navigation Resource File._  
![image](https://github.com/ILYA-NASA/Android-basic/assets/99810114/133bfef5-1703-4cab-b675-3a42fc87881c)

_Укажите имя для файла. Именем по умолчанию принято считать nav_graph, но вы можете выбрать любое другое.  
Например, main_navigation или main_graph.  
Главное, чтобы имя файла отражало его назначение._

:warning: Обратите внимание: navigation graph описывает навигацию только внутри одной Activity. Если у вас в проекте несколько Activity, то для каждой из них может понадобиться собственный navigation graph.

Если вам когда-нибудь понадобится интегрировать AndroidX Navigation в большой проект, то вы можете использовать фичу этой библиотеки — определить несколько графов переходов.  
Для этого разделите переходы на логические группы и создайте для каждой из них отдельный navigation graph.  
  
Подробнее про графы:  
* [Design navigation graphs](https://developer.android.com/guide/navigation/design/design-graph)  
* [Nested navigation graphs](https://developer.android.com/guide/navigation/design/nested-graphs)

### Шаг 3. Настраиваем Activity
Одной из основных частей библиотеки навигации является Navigation Host. Это пустой контейнер, внутри которого переключаются экраны (Destinations) во время использования приложения.   
Необходимо настроить Navigation Host и Activity, внутри которой будут отображаться фрагменты.  
Для этого:  
* Добавьте в разметку Activity компонент FragmentContainerView.  
* Добавьте атрибут android:name="androidx.navigation.fragment.NavHostFragment".  
* NavHostFragment — это специальный фрагмент, стандартная реализация контейнера Navigation Host.  
* Добавьте атрибут app:navGraph=”@navigation/nav_graph”.  
В качестве значения используйте ваш созданный файл навигации.  
Это свяжет компонент Navigation Host с вашим графом и позволит осуществлять переходы между описанными в нём экранами.  
* Добавьте атрибут app:defaultNavHost="true".  
Это позволит вашему Navigation Host перехватывать нажатия на системную кнопку Back Button и перемещаться назад по стеку фрагментов.  
  
Настроенный Navigation Host может выглядеть так:  
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.fragment.app.FragmentContainerView xmlns:android="http://schemas.android.com/apk/res/android"
   xmlns:app="http://schemas.android.com/apk/res-auto"
   xmlns:tools="http://schemas.android.com/tools"
   android:id="@+id/nav_host"
   android:name="androidx.navigation.fragment.NavHostFragment"
   android:layout_width="match_parent"
   android:layout_height="match_parent"
   app:defaultNavHost="true"
   app:navGraph="@navigation/nav_graph" />
```

:warning: Обратите внимание: FragmentContainerView — это контейнер для фрагментов.  
Если посмотреть на его реализацию, то вы увидите, что он — всего лишь расширенный FrameLayout, поэтому используется только для переключения фрагментов.  
Остальные элементы UI, такие как Toolbar, BottomNavigationView и любые другие View и ViewGroup, должны учитывать эту иерархию.  
  
Итоговая разметка Activity может быть сложнее, так как FragmentContainerView — это FrameLayout.  
Он может встраиваться в любые другие контейнеры: FrameLayout, ConstraintLayout и другие ViewGroup.  
  
### Шаг 4. Добавляем Destinations
После настройки Navigation Host можно начать добавление фрагментов в граф переходов.  
Каждый экран, который вы хотите отобразить (фрагмент, активити или диалог) будет обозначаться термином Destination в терминологии AndroidX Navigation.  
Navigation Graph содержит все Destinations и переходы между ними.  
  
Чтобы добавить Destination, можно воспользоваться дизайнером, открыв ваш файл навигации:  
![image](https://github.com/ILYA-NASA/Android-basic/assets/99810114/1c0e51d1-f8b7-4998-b018-a60c6a7f9d2b)

Добавьте имеющийся в проекте MainFragment в качестве Destination и переключитесь на вкладку code, чтобы рассмотреть содержимое.  
Добавленный фрагмент описывается с помощью тега <fragment> и его атрибутов:  

```xml
<?xml version="1.0" encoding="utf-8"?>
<navigation xmlns:android="http://schemas.android.com/apk/res/android"
   xmlns:app="http://schemas.android.com/apk/res-auto"
   xmlns:tools="http://schemas.android.com/tools"
   android:id="@+id/nav_graph"
   app:startDestination="@id/mainFragment">


   <fragment
       android:id="@+id/mainFragment"
       android:name="com.example.skillbox_hw_quiz.ui.main.MainFragment"
       android:label="main_fragment"
       tools:layout="@layout/main_fragment" />
</navigation>
```

:warning: Обратите внимание: к компоненту <navigation> добавился атрибут startDestination после добавления первого Destination.  
Это обязательный атрибут, он описывает первый экран — точку с которой начинается навигация по текущему графу переходов.  
  
По мере добавления фрагментов в проект необходимо также описывать их внутри графа переходов и настраивать переходы между ними.  
  
Подробнее о создании и переходов между Destinations:  
* [Create destinations](https://developer.android.com/guide/navigation/design/create-destinations)
* [Navigate to a destination](https://developer.android.com/guide/navigation/use-graph/navigate)

### Шаг 5. Избавиться от FragmentTransactions
Текущий проект использует стандартные FragmentTransactions для организации переходов между фрагментами.  
  
Подобный код вы можете найти в файле MainActivity.kt:  

```kt
if (savedInstanceState == null) {
   supportFragmentManager.beginTransaction()
       .replace(R.id.container, MainFragment.newInstance())
       .commitNow()
}
```

Библиотека AndroidX Navigation берёт на себя всю работу с переходами и транзакциями, поэтому необходимо заменить все вызовы транзакций на аналогичные вызовы функций AndroidX Navigation.  
В приведённом выше коде происходит установка стартового фрагмента с помощью FragmentTransaction.  
Мы подключили библиотеку навигации, настроили Navigation Host и Activity, создали navigation graph, указали в нём стартовый экран и связали navigation graph c Navigation Host, поэтому этот код в Activity нам больше не понадобится, его можно смело удалить.  
  
В итоге, минимально необходимый код будет выглядеть так: 

```kt
override fun onCreate(savedInstanceState: Bundle?) {
   super.onCreate(savedInstanceState)
   setContentView(R.layout.main_activity)
}
```

### Конец интеграции и запуск проекта!
Запустите проект.  
Если всё настроено верно, то вы увидите свою Activity и стартовый MainFragment.  
При этом нет никакого кода для управления транзакциями, а вся работа происходит исключительно через файл navigation graph.  
