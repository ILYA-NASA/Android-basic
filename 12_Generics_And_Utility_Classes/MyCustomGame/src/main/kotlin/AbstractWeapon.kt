abstract class AbstractWeapon {
    abstract val maxBulletsCount: Int
    abstract val fireType: FireType
    private var bulletsClip: Stack<Ammo> = Stack()
    var bulletsInClip = bulletsClip.isNotEmpty()

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

    fun getBulletsClipCount() = bulletsClip.getCountElements()

    fun reload() {
        bulletsClip = Stack()
        createBullet(fireType)
        bulletsInClip = bulletsClip.isNotEmpty()
    }

    fun getBullet() = if (bulletsInClip) bulletsClip.pop()!! else throw NoAmmoException()

}