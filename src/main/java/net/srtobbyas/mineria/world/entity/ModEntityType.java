package net.srtobbyas.mineria.world.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.srtobbyas.mineria.MineriaMOD;
import net.srtobbyas.mineria.world.entity.projectile.AmethystArrowEntity;

public class ModEntityType
{
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create
            (ForgeRegistries.ENTITIES, MineriaMOD.MOD_ID);


    public static final RegistryObject<EntityType<AmethystArrowEntity>> AMETHYST_ARROW =
            ENTITIES.register("amethyst_arrow", ()-> EntityType.Builder.
                    <AmethystArrowEntity>of(AmethystArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f,0.5f).clientTrackingRange(4).updateInterval(20)
                    .build(new ResourceLocation(MineriaMOD.MOD_ID, "amethyst_arrow")
                            .toString()));

    public static void register(IEventBus eventBus)
    {
        ENTITIES.register(eventBus);
    }
}
