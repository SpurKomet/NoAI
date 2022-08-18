package de.spurkomet.noai.noai

import net.axay.kspigot.event.listen
import org.bukkit.entity.Entity
import org.bukkit.entity.EntityType
import org.bukkit.entity.LivingEntity
import org.bukkit.event.entity.CreatureSpawnEvent


fun listener() {
    listen<CreatureSpawnEvent> {
        if (it.entityType == EntityType.BAT){
            it.isCancelled = true
            return@listen
        }
        if (it.spawnReason != CreatureSpawnEvent.SpawnReason.COMMAND){
            when(it.entityType){
                EntityType.CAT -> noAI(it.entity)
                EntityType.CHICKEN -> noAI(it.entity)
                EntityType.COD -> noAI(it.entity)
                EntityType.COW -> noAI(it.entity)
                EntityType.FOX -> noAI(it.entity)
                EntityType.FROG -> noAI(it.entity)
                EntityType.GOAT -> noAI(it.entity)
                EntityType.IRON_GOLEM -> noAI(it.entity)
                EntityType.LLAMA -> noAI(it.entity)
                EntityType.MUSHROOM_COW -> noAI(it.entity)
                EntityType.OCELOT -> noAI(it.entity)
                EntityType.PANDA -> noAI(it.entity)
                EntityType.PIG -> noAI(it.entity)
                EntityType.POLAR_BEAR -> noAI(it.entity)
                EntityType.RABBIT -> noAI(it.entity)
                EntityType.SALMON -> noAI(it.entity)
                EntityType.SHEEP -> noAI(it.entity)
                EntityType.SLIME -> noAI(it.entity)
                EntityType.SNOWMAN -> noAI(it.entity)
                EntityType.SQUID -> noAI(it.entity)
                EntityType.TRADER_LLAMA -> noAI(it.entity)
                EntityType.TROPICAL_FISH -> noAI(it.entity)
                EntityType.TURTLE -> noAI(it.entity)
                EntityType.WOLF -> noAI(it.entity)
                EntityType.ZOMBIFIED_PIGLIN -> noAI(it.entity)
                else -> {return@listen}
            }
        }
    }

}
private fun noAI(entity: Entity){
    (entity as LivingEntity).setAI(false)
}