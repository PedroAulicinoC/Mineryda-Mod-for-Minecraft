package net.srtobbyas.mineria.world.feature;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.HeightmapPlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures
{
    public static final PlacedFeature ANCIENT_STONE_PLACED = PlacementUtils
            .register("ancient_stone_placed", ModConfiguredFeature.ANCIENT_STONE
                    .placed(ModOrePlacement.commonOrePlacement(30, HeightRangePlacement
                            .triangle(VerticalAnchor.absolute(64), VerticalAnchor.absolute(384)))));

    public static final PlacedFeature SILT_PLACED = PlacementUtils
            .register("silt_placed", ModConfiguredFeature.SILT_BLOCK
                    .placed(ModOrePlacement.commonOrePlacement(25, HeightRangePlacement
                            .uniform(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(0)))));

    public static final PlacedFeature MAGNOLIUM_ORE_PLACED = PlacementUtils
            .register("magnolium_ore_placed", ModConfiguredFeature.MAGNOLIUM_ORE
                    .placed(ModOrePlacement.commonOrePlacement(2, HeightRangePlacement
                            .triangle(VerticalAnchor.absolute(-10), VerticalAnchor.absolute(10)))));

    public static final PlacedFeature FLAMMA_ORE_PLACED = PlacementUtils
            .register("flamma_ore_placed", ModConfiguredFeature.FLAMMA_ORE
                    .placed(ModOrePlacement.commonOrePlacement(10, PlacementUtils.RANGE_10_10)));

    public static final PlacedFeature STEEL_ORE_PLACED = PlacementUtils
            .register("steel_ore_placed", ModConfiguredFeature.STEEL_ORE
                    .placed(ModOrePlacement.commonOrePlacement(5, PlacementUtils.RANGE_10_10)));
}
