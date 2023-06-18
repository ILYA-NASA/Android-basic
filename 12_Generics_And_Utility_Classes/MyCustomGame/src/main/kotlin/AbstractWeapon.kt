abstract class AbstractWeapon {
    abstract val maxBulletsCount: Int
    abstract val fireType: FireType
    private val bulletsClip: Stack<Int> = Stack()
    val availableBullets = bulletsClip.isEmpty()

    abstract fun createBullet(): Int
    fun reloadingWeapons() {
        bulletsClip.push(createBullet())
    }
    fun getBullet() {
        bulletsClip.pop()
    }
}