class General : AbstractWarrior() {
    override val maxHealth = 100
    override val accuracy = 70
    override val avoidance = 90
    override val weapon: AbstractWeapon = Weapons.createGun()
    override var currentHealth = maxHealth
    override val isKilled = currentHealth <= 0
}