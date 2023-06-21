sealed class FireType {
    object SingleShot : FireType()
    data class FiringBursts(val firingBurstsSize: Int) : FireType()
}
