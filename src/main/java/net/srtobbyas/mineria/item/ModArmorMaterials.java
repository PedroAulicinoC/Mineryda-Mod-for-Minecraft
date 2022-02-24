package net.srtobbyas.mineria.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.util.Lazy;
import net.srtobbyas.mineria.MineriaMOD;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial
{
    BONE("bone", 20, new int[]{2, 5, 6, 3}, 18,
            SoundEvents.ARMOR_EQUIP_GENERIC, 1F, 0.0F, () ->
    {
        return Ingredient.of(ModItems.ANCIENT_BONE.get());
    }),

    MAGNOLIUM("magnolium", 24, new int[]{2, 6, 7, 3}, 11,
            SoundEvents.ARMOR_EQUIP_GOLD, 1F, 0F, () ->
    {
        return Ingredient.of(ModItems.MAGNOLIUM_INGOT.get());
    }),

    STEEL("steel", 35, new int[]{3, 6, 8, 3}, 13,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 2.5F, 0.05F, () ->
    {
        return Ingredient.of(ModItems.STEEL_INGOT.get());
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue,
                      SoundEvent sound, float toughness,
                      float knockbackResistance, Supplier<Ingredient> repairIngredient)
    {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = Lazy.of(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return MineriaMOD.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
