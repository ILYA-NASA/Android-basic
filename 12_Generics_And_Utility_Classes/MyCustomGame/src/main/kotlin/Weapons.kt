object Weapons {

    fun createPistol(): AbstractWeapon {
        return object : AbstractWeapon() {
            override val maxBulletsCount = 30
            override val fireType = FireType.SingleShot
        }
    }

    fun createGun(): AbstractWeapon {
        return object : AbstractWeapon() {
            override val maxBulletsCount = 50
            override val fireType = FireType.SingleShot
        }
    }

    fun createMachineGun(): AbstractWeapon {
        return object : AbstractWeapon() {
            override val maxBulletsCount = 100
            override val fireType = FireType.FiringBursts(maxBulletsCount)
        }
    }

    fun createRifle(): AbstractWeapon {
        return object : AbstractWeapon() {
            override val maxBulletsCount = 5
            override val fireType = FireType.SingleShot
        }
    }
}