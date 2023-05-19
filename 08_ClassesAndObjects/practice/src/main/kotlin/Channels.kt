object Channels {

    private val channelList = listOf<String>(
        "первый", "второй", "третий", "четвертый", "пятый", "шестой", "седьмой", "восьмой", "девятый"
    )

    fun getRandomChannels()  = channelList.shuffled()
}