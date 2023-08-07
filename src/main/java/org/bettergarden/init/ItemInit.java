package org.bettergarden.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.bettergarden.bettergarden.BetterGarden;
import org.bettergarden.items.organic.LowGrassItem;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterGarden.MODID);

    public static final RegistryObject<BlockItem> Low_grass_BlockItem = ITEMS.register("low_grass", LowGrassItem::new);

}
