//У класса следующие свойства:
//марка, модель, размер диагонали — эти свойства доступны для чтения
class TV(private val make: String, private val model: String, private val diagonalSize: Double) {

    //    включён/выключен — свойство доступно для чтения и недоступно для записи;
    var power = false
        private set

    //    список каналов — внутреннее свойство телевизора, недоступно для чтения;
    private val channelList = Channels.getRandomChannels()

    private var currentChanel = 0

    var volumeSound = MIN_VOLUME
        private set

    //    Класс обладает следующими функциями:
    /**
     * включение/выключение;
     */
    fun turnOnOffTV(power: Boolean) {
        this.power = power
    }

    /**
     * увеличение громкости на заданную величину;
     */
    fun uppVolumeSound(value: Int) {
        volumeSound = minOf(MAX_VOLUME, volumeSound + value)
    }

    /**
     * уменьшение громкости на заданную величину;
     */
    fun downVolumeSound(value: Int) {
        volumeSound = maxOf(MIN_VOLUME, volumeSound - value)
    }

    /**
     * переключение канала на заданный (аналог нажатия кнопки с цифрой канала на пульте);
     * если телевизор выключен, то использование этой функции включает телевизор и переключает канал на заданный;
     */
    fun channelSwitchToNumber(numChanel: Int) {
        val selectedChanel = numChanel - 1
        if (selectedChanel in channelList.indices) {
            currentChanel = selectedChanel
            println(channelList[currentChanel])
        }
        else {
            println("Такого канала нет, выбери другой")
            channelSwitchToNumber(readln().toInt())
        }
    }

    /**
     * переключение каналов в порядке возрастания и убывания
     * (аналог нажатия кнопок переключения каналов «Вверх» и «Вниз» на пульте);
     * если телевизор выключен, то использование этих функций включает телевизор на канале, который был до выключения;
     * переключение каналов непрерывно: после последнего канала включается первый из списка;
     */
    fun channelSwitchToButtonUppAndDown(buttonUpp: Boolean = true) {
        if (power) {
            if (buttonUpp) {
                currentChanel++
                println("Текущий канал ${channelList[currentChanel]}")
            } else {
                currentChanel--
                println("Текущий канал ${channelList[currentChanel]}")
            }
        } //TODO непрерывное переключение каналов
        else {
            power = true
            println("Телевизор включен, текущий канал ${channelList[currentChanel]}")
        }
    }

    /**
     * представление списка каналов в виде порядковый номер - название_канала для отображения.
     */
    fun printChannelInfo() =
        channelList.forEachIndexed { index, s -> println("Канал №${index + 1} - $s") }

    fun printTVInfo() = println(
        """
        Телевизор $make $model
        Диагональ $diagonalSize
        ${if (power) "Включен" else "Выключен"} 
        """.trimIndent()
    )

    //    максимальная громкость — внутреннее свойство, значение константное,
    //    поэтому располагается в объекте-компаньоне этого класса.
    companion object {
        const val MIN_VOLUME = 0
        const val MAX_VOLUME = 50
    }

}