class Captain : AbstractWarrior() {
    override val maxHealth = 80
    override val chanceOfMiss = 50
    override val hitAccuracy = 70
    override val weapon = Weapons.createMachineGun()
    override var currentHealth = maxHealth
    override val isKilled = currentHealth <= 0
}