package org.bettergarden.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.bettergarden.bettergarden.BetterGarden;
import org.bettergarden.blocks.organic.LowGrass;

public class BlockInit {

        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterGarden.MODID);

        public static final RegistryObject<Block> LOW_GRASS = BLOCKS.register("low_grass", LowGrass::new);



}
