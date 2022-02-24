package net.srtobbyas.mineria.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.srtobbyas.mineria.MineriaMOD;
import net.srtobbyas.mineria.client.renderer.entity.AmethystArrowRenderer;
import net.srtobbyas.mineria.world.entity.ModEntityType;

@Mod.EventBusSubscriber(modid = MineriaMOD.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber
{
    @SubscribeEvent
    public static void onLoad(EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerEntityRenderer(ModEntityType.AMETHYST_ARROW.get(), AmethystArrowRenderer::new);
    }

}
