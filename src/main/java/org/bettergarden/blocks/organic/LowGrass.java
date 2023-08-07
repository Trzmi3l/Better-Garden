package org.bettergarden.blocks.organic;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.PlantType;


public class LowGrass extends Block {

    public LowGrass() {

        super(Properties.of().strength(0.6f).sound(SoundType.GRASS).instabreak().noCollission().ignitedByLava());
    }

    //TODO: ZROBIC ZEBY TRAWA WYGLADALA MNIEJ IDENTYCZNIE JAK SIE JA POSTAWI OBOK I ZEBY MIALA ROZNE VARIANTY
    //TODO: NAPRAWIC SZARA TEKSTURE BARDZO LATWO



}
