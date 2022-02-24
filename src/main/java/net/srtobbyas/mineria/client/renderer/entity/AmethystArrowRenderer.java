package net.srtobbyas.mineria.client.renderer.entity;

import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.srtobbyas.mineria.MineriaMOD;
import net.srtobbyas.mineria.world.entity.projectile.AmethystArrowEntity;

@OnlyIn(Dist.CLIENT)
public class AmethystArrowRenderer extends ArrowRenderer<AmethystArrowEntity>
{
    public AmethystArrowRenderer(EntityRendererProvider.Context context)
    {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(AmethystArrowEntity pEntity)
    {
        Item referenceItem = pEntity.getPickupItem().getItem();
        return new ResourceLocation(MineriaMOD.MOD_ID,"textures/entity/projectiles/amethyst_arrow_entity.png");
    }
}
