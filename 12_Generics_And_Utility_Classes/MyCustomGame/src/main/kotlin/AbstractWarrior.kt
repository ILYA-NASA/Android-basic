abstract class AbstractWarrior : Warrior {
    abstract val maxHealth: Int
    abstract val hitAccuracy: Int
    abstract val weapon: AbstractWeapon
    protected abstract var currentHealth: Int

    override fun makeAttack(warrior: Warrior) {
        if (weapon.bulletsInClip) {
            makeDamage()
        } else {
            weapon.reload()
            return
        }
    }

    fun makeDamage(): Int = weapon.getBullet().getCurrentDamage()

    override fun takeDamage(damage: Int) {
        currentHealth -= damage
    }
}