package net.srtobbyas.mineria.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GravelBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.srtobbyas.mineria.MineriaMOD;
import net.srtobbyas.mineria.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MineriaMOD.MOD_ID);

    // Silt Block

    public static final RegistryObject<Block> SILT_BLOCK = registerBlock("silt_block",
            () -> new GravelBlock(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(0.8f).sound(SoundType.GRAVEL)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Ancient Block

    public static final RegistryObject<Block> ANCIENT_STONE = registerBlock("ancient_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Magnolium

    public static final RegistryObject<Block> MAGNOLIUM_ORE = registerBlock("magnolium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> MAGNOLIUM_DEEPSLATE = registerBlock("magnolium_deepslate",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5.5f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> MAGNOLIUM_BLOCK = registerBlock("magnolium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).sound(SoundType.METAL).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> MAGNOLIUM_RAW_BLOCK = registerBlock("magnolium_raw_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Steel

    public static final RegistryObject<Block> STEEL_ORE = registerBlock("steel_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4.5f).sound(SoundType.NETHER_ORE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4.5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> STEEL_RAW_BLOCK = registerBlock("steel_raw_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4.5f).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //Flamma

    public static final RegistryObject<Block> FLAMMA_BLOCK = BLOCKS.register
            ("flamma_block", () -> new Block(BlockBehaviour.Properties.of
                    (Material.AMETHYST).sound(SoundType.AMETHYST).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> FLAMMA_ORE = registerBlock("flamma_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).sound(SoundType.NETHER_ORE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);


    // Helpers

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
