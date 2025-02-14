package xyz.xenondevs.nova.item.behavior

import de.studiocode.invui.item.builder.ItemBuilder
import net.md_5.bungee.api.chat.BaseComponent
import org.bukkit.entity.Entity
import org.bukkit.entity.Player
import org.bukkit.event.block.Action
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.player.PlayerInteractAtEntityEvent
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.player.PlayerItemBreakEvent
import org.bukkit.inventory.ItemStack
import xyz.xenondevs.nmsutils.network.event.serverbound.ServerboundPlayerActionPacketEvent
import xyz.xenondevs.nova.player.equipment.ArmorEquipEvent

abstract class ItemBehavior {
    
    open fun handleInteract(player: Player, itemStack: ItemStack, action: Action, event: PlayerInteractEvent) = Unit
    open fun handleEntityInteract(player: Player, itemStack: ItemStack, clicked: Entity, event: PlayerInteractAtEntityEvent) = Unit
    open fun handleBreak(player: Player, itemStack: ItemStack, event: PlayerItemBreakEvent) = Unit
    open fun handleEquip(player: Player, itemStack: ItemStack, equipped: Boolean, event: ArmorEquipEvent) = Unit
    open fun handleInventoryClick(player: Player, itemStack: ItemStack, event: InventoryClickEvent) = Unit
    open fun handleInventoryClickOnCursor(player: Player, itemStack: ItemStack, event: InventoryClickEvent) = Unit
    open fun handleInventoryHotbarSwap(player: Player, itemStack: ItemStack, event: InventoryClickEvent) = Unit
    open fun handleRelease(player: Player, itemStack: ItemStack, event: ServerboundPlayerActionPacketEvent) = Unit
    
    open fun modifyItemBuilder(itemBuilder: ItemBuilder): ItemBuilder = itemBuilder
    open fun getName(itemStack: ItemStack): Array<BaseComponent>? = null
    open fun getLore(itemStack: ItemStack): List<Array<BaseComponent>>? = null
    
}