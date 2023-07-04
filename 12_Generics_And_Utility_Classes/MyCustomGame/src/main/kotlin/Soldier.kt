class Soldier : AbstractWarrior() {
    override val maxHealth = 60
    override val accuracy = 30
    override val avoidance = 50
    override val weapon = Weapons.createPistol()
    override var currentHealth = maxHealth
    override var isKilled = currentHealth <= 0

    override fun toString() =
        "Soldier (health: $currentHealth, accuracy: $accuracy, avoidance: $avoidance, weapon: pistol, ${if (isKilled) "killed" else "alive"})"
}