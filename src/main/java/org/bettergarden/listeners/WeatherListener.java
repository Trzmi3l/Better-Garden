package org.bettergarden.listeners;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class WeatherListener {

    public WeatherListener() {MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onServerTick(TickEvent.LevelTickEvent event) {
        if(event.level.isRaining()) {
            // TODO: cropy przyspieszaja jesli pada deszcz

            Level world = event.level;
            //BlockPos playerPos = event.world.getClosestPlayer(event.world.getSpawnPoint().getX(), event.world.getSpawnPoint().getY(), event.world.getSpawnPoint().getZ(), -1, false).getPosition();


        }
    }

}
