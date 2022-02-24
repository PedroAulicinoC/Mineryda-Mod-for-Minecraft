package net.srtobbyas.mineria.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.srtobbyas.mineria.MineriaMOD;
import net.srtobbyas.mineria.block.ModBlocks;
import net.srtobbyas.mineria.item.custom.AmethystArrow;
import net.srtobbyas.mineria.item.custom.FlammaBlock;
import net.srtobbyas.mineria.item.custom.FlammaItem;
import net.srtobbyas.mineria.item.custom.PaxelItem;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MineriaMOD.MOD_ID);

    // Amethyst Items

    public static final RegistryObject<Item> AMETHYST_ARROW = ITEMS.register("amethyst_arrow",
            () -> new AmethystArrow(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT),4f));

    public static final RegistryObject<Item> MAGIC_BERRY = ITEMS.register("magic_berry",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_BERRY)));


    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(ModTiers.AMETHYST, 4, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModTiers.AMETHYST, 2, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModTiers.AMETHYST, 2.5f, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ModTiers.AMETHYST, 6, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ModTiers.AMETHYST, -2, 0f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    // Ancient Items

    public static final RegistryObject<Item> ANCIENT_BONE = ITEMS.register("ancient_bone",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ANCIENT_SWORD = ITEMS.register("ancient_sword",
            () -> new SwordItem(ModTiers.BONE, 2, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> ANCIENT_PICKAXE = ITEMS.register("ancient_pickaxe",
            () -> new PickaxeItem(ModTiers.BONE, 0, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> ANCIENT_SHOVEL = ITEMS.register("ancient_shovel",
            () -> new ShovelItem(ModTiers.BONE, 0.5f, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> ANCIENT_AXE = ITEMS.register("ancient_axe",
            () -> new AxeItem(ModTiers.BONE, 5, -3.1f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> ANCIENT_HOE = ITEMS.register("ancient_hoe",
            () -> new HoeItem(ModTiers.BONE, -3, -1f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    //Ancient Armor

    public static final RegistryObject<Item> BONE_HELMET = ITEMS.register("bone_helmet",
            () -> new ArmorItem(ModArmorMaterials.BONE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> BONE_CHESTPLATE = ITEMS.register("bone_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BONE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> BONE_LEGGINGS = ITEMS.register("bone_leggings",
            () -> new ArmorItem(ModArmorMaterials.BONE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> BONE_BOOTS = ITEMS.register("bone_boots",
            () -> new ArmorItem(ModArmorMaterials.BONE, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    // Rose Gold Items

    public static final RegistryObject<Item> ROSE_SWORD = ITEMS.register("rose_sword",
            () -> new SwordItem(ModTiers.ROSE_GOLD, 2, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> ROSE_PICKAXE = ITEMS.register("rose_pickaxe",
            () -> new PickaxeItem(ModTiers.ROSE_GOLD, -1, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> ROSE_SHOVEL = ITEMS.register("rose_shovel",
            () -> new ShovelItem(ModTiers.ROSE_GOLD, -0.5f, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> ROSE_AXE = ITEMS.register("rose_axe",
            () -> new AxeItem(ModTiers.ROSE_GOLD, 4, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> ROSE_HOE = ITEMS.register("rose_hoe",
            () -> new HoeItem(ModTiers.ROSE_GOLD, -2, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    // Magnolium Items

    public static final RegistryObject<Item> MAGNOLIUM_HELMET = ITEMS.register("magnolium_helmet",
            () -> new ArmorItem(ModArmorMaterials.MAGNOLIUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> MAGNOLIUM_CHESTPLATE = ITEMS.register("magnolium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MAGNOLIUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> MAGNOLIUM_LEGGINGS = ITEMS.register("magnolium_leggings",
            () -> new ArmorItem(ModArmorMaterials.MAGNOLIUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> MAGNOLIUM_BOOTS = ITEMS.register("magnolium_boots",
            () -> new ArmorItem(ModArmorMaterials.MAGNOLIUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> MAGNOLIUM_INGOT = ITEMS.register("magnolium_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MAGNOLIUM_NUGGET = ITEMS.register("magnolium_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MAGNOLIUM_RAW = ITEMS.register("magnolium_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MAGNOLIUM_SWORD = ITEMS.register("magnolium_sword",
            () -> new SwordItem(ModTiers.MAGNOLIUM, 3, -2f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> MAGNOLIUM_PICKAXE = ITEMS.register("magnolium_pickaxe",
            () -> new PickaxeItem(ModTiers.MAGNOLIUM, 1, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> MAGNOLIUM_SHOVEL = ITEMS.register("magnolium_shovel",
            () -> new ShovelItem(ModTiers.MAGNOLIUM, 1.5f, -2.6f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> MAGNOLIUM_AXE = ITEMS.register("magnolium_axe",
            () -> new AxeItem(ModTiers.MAGNOLIUM, 6, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> MAGNOLIUM_HOE = ITEMS.register("magnolium_hoe",
            () -> new HoeItem(ModTiers.MAGNOLIUM, -2, -0.6f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> MAGNOLIUM_BERRY = ITEMS.register("magnolium_berry",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.MAGNOLIUM_BERRY)));


    // Copper Items

    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> COPPER_BEETROOT = ITEMS.register("copper_beetroot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.COPPER_BEETROOT)));

    // Steel Items

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> STEEL_RAW = ITEMS.register("steel_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModTiers.STEEL, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModTiers.STEEL, 1, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModTiers.STEEL, 1.5f, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModTiers.STEEL, 5.5f, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModTiers.STEEL, -3, 0f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> STEEL_PAXEL = ITEMS.register("steel_paxel",
            () -> new PaxelItem(ModTiers.STEEL, 1, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    //Flamma

    public static final RegistryObject<Item> FLAMMA_CRYSTAL = ITEMS.register("flamma_crystal",
            () -> new FlammaItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> FLAMMA_BLOCK = ITEMS.register("flamma_block",
            () -> new FlammaBlock(ModBlocks.FLAMMA_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
