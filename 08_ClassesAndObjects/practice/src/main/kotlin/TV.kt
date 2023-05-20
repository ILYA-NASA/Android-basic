import kotlin.random.Random

class TV(private val make: String, private val model: String, private val diagonalSize: Double) {

    var power = false
        private set
    private val sizeChannelList = Random.nextInt(1, 8)
    private val channelList = Channels.getRandomChannels().subList(0, sizeChannelList)
    private var currentChanel = 0
    var volumeSound = MIN_VOLUME
        private set

    fun turnOnOffTV(power: Boolean) {
        this.power = power
    }

    fun uppVolumeSound(value: Int) {
        volumeSound = minOf(MAX_VOLUME, volumeSound + value)
    }

    fun downVolumeSound(value: Int) {
        volumeSound = maxOf(MIN_VOLUME, volumeSound - value)
    }

    fun channelSwitchToNumber(numChanel: Int) {
        val selectedChanel = numChanel - 1
        if (selectedChanel in channelList.indices) {
            currentChanel = selectedChanel
            println("Канал переключен на ${channelList[currentChanel]}")
        } else {
            println("Такого канала нет, выбери другой")
            channelSwitchToNumber(readln().toInt())
        }
    }

    fun channelSwitchToButtonUppAndDown(buttonUpp: Boolean = true) {
        if (power) {
            if (buttonUpp && currentChanel < sizeChannelList - 1) {
                currentChanel++
                println("Текущий канал ${channelList[currentChanel]}")
            } else if (!buttonUpp && currentChanel > 0) {
                currentChanel--
                println("Текущий канал ${channelList[currentChanel]}")
            } else {
                currentChanel = 0
                println("Текущий канал ${channelList[currentChanel]}")
            }
        }
        else {
            power = true
            println("Телевизор включен, текущий канал ${channelList[currentChanel]}")
        }
    }

    fun printChannelInfo() =
        channelList.forEachIndexed { index, s -> println("Канал №${index + 1} - $s") }

    fun printTVInfo() = println(
        """
        Телевизор $make $model
        Диагональ $diagonalSize
        ${if (power) "Включен" else "Выключен"} 
        """.trimIndent()
    )

    companion object {
        const val MIN_VOLUME = 0
        const val MAX_VOLUME = 50
    }

}