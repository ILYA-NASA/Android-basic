abstract class AbstractWeapon {
    abstract val maxBulletsCount: Int
    abstract val fireType: FireType
    private var bulletsClip: Stack<FireType> = Stack()
    val availableBullets = !bulletsClip.isEmpty()

    private fun createBullet() {
        bulletsClip.push(fireType)
    }
    fun reloadingWeapons() {
        bulletsClip = Stack()
        createBullet()
    }
    fun getBullet() {
        bulletsClip.pop()
    }
}