class Soldier : AbstractWarrior() {
    override val maxHealth = 60
    override val chanceOfMiss = 30
    override val hitAccuracy = 50
    override val weapon: AbstractWeapon = Weapons.createPistol()
    override var currentHealth = maxHealth
    override val isKilled = currentHealth <= 0
}