sealed class FireType {
    object SingleShot : FireType()
    data class FiringBursts(val FiringBurstsSize: Int) : FireType()
}
