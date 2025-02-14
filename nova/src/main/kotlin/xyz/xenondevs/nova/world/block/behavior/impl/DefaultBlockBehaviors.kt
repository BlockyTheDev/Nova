package xyz.xenondevs.nova.world.block.behavior.impl

import xyz.xenondevs.nova.data.resources.model.config.BrownMushroomBlockStateConfig
import xyz.xenondevs.nova.data.resources.model.config.MushroomStemBlockStateConfig
import xyz.xenondevs.nova.data.resources.model.config.RedMushroomBlockStateConfig
import xyz.xenondevs.nova.world.block.behavior.BlockBehavior

internal object RedMushroomBlockBehavior : BlockBehavior(RedMushroomBlockStateConfig, true)
internal object BrownMushroomBlockBehavior : BlockBehavior(BrownMushroomBlockStateConfig, true)
internal object MushroomStemBlockBehavior : BlockBehavior(MushroomStemBlockStateConfig, true)