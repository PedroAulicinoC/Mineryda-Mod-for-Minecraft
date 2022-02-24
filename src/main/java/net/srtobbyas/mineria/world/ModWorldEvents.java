package net.srtobbyas.mineria.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.srtobbyas.mineria.MineriaMOD;
import net.srtobbyas.mineria.world.gen.ModOreGeneration;

@Mod.EventBusSubscriber(modid = MineriaMOD.MOD_ID)
public class ModWorldEvents
{
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event)
    {
        ModOreGeneration.generateOres(event);
    }
}
