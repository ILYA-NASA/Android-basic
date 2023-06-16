enum class Ammo(
    private val damage: Int,
    criticalDamageChance: Int,
    private val criticalDamageCoefficient: Int,
) {
    SMALL_BULLET(5, 50, 2),
    MEDIUM_BULLET(10, 25, 3),
    LARGE_BULLET(20, 10, 5);

    private val criticalDamage = criticalDamageChance.getRandomChance()
    fun getCurrentDamage() =
        if (criticalDamage) damage * criticalDamageCoefficient
        else damage
}