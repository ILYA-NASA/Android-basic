class Captain : AbstractWarrior() {
    override val maxHealth = 80
    override val accuracy = 50
    override val avoidance = 70
    override val weapon = Weapons.createMachineGun()
    override var currentHealth = maxHealth
    override val isKilled = currentHealth <= 0

    override fun toString() =
        "Captain (health: $currentHealth, accuracy: $accuracy, avoidance: $avoidance, weapon: machine gun, ${if (isKilled) "killed" else "alive"})"
}