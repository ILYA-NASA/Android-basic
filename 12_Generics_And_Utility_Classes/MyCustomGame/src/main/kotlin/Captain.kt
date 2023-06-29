class Captain : AbstractWarrior() {
    override val maxHealth = 80
    override val accuracy = 50
    override val avoidance = 70
    override val weapon = Weapons.createMachineGun()
    override var currentHealth = maxHealth
    override val isKilled = currentHealth <= 0
}