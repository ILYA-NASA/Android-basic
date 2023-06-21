interface Warrior {
    val isKilled: Boolean
    val chanceOfMiss: Int

    fun makeAttack(warrior: Warrior)
    fun takeDamage(damage: Int)
}