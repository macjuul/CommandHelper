

package com.laytonsmith.abstraction.bukkit.blocks;

import com.laytonsmith.abstraction.MCMaterialData;
import com.laytonsmith.abstraction.blocks.MCBlockState;
import com.laytonsmith.abstraction.bukkit.BukkitMCMaterialData;
import com.laytonsmith.annotations.WrappedItem;
import org.bukkit.block.BlockState;

/**
 *
 * @author layton
 */
public class BukkitMCBlockState implements MCBlockState {
    
    @WrappedItem BlockState bs;

    public BukkitMCBlockState(BlockState state) {
        this.bs = state;
    }

    public MCMaterialData getData() {
        return new BukkitMCMaterialData(bs.getData());
    }

    public int getTypeId() {
        return bs.getTypeId();
    }
    
}
