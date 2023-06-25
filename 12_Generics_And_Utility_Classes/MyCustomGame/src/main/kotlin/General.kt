class General : AbstractWarrior() {
    override val maxHealth = 100
    override val chanceOfMiss = 70
    override val hitAccuracy = 90
    override val weapon: AbstractWeapon = Weapons.createGun()
    override var currentHealth = maxHealth
    override val isKilled = currentHealth <= 0

    override fun makeDamage() {
        TODO("Not yet implemented")
    }
}