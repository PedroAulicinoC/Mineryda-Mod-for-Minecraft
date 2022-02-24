package net.srtobbyas.mineria.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers
{
    public static final ForgeTier AMETHYST = new ForgeTier(3, 1590, 8f,
            2f, 26, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.AMETHYST_BLOCK.asItem()));

    public static final ForgeTier BONE = new ForgeTier(2, 650, 7f,
            3f, 18, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.ANCIENT_BONE.get()));

    public static final ForgeTier ROSE_GOLD = new ForgeTier(2, 250, 12f,
            2f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.COPPER_INGOT.asItem()));

    public static final ForgeTier MAGNOLIUM = new ForgeTier(2, 720, 7.5f,
            2f, 14, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.MAGNOLIUM_INGOT.get()));

    public static final ForgeTier STEEL = new ForgeTier(3, 1761, 8.5f,
            3f, 13, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.STEEL_INGOT.get()));
}
