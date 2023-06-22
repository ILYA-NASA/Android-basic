abstract class AbstractWeapon {
    abstract val maxBulletsCount: Int
    abstract val fireType: FireType
    private var bulletsClip: Stack<FireType> = Stack()
    val bulletsInClip = !bulletsClip.isEmpty()

    private fun createBullet() {
        bulletsClip.push(fireType)
    }
    fun reload() {
        bulletsClip = Stack()
        createBullet()
    }
    fun getBullet() {
        bulletsClip.pop()
    }
}