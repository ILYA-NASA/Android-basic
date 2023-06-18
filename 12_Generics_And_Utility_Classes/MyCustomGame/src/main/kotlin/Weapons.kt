object Weapons {

    fun createPistol(): AbstractWeapon {
        return object: AbstractWeapon() {
            override val maxBulletsCount: Int
                get() = TODO("Not yet implemented")
            override val fireType: FireType
                get() = TODO("Not yet implemented")

            override fun createBullet(): Int {
                TODO("Not yet implemented")
            }
        }
    }

    fun createGun(): AbstractWeapon {
        return object: AbstractWeapon() {
            override val maxBulletsCount: Int
                get() = TODO("Not yet implemented")
            override val fireType: FireType
                get() = TODO("Not yet implemented")

            override fun createBullet(): Int {
                TODO("Not yet implemented")
            }
        }
    }

    fun createMachineGun(): AbstractWeapon {
        return object: AbstractWeapon() {
            override val maxBulletsCount: Int
                get() = TODO("Not yet implemented")
            override val fireType: FireType
                get() = TODO("Not yet implemented")

            override fun createBullet(): Int {
                TODO("Not yet implemented")
            }
        }
    }

    fun createRifle(): AbstractWeapon {
        return object: AbstractWeapon() {
            override val maxBulletsCount: Int
                get() = TODO("Not yet implemented")
            override val fireType: FireType
                get() = TODO("Not yet implemented")

            override fun createBullet(): Int {
                TODO("Not yet implemented")
            }
        }
    }

}