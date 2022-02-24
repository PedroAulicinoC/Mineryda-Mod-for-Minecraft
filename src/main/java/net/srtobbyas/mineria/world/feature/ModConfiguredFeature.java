package net.srtobbyas.mineria.world.feature;

import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.srtobbyas.mineria.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeature
{
    //Ancient Stone

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ANCIENT_STONE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ANCIENT_STONE.get().defaultBlockState()));

    public static final ConfiguredFeature<?, ?> ANCIENT_STONE = FeatureUtils.register("ancient_stone",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_ANCIENT_STONE, 5)));

    // Silt

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SILT = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILT_BLOCK.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.SILT_BLOCK.get().defaultBlockState()));

    public static final ConfiguredFeature<?, ?> SILT_BLOCK = FeatureUtils.register("silt_block",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_SILT, 20)));

    // Magnolium

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_MAGNOLIUM_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MAGNOLIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.MAGNOLIUM_DEEPSLATE.get().defaultBlockState()));

    public static final ConfiguredFeature<?, ?> MAGNOLIUM_ORE = FeatureUtils.register("magnolium_ore",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_MAGNOLIUM_ORE, 5)));

    // Flamma

    public static final List<OreConfiguration.TargetBlockState> NETHER_FLAMMA_ORE = List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, ModBlocks.FLAMMA_ORE.get().defaultBlockState()));

    public static final ConfiguredFeature<?, ?> FLAMMA_ORE = FeatureUtils.register("flamma_ore",
            Feature.ORE.configured(new OreConfiguration(NETHER_FLAMMA_ORE, 10)));

    //Steel

    public static final List<OreConfiguration.TargetBlockState> NETHER_STEEL_ORE = List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, ModBlocks.STEEL_ORE.get().defaultBlockState()));

    public static final ConfiguredFeature<?, ?> STEEL_ORE = FeatureUtils.register("steel_ore",
            Feature.ORE.configured(new OreConfiguration(NETHER_STEEL_ORE, 5)));
}
