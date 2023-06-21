abstract class AbstractWarrior : Warrior {
    abstract val maxHealth: Int
    abstract override val chanceOfMiss: Int
    abstract val hitAccuracy: Int
    abstract val weapon: AbstractWeapon
    protected abstract var currentHealth: Int

    override fun makeAttack(warrior: Warrior) {
        if (!weapon.availableBullets) {
            weapon.reloadingWeapons()
            return
        } else {
            weapon.getBullet()
    //        Для каждого из них проверить, соответствует ли патрон точности война и уклонению противника.
    //        Для патронов, которые попадают в противника, рассчитать суммарный урон.
        }
    }

    abstract fun causeDamage()

    override fun takeDamage(damage: Int) {
        currentHealth -= damage
    }
}