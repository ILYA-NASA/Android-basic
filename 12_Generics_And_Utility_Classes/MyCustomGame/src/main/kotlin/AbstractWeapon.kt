abstract class AbstractWeapon {
    abstract val maxBulletsCount: Int
    abstract val fireType: FireType
    private var bulletsClip: Stack<Ammo> = Stack()
    val bulletsInClip = !bulletsClip.isEmpty()

    private fun createBullet(fireType: FireType) {
        repeat(maxBulletsCount) {
            bulletsClip.push(
                when (fireType) {
                    is FireType.SingleShot -> Ammo.SMALL_BULLET
                    is FireType.FiringBursts -> Ammo.MEDIUM_BULLET
                }
            )
        }
    }

    fun reload() {
        bulletsClip = Stack()
        createBullet(fireType)
    }

    fun getBullet(): Ammo = bulletsClip.pop()!!

}