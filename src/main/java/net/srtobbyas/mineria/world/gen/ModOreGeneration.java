package net.srtobbyas.mineria.world.gen;

import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.srtobbyas.mineria.world.feature.ModPlacedFeatures;

import java.util.List;
import java.util.function.Supplier;

public class ModOreGeneration
{
    public static void generateOres(final BiomeLoadingEvent event)
    {
        List<Supplier<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(() -> ModPlacedFeatures.ANCIENT_STONE_PLACED);

        base.add(() -> ModPlacedFeatures.SILT_PLACED);

        base.add(() -> ModPlacedFeatures.MAGNOLIUM_ORE_PLACED);

        base.add(() -> ModPlacedFeatures.FLAMMA_ORE_PLACED);

        base.add(() -> ModPlacedFeatures.STEEL_ORE_PLACED);
    }
}
