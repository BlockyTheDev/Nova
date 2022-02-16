package xyz.xenondevs.nova.network.event

import net.minecraft.network.protocol.Packet
import org.bukkit.entity.Player

abstract class PlayerPacketEvent<P : Packet<*>>(val player: Player, packet: P) : PacketEvent<P>(packet)