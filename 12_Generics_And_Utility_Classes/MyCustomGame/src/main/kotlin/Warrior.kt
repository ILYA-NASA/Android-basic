interface Warrior {
    var isKilled: Boolean
    val avoidance: Int
    val accuracy: Int

    fun makeAttack(warrior: AbstractWarrior)
    fun takeDamage(damage: Int)
}