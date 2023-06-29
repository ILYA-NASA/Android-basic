interface Warrior {
    val isKilled: Boolean
    val avoidance: Int
    val accuracy: Int

    fun makeAttack(warrior: AbstractWarrior)
    fun takeDamage(damage: Int)
}