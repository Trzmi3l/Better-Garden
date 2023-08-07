package org.bettergarden.items.organic;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import org.bettergarden.blocks.organic.LowGrass;
import org.bettergarden.init.BlockInit;

public class LowGrassItem extends BlockItem {


    public LowGrassItem() {
        super(BlockInit.LOW_GRASS.get(), new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
    }
}
