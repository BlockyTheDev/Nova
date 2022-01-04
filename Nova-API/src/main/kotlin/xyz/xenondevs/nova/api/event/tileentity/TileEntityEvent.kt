package xyz.xenondevs.nova.api.event.tileentity

import org.bukkit.event.Event
import xyz.xenondevs.nova.api.TileEntity

/**
 * A [TileEntity] related event.
 */
abstract class TileEntityEvent(val tileEntity: TileEntity) : Event()