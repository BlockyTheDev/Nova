package xyz.xenondevs.nova.world.region

import xyz.xenondevs.nova.data.config.ValueReloadable
import xyz.xenondevs.nova.tileentity.upgrade.UpgradeHolder
import xyz.xenondevs.nova.tileentity.upgrade.UpgradeType
import java.util.*

class UpgradableRegion internal constructor(
    uuid: UUID,
    private val upgradeHolder: UpgradeHolder,
    private val upgradeType: UpgradeType<Int>,
    minSize: ValueReloadable<Int>,
    private val maxSizeCfg: ValueReloadable<Int>,
    size: Int,
    createRegion: (Int) -> Region
) : DynamicRegion(uuid, minSize, maxSizeCfg, size, createRegion) {
    
    override var maxSize: Int = calculateMaxSize()
        private set
    
    override fun reload() {
        val oldMaxSize = maxSize
        maxSize = calculateMaxSize()
        
        // automatically increase the size to the new maximum if it was at the maximum previously
        if (size == oldMaxSize && maxSize > oldMaxSize)
            size = maxSize
        
        super.reload()
    }
    
    private fun calculateMaxSize(): Int =
        maxSizeCfg.value + upgradeHolder.getValue(upgradeType)
    
}