fun main() {

    val firstTV = TV("LG", "NANO", 49.5)
    firstTV.turnOnOffTV(true)
    firstTV.printTVInfo()
    repeat(6) { firstTV.uppVolumeSound(10) }
    println("Громкость + 60 = ${firstTV.volumeSound}")
    repeat(2) { firstTV.downVolumeSound(10) }
    println("Громкость - 20 = ${firstTV.volumeSound}")
    repeat(4) { firstTV.downVolumeSound(10) }
    println("Громкость - 40 = ${firstTV.volumeSound}")
    firstTV.printChannelInfo()
    firstTV.channelSwitchToButtonUppAndDown()
    firstTV.channelSwitchToButtonUppAndDown(false)
//    userTV.channelSwitchToNumber(10)

    println()
    val secondTV = TV("Samsung", "NEO", 55.0)
    secondTV.turnOnOffTV(false)
    secondTV.printTVInfo()
    repeat(6) { secondTV.uppVolumeSound(10) }
    println("Громкость + 60 = ${secondTV.volumeSound}")
    repeat(2) { secondTV.downVolumeSound(10) }
    println("Громкость - 20 = ${secondTV.volumeSound}")
    repeat(4) { secondTV.downVolumeSound(10) }
    println("Громкость - 40 = ${secondTV.volumeSound}")
    secondTV.printChannelInfo()
    secondTV.channelSwitchToButtonUppAndDown()
    secondTV.channelSwitchToButtonUppAndDown()
    secondTV.channelSwitchToNumber(5)

}