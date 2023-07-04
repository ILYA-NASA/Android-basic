abstract class AbstractWarrior : Warrior {
    abstract val maxHealth: Int
    abstract val weapon: AbstractWeapon
    abstract var currentHealth: Int

    override fun makeAttack(warrior: AbstractWarrior) {
        if (weapon.bulletsInClip) {
            warrior.takeDamage(makeDamage())
        } else {
            weapon.reload()
        }
    }

    private fun makeDamage() = weapon.getBullet().getCurrentDamage()

    override fun takeDamage(damage: Int) {
        currentHealth -= damage
        isKilled = currentHealth <= 0
    }

    abstract override fun toString(): String
}