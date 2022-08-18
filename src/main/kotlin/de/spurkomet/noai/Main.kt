package de.spurkomet.noai

import de.spurkomet.noai.noai.listener
import net.axay.kspigot.main.KSpigot

class InternalMainClass : KSpigot() {
    override fun startup() {
        listener()
    }
}
