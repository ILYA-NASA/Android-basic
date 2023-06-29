class Soldier : AbstractWarrior() {
    override val maxHealth = 60
    override val accuracy = 30
    override val avoidance = 50
    override val weapon = Weapons.createPistol()
    override var currentHealth = maxHealth
    override val isKilled = currentHealth <= 0
}